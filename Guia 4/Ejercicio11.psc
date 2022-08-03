//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//	subproceso para imprimir la matriz.

Algoritmo Ejercicio11
	
	Definir matrix Como Entero
	Dimension matrix(4,4)
	rellenar(matrix)
	mostrarmatriz(matrix)
FinAlgoritmo

SubProceso rellenar(matrix)
	Definir i,j Como Entero
	Para i=0 Hasta 3 Hacer
		Para j=0 Hasta 3 Hacer
		matrix(i,j)=Aleatorio(0,10)
		FinPara
	FinPara
	
FinSubProceso

SubProceso mostrarmatriz(matrix)
	Definir i,j Como Entero
	Para i=0 Hasta 3 Con Paso 1 Hacer
		Para j=0 Hasta 3 Con Paso 1 Hacer
			si i==j Entonces
				matrix(i,j) =0
			FinSi
			Escribir matrix(i,j) " "Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso

	