//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.

Algoritmo ejercicio8
	definir i,x,valores,matrix Como Entero
	Dimension matrix(3,3)
	
	
	para i=0 hasta 2 Con Paso 1 hacer
		
		Para x=0 hasta 2 Con Paso 1 Hacer
			
			Escribir "ingresar los numeros"
			leer valores
			
			matrix(i,x) =valores	
		FinPara
	FinPara
	
	Para i=0 Hasta 2 Hacer
		
		Para x=0 Hasta 2 Hacer
			
			escribir matrix(i,x) Sin Saltar
			
		FinPara
		Escribir " "
	FinPara
FinAlgoritmo
