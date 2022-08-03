
//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
//	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.

Algoritmo ejercicio4

	Definir n, arregloA, arregloB,vectorsuma,vectorresta Como entero
	Definir opciones, opcionVector Como Caracter
	
	Escribir "ingrese el tamaño del array"
	leer n
	
	Dimension arregloA(n),arregloB(n),vectorsuma(n),vectorresta(n)
Borrar Pantalla
	Escribir "elegir una opción del menu"
	leer opciones
	opciones= Mayusculas(opciones)
	Segun opciones Hacer
		"A":
			llenarvector(arregloA, n)
			mostrararray(arregloA, n)
		"B":
			llenarvector(arregloB, n)
			mostrararray(arregloB, n)
		"C":
			llenarvector(arregloA, n)
			llenarvector(arregloB, n)
			sumaVectores(arregloA, arregloB,vectorsuma,n)
			mostrararray(arregloA, n)
			Escribir ""
			mostrararray(arregloB, n)
			Escribir ""
			mostrararray(vectorsuma, n)
			
		"D":
			llenarvector(arregloA, n)
			llenarvector(arregloB, n)
			restaVectores(arregloA, arregloB,vectorresta, n)
			mostrararray(arregloA, n)
			Escribir ""
			mostrararray(arregloB, n)
			Escribir ""
			mostrararray(vectorresta, n)
		"E":
			llenarvector(arregloA, n)
			llenarvector(arregloB, n)
			sumaVectores(arregloA, arregloB,vectorsuma,n)
			escribir "elija si quiere mostrar el vector A, B o C"
			leer opcionVector
			opcionVector= Mayusculas(opcionVector)
			Segun opcionVector Hacer
				"A":
					mostrararray(arregloA, n)
				"B":
					mostrararray(arregloB, n)
				"C":
					mostrararray(vectorsuma, n)
				De Otro Modo:
					Escribir "No elegió ninguna de las opciones disponibles"
			Fin Segun
		"F":
						
		De Otro Modo:
			Escribir "No elegió ninguna de las opciones disponibles"
	Fin Segun
FinAlgoritmo



SubProceso  llenarvector(arreglo Por Referencia,n)
	Definir i, numaleatorio Como Entero
	Para i=0 Hasta n-1 Hacer
		arreglo(i) = Aleatorio(0,100)	
	FinPara
FinSubProceso




SubProceso  mostrararray(vector Por Referencia, n)
	Definir i Como Entero
	para i=0 Hasta n-1 Hacer
		Escribir vector(i) " " Sin Saltar
		Escribir "" Sin Saltar
	FinPara
FinSubProceso

//SubProceso copiarvector(n)
//	Definir nuevovector Como Entero
//	Dimension nuevovector(n)
//	nuevovector(n-1)=llenarvector(n)
//	mostrararray(vector, n)
//		FinSubProceso
//		

SubProceso sumaVectores (vector1 Por Referencia,vector2 Por Referencia,vectorsuma Por Referencia,n)
	Definir i Como Entero
	Para i=0 Hasta  n-1 Hacer
		vectorsuma(i)= vector1(i) + vector2(i)
	FinPara
FinSubProceso


SubProceso restaVectores (vector1 Por Referencia,vector2 Por Referencia,vectorresta Por Referencia,n)	
	Definir i Como Entero
	Para i=0 Hasta  n-1 Hacer
		vectorresta(i)= vector1(i) - vector2(i)
	FinPara
FinSubProceso