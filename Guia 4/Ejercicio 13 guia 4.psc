Algoritmo eje13_resuelto
Definir matriz, filas, columnas, colum, f, c, vectorSumaFilas, vectorSumaColumnas, sumaD1, sumaD2, error como entero
Definir cuadrada como logico
	
	cuadrada=Falso
	sumaD1=0
	sumaD2=0
	error=0
	Hacer
		Escribir "Ingrese el tamaño de la matriz mayor a 0 (cero) y menor a 10 (diez)"
		leer filas
	Mientras Que filas<1 o filas>9	
	columnas=filas
	
	Dimension matriz[filas,columnas]
	Dimension vectorSumaFilas[filas]
	Dimension vectorSumaColumnas[columnas]
	
	LLENAR_CON_0(vectorSumaFilas, filas)
	LLENAR_CON_cero(vectorSumaColumnas, columnas)
	
	Escribir "A continuación deberá ingresar ", columnas*filas , " números del 1 al 9"
	
	Para f=0 hasta filas-1 Hacer
		para c=0 hasta columnas-1 Hacer
			hacer
				si error=1
					Escribir "El número debe ser mayor a 0 y menor que 10"
				FinSi
				leer Matriz[f,c]
				error=1
			mientras que Matriz[f,c]<1 o Matriz[f,c]>9
			error=0
		FinPara
	FinPara
	///SUMAR FILAS y COLUMNAS
	Para f=0 hasta filas-1 Hacer
		para c=0 hasta columnas-1 Hacer
			vectorSumaFilas[f]=vectorSumaFilas[f]+matriz[f,c]  // vectorSumaFilas[filas]
			//vectorSumaFilas[0]=vectorSumaFilas[0]+matriz[f,c] (2)+(7)+(6)=15 -> vectorSumaFilas[0]
			//vectorSumaFilas[1]=vectorSumaFilas[1]+matriz[f,c] (2)+(7)+(6)=15 -> vectorSumaFilas[1]
			//vectorSumaFilas[2]=vectorSumaFilas[2]+matriz[f,c] (2)+(7)+(6)=15 -> vectorSumaFilas[2]
			vectorSumaColumnas[f]=vectorSumaColumnas[f]+matriz[c,f]
		FinPara		
	FinPara
	///SUMA DIAGONAL 1
	para f=0 hasta columnas-1 Hacer
		sumaD1=sumaD1+matriz[f,f]
		
	FinPara
	///SUMA DIAGONAL 2
	colum=columnas-1
	para f=0 hasta columnas-1 Hacer
		sumaD2=sumaD2+matriz[colum,f]
		colum=colum-1
	FinPara
	
	para f=0 hasta filas-1 Hacer
		si vectorSumaFilas[f]<>vectorSumaColumnas[f] o vectorSumaFilas[f]<>sumaD1 o vectorSumaFilas[f]<>sumaD2
			Escribir "Matriz mágica = " Sin Saltar
			f=filas-1
		SiNo
			cuadrada=verdadero
		FinSi
	FinPara
	
	Escribir cuadrada
	si cuadrada=Verdadero
		Escribir "La matriz es mágica"
		IMPRIMIR_MATRIZ_2D(Matriz,filas,columnas)
		
	FinSi
FinAlgoritmo
subproceso IMPRIMIR_MATRIZ_2D(Matriz,filas,columnas)
	definir i,j Como Entero
	para i=0 hasta filas-1
		para j=0 hasta columnas-1
			Escribir sin saltar "[",Matriz[i,j],"]"
		FinPara
		escribir ""
	FinPara
FinSubProceso

SubProceso LLENAR_CON_0(vectorSumaFilas por referencia,filas)
	definir i Como Entero
	Para i=0 hasta filas-1
		vectorSumaFilas[i]=0
	FinPara
FinSubProceso

SubProceso LLENAR_CON_cero(vectorSumaColumnas por referencia,columnas)
	definir i Como Entero
	Para i=0 hasta columnas-1
		vectorSumaColumnas[i]=0
	FinPara
FinSubProceso