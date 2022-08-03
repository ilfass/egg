Algoritmo sin_titulo
	
	Definir m, n, combinacion como entero
	
	Escribir "Ingrese dos numero para buscar las combinaciones  "
	leer m, n
	combinacion = ( factorial(m) ) / (factorial(n) * factorial( m - n ) )
	
	Escribir  " Cantidad de combinaciones entre " m " y " n " es " combinacion
	
FinAlgoritmo

Funcion fact <- factorial(num)
	Definir fact Como Entero
	si(num == 1)
		fact = 1
	SiNo
		fact = factorial(num -1) * num 
	FinSi
FinFuncion

//3 =  3 * 2 * 1 = 6
//4 = 4 * 3 * 2 * 1 = 24