//Una empresa tiene personal de distintas �reas con distintas condiciones de contrataci�n y
//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisi�n
//	b) salario fijo + comisi�n, y
//	c) salario fijo

//	a) Para la modalidad salario por comisi�n se debe ingresar el monto total de las ventas
//		realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//		empleado.

//   b) Para la condici�n de salario fijo + comisi�n, se debe ingresar el valor que se paga por
//			hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//			esa semana. En este tipo de contrato las horas extras no est�n contempladas y se fija
//			como m�ximo 40 horas por semana. La comisi�n por las ventas se calcula como 25%
//			del valor de venta total.

//	c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//				hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//				horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la
//				hora. Realizar un men� de opciones para poder elegir el tipo de contrato que tiene un
//empleado.

Algoritmo sueldoEmpleados
	definir salario ,monto ,precio,horas, horasextra como real 
	Definir op Como Caracter
	escribir  "Ingrese una opcion : a) comision , b) salario fijo + comisi�n, c) salario fijo"
	leer op 
	op = Mayusculas (op)
	Segun  op Hacer
		"A" :
			Escribir  "Ingresar monto total de ventas de esa semana  : "
			leer monto 
			salario = monto*0.40
			Escribir "El salario es : ",salario
		"B" : 
			Escribir  "Ingresar el valor por hora " 
			leer precio 
			Escribir  "Ingresar monto total de esa semana  : "
			leer monto 
			Escribir  "Ingresar  cant de horas trabajadas   : "
			leer horas 
			si horas >= 40 Entonces
				horas = 40
				salario = (horas*precio) + (monto *0.25)
			SiNo
				si horas >= 1 Entonces
					salario = (horas*precio) + (monto *0.25)
					Escribir "El salario es de" salario
				SiNo
					Escribir "Puso una hora no valida"
				FinSi
				
			FinSi
		 "C": 
			Escribir  "Ingresar el valor por hora " 
			leer precio 
			Escribir  "Ingresar  cant de horas trabajadas   : "
			leer horas 
			si horas > 40 Entonces
				horasextra = horas -40 
				salario =  (horas*precio) + (horasextra*precio*0.5)
				Escribir  "El salario es " salario
			SiNo
				salario =  (horas*precio)
				Escribir  "El salario es " salario
			FinSi
			
	FinSegun
		
FinAlgoritmo
