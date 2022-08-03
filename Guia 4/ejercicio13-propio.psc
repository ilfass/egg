//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
//	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
//			sea mágica escribir la suma. Además, el programa deberá comprobar que los números
//			introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
//			matriz que no debe superar orden igual a 10.

Algoritmo ejercicio13
	Definir filas, columnas, matrix Como Entero
	
	Hacer
		Escribir "ingresar las filas y columnas de la matriz para que sea cuadrada maximo orden 10"
		leer filas
		leer columnas
		
		si filas == columnas y filas <4 y columnas <4 
			Dimension matrix(filas, columnas)
			llenado(matrix,filas,columnas)
			mostrarse(matrix,filas,columnas)
			sumarfila(matrix,filas,columnas) 
		FinSi
		
	Mientras Que filas <> columnas o filas >3 o columnas >3 
	
FinAlgoritmo


SubProceso llenado(matrix Por Referencia,filas,columnas)
	Definir i,j,valores,contador Como Entero
	//	Escribir "ingresar el primer valor entre 1 y 9"
	//	leer valores
	contador= 1
	Para i=0 Hasta filas-1 Hacer
		Para j=0 Hasta columnas-1 Hacer
			
			Escribir "ingrese el " contador "º numero entre el 1 y el 9"
			leer valores
			si valores >0 y valores<10 Entonces	
				matrix(i,j)= valores
			SiNo				
				Repetir
					Escribir "sos o te haces, el num debe estar entre 1 y 9"
					leer valores
				Mientras Que  valores <0 o valores>10 	
				matrix(i,j)= valores				
			FinSi
			contador=contador +1
		FinPara	
	FinPara
FinSubProceso

SubProceso mostrarse(matrix,filas,columnas)
	Definir i,j Como Entero
	Para i=0 Hasta filas-1 Con Paso 1 Hacer
		Para j=0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir matrix(i,j) " "Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso sumarfila(matrix,filas,columnas) 
	Definir i,j,sumador, sumador1 Como Entero
	Definir flag Como Logico
	Dimension sumador(columnas)
	Dimension sumador1(columnas)
			Para i=0 Hasta filas-1 Hacer
				sumador(i)= 0
				sumador1(i)= 0
						Para j=0 Hasta columnas-1 Hacer
						sumador(i) = sumador(i) + matrix(i,j)
						Escribir sumador(i)Sin Saltar "hola "
							
								Para j=1 Hasta columnas-1 Hacer
									sumador1(i) = sumador1(i) + matrix(i,j)
									Escribir sumador1(i)Sin Saltar "chau "
								FinPara
								flag=falso
								si sumador(i) = sumador1(i) Entonces
									flag=Verdadero
								SiNo
									
								FinSi
						FinPara
				Escribir ("")
				FinPara
		
		
		
	FinSubProceso
	