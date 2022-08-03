//Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
//formas de pago. El departamento de contabilidad necesita 
//  calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisión
//	b) salario fijo + comisión, y
//	c) salario fijo
//	a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//		realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//		empleado.
//		b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//			hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//			esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//			como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//			del valor de venta total.
//			c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//				hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//				horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la
//				hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene un
//empleado.


Algoritmo sueldosSemanales 
	
	Definir opt como caracter
	Escribir "Ingrese que modalidad de trabajador es: A - comisión, B - salario fijo + comisión, C-salario fijo"
	leer opt
	Segun opt Hacer
		"A":
			escribir "monto total de ventas realizadas en la semana"
			leer montoTotal
			salarioPorc = (montoTotal *40) /100
			
			Escribir "el salario de esta semana es " salarioPorc
		"B":
			escribir "valor que se paga por hora"
			leer valorHora
			escribir "monto total de ventas realizadas en la semana"
			leer montoTotal
			escribir "cantidad de hs trabajadas"
			leer hsTrabajadas
			si hsTrabajadas > 40 Entonces
				hsTrabajadas =40
				montoTotal = montoTotal/4
				escribir "monto total de ventas realizadas en la semana"
				
			FinSi
		"C":
		De Otro Modo:
			Escribir "no ingreso una opción valida"
	FinSegun
	
FinAlgoritmo
