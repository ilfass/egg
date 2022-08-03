SubAlgoritmo ImprimirMatriz (matriz Por Referencia,dim)
	
	Definir i,j Como Entero
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		
		Para j<-0 Hasta dim-1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i,j] " "
		Fin Para
		Escribir ""
	Fin Para
	Escribir ""
FinSubAlgoritmo

Algoritmo sin_titulo
	
	Definir i,j,matriz,num,dim Como Entero
	Definir cumplio Como Logico
	
	Dimension matriz(5,5)
	dim=5
	cumplio=Falso
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		
		Para j<-0 Hasta 4 Con Paso 1 Hacer
			matriz[i,j] = Aleatorio(1,4)
		Fin Para
	Fin Para
	
	Escribir "Ingrese valor a buscar"
	Leer num
	
	ImprimirMatriz(matriz,dim)
	
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		
		Para j<-0 Hasta 4 Con Paso 1 Hacer
			Si num= matriz(i,j)
				Escribir i " , " j
				cumplio=Verdadero
			FinSi
		Fin Para
	Fin Para
	
	Si cumplio = Falso
		Escribir "No se encontro el numero"
	FinSi
	
	
FinAlgoritmo