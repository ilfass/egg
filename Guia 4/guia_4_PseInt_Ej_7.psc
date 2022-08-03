// Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después, 
// hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La 
// función debe devolver el resultado de está validación, para mostrar el mensaje en el algoritmo. 
// Nota: recordar el uso de las variables de tipo lógico.

Algoritmo guia_4_PseInt_Ej_7
	Definir i, vector1, vector2, tamanio Como Entero
	Definir iguales Como Logico
	
	Escribir "Ingrese el tamanio de los arreglos:"
	Leer tamanio
	
	Dimension vector1[tamanio], vector2[tamanio]
	rellenarArreglos(vector1, vector2, tamanio)
	iguales = sonIguales(vector1, vector2, tamanio)
	Escribir "Los arreglos son iguales: " iguales
	
FinAlgoritmo
SubProceso rellenarArreglos(vector1 Por Referencia, vector2 Por Referencia, tamanio)
	Definir i  Como Entero
	Para i <- 0 Hasta tamanio - 1 Con Paso 1 Hacer
		vector1[i] = azar(9)
	Fin Para
	Para i <- 0 Hasta tamanio - 1 Con Paso 1 Hacer
		vector2[i] = azar(9)
	Fin Para
FinSubProceso
Funcion retorno = sonIguales(vector1 Por Referencia, vector2 Por Referencia, tamanio)
	Definir i, contador Como Entero
	Definir retorno Como Logico
	
	contador = 0
	Para i <- 0 Hasta tamanio - 1 Con Paso 1 Hacer
		Si vector1[i] == vector2[i] Entonces
			contador = contador + 1
		FinSi
	Fin Para
	Si contador == (tamanio - 1) Entonces
		retorno = Verdadero
	SiNo
		retorno = Falso
	FinSi
FinFuncion
	