//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
Algoritmo Ejercicio9
	
	Definir i,j, matrix,num,bandera Como Entero
	bandera=0
	dimension matrix(5,5)
	
	Para i=0 Hasta 4 Con Paso 1 Hacer
		
		Para j=0 Hasta 4 Con Paso 1 Hacer
			
			matrix(i,j) = Aleatorio(0,26)
		FinPara
	FinPara
	
	Escribir "ingrese el numero que quiere buscar"
	leer num
	Para i=0 Hasta 4 Con Paso 1 Hacer
		
		Para j=0 Hasta 4 Con Paso 1 Hacer
			
			Escribir matrix(i,j) " " Sin Saltar
			
		FinPara
		Escribir ""
	FinPara
	
	
	Para i=0 Hasta 4 Con Paso 1 Hacer
		
		Para j=0 Hasta 4 Con Paso 1 Hacer
			
	si matrix(i,j) = num Entonces
		escribir "la fila es " i " y la columna es " j
	SiNo
		bandera = bandera + 1
	FinSi
FinPara
FinPara

si bandera = 25 Entonces
	escribir " el numero no estaba"
FinSi
FinAlgoritmo
