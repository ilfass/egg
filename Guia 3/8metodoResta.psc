//Realizar un procedimiento que permita realizar la división entre dos números y muestre el
//cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 ? 13 = 37 una resta realizada
//		37 ? 13 = 24 dos restas realizadas
//		24 ? 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo sin_titulo
	Definir num1, num2, flg Como Real
	flg = 0
	
	hacer 
		si flg == 1 Entonces
			Escribir 'El segundo numero ingresado debe ser menor que el primero y diferente de 0'
		FinSi
		Escribir 'Ingrese el primer numero:'
		Leer num1
		Escribir 'Ingrese el segundo numero:'
		Leer num2
		flg = 1
	Mientras Que num2 > num1 o num2 == 0
	metodoResta(num1,num2)
	
FinAlgoritmo


SubAlgoritmo metodoResta(num1, num2)
	Definir resto, cociente Como real
	resto = num1 - num2
	cociente = 1
	Mientras resto >= num2
		resto = resto - num2
		cociente = cociente + 1
	FinMientras
	Escribir 'El resto es ', resto
	Escribir 'El cociente es ', cociente
FinSubAlgoritmo
	