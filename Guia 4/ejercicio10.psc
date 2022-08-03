SubAlgoritmo ImprimirMatriz (matriz Por Referencia,n,m)
	
	Definir i,j Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i,j] " "
		Fin Para
		Escribir ""
	Fin Para
	Escribir ""
FinSubAlgoritmo

SubAlgoritmo llenarMatriz (matriz Por Referencia,n,m)
	Definir i,j Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			 matriz[i,j] = Aleatorio(1,5)
		 Fin Para
		 
	Fin Para

FinSubAlgoritmo

SubAlgoritmo sumarMatriz (matriz Por Referencia,n,m,suma por referencia)
	Definir i,j Como Entero
	
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			suma= suma + matriz[i,j]
		Fin Para
		
	Fin Para
	
FinSubAlgoritmo

Algoritmo sin_titulo
	
	Definir matriz,n,m,suma Como Entero
	suma=0
	
	Escribir "Ingrese n (filas)"
	Leer n
	
	Escribir "Ingrese m (columnas)"
	Leer m
	
	Dimension matriz(n,m)
	
	llenarMatriz(matriz,n,m)
	sumarMatriz(matriz,n,m,suma)
	
	Escribir "La suma total es de: " suma
	
	ImprimirMatriz(matriz,n,m)
	
FinAlgoritmo