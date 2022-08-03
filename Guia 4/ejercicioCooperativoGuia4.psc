Algoritmo ejercicioCooperativoGuia4
	Definir tablero como Cadena
	Dimension tablero[9, 12]
	
	inicializarMatriz(tablero, 9, 12)
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	acomodarPalabras(tablero,9,12)
	imprimirMatriz(tablero, 9, 12)
	
	
FinAlgoritmo

//Agregar pablabra
SubProceso agregarPalabra(tablero,palabra,row)
	Definir colum Como Entero
	Para colum<-0 Hasta Longitud(palabra)-1 Hacer
		tablero[row,colum] = Subcadena(palabra,colum,colum)
	Fin Para
	
FinSubProceso

//imprimir matriz
SubProceso imprimirMatriz(tablero por referencia,fila,columna)
	Definir i,j Como Entero
	Para i=0 Hasta 8 Con Paso 1 Hacer
		Para j=0 Hasta 11 Con Paso 1 Hacer
			Escribir " " tablero(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso

//inicializarMatriz
SubProceso inicializarMatriz (tablero,fila,columna )
	Definir i,j Como Entero
	Para i=0 Hasta fila-1 Con Paso 1 Hacer
		Para j=0 Hasta columna-1 Con Paso 1 Hacer
			tablero[i,j]="*"
		Fin Para
	Fin Para
FinSubProceso



Funcion return <- buscarR ( tablero Por Referencia, i,columna) //Recibe la Matriz y el número de fila. Retorna el número de la columna donde se encuentra R
	
	Definir j, return ,cont Como Entero;
	cont=0
	para j=0 Hasta columna-1
		
		si tablero[i,j]='r'
			j=columna-1
		SiNo
			cont=cont+1
		FinSi
		
		
	FinPara
	Escribir cont
	return=cont
	
	
	
	
Fin Funcion


//acomodarpralabras
SubProceso acomodarPalabras(matriz Por Referencia,fila,columna)
	definir i,j,m,posicion,mover,cont como entero
	Definir nuevamatriz Como Caracter
	Dimension nuevamatriz(fila,columna)
	Para i=0 Hasta fila-1 Hacer
		posicion=buscarR(matriz,i,columna)
		para j=0 Hasta columna-1 Hacer
			nuevamatriz(i,j)= matriz(i,j)
		FinPara
		
	si posicion = 5 Entonces
		para j=0 Hasta columna-1 Hacer
			matriz(i,j)= matriz(i,j)
		FinPara
		Escribir "entro con el 5"
		//imprimirMatriz(matriz, 9, 12)
	FinSi
	
	si posicion < 5 Entonces
		cont=0
		Escribir "entro aca"
		mover = 5 - posicion
	//	para i=0 Hasta fila-1 Hacer
			//para j=0 Hasta columna-1 Hacer
		para m=mover Hasta columna-1 Hacer
			matriz(i,m) = nuevamatriz(i,cont)
			cont=cont+1
			
			para j=0 Hasta mover-1 Hacer
				matriz(i,j) ="*"
			FinPara
		//FinPara
	FinPara
	//FinPara
	// imprimirMatriz(nuevamatriz, 9, 12)
FinSi

	si posicion > 5 Entonces
		Escribir "entro con el mayor a 5"
		mover = posicion - 5
		para m=mover Hasta columna-1 Hacer
			matriz(i,m) = nuevamatriz(i,cont)
			cont=cont+1
		FinPara
	
	//imprimirMatriz(matriz, 9, 12)
	FinSi

	
FinPara
	
//	Dimension auxVec[columna]
//	para j=0 Hasta columna
//		auxVec[j]="*"
//	FinPara
//	para i=0 Hasta fila-1
//		para j=0 Hasta columna-1
//			mover=buscarR(matriz,i)
//			matriz[i,j]=auxVec[j+mover]
//			
//			
//		FinPara
//		para j=0 Hasta columna-1
//			matriz[i,j]=auxVec[j]
//		FinPara
//	FinPara
	
FinSubProceso
