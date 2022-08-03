SubProceso  mostrararray( vector Por Referencia, n)
	Definir i Como Entero
	para i=0 Hasta n Hacer
		Escribir vector(i) " " Sin Saltar
		Escribir "" Sin Saltar
	FinPara
FinSubProceso



//SubProceso  llenado(n)
//	definir vector,num Como Entero
//	Dimension vector(6)
//	Para i=0 Hasta n Hacer
//		escribir "ingrese in numero para la posicion " i
//		leer vector(i)
//		
//	FinPara
//	
//FinSubProceso
SubProceso posicion (vector,n)
	Definir i,j,num,contador,ub,msj Como Entero
	contador=0
	ub=0
	msj=0
	Escribir "ingrese el valor que desea buscar"
	leer num
	Para i=0 Hasta n Hacer
		Si num == vector(i)  Entonces
			si msj = 0 	Entonces
			Escribir "la ubicación es " ub Sin Saltar
			msj= msj+1
		
	    SiNo
			Escribir " y " ub
	    FinSi	
		SiNo
			contador = contador + 1
		Fin Si
		si contador = n+1 Entonces
			Escribir " el numero ingresado no esta dentro del arreglo"
		FinSi
		ub = ub +1
	FinPara	
FinSubProceso



//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar
//también debe ser ingresado por el usuario).
//El programa debe indicar la posición donde se
//encuentra el valor. En caso que el número se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo Ejercicio3
	definir vector,num,n,i Como Entero
	n=4
		Dimension vector(5)
		Para i=0 Hasta n Hacer
			escribir "ingrese in numero para la posicion " i
			leer vector(i)
			Escribir ""
		FinPara
	
	//llenado(n)
		mostrararray(vector, n)
		posicion(vector,n)
FinAlgoritmo


