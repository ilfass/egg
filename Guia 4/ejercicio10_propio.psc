//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//los resultados por pantalla
Algoritmo ejercicio10
	definir filas, columnas,matrix Como Entero
	Escribir "ingrese la cantidad de filas"
	leer filas
	Escribir "ingrese la cantidad de columnas"
	leer columnas
	Dimension matrix(filas,columnas)
	llenado(matrix,filas, columnas)
	sumar(matrix,filas, columnas)
FinAlgoritmo

SubProceso llenado(matrix Por Referencia,filas, columnas)
	Definir i,j Como Entero
	Para i=0 Hasta filas-1 Con Paso 1 Hacer
		Para j=0 Hasta columnas-1 Con Paso 1 Hacer
			matrix(i,j) = Aleatorio(0,100)
		FinPara
	FinPara

	Para i=0 Hasta filas-1 Con Paso 1 Hacer
		Para j=0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir matrix(i,j) " "Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso

SubProceso sumar(matrix Por Referencia, filas, columnas)
	Definir suma,i,j Como Entero
	suma=0
	Para i=0 Hasta filas-1 Con Paso 1 Hacer
		Para j=0 Hasta columnas-1 Con Paso 1 Hacer
//			si i < filas-1 y j < columnas-1 Entonces
//				suma=matrix(i,j) + matrix(i+1, j+1)
//				escribir "la suma parcial es: " suma " " Sin Saltar
			//				Escribir ""
			
//			si i=0 y j=0 Entonces
//				suma= matrix(i,j)
			//			SiNo
			si  j < columnas-1 Entonces
				suma = matrix(i,j)+suma
				Escribir "la suma parcial es " suma
				
			SiNo
				suma = matrix(i,j)+suma
			
   			FinSi
			
		FinPara
//		suma = matrix(filas-1,columnas-1) + suma
//		Escribir "la suma total es " suma
//		Escribir ""
	FinPara
	Escribir "la suma total es " suma
FinSubProceso

	