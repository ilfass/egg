//Disponemos de un vector unidimensional de 20 elementos de tipo car�cter. Se pide
//desarrollar un programa que:
//	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
//Ayuda: utilizar la funci�n Subcadena de PSeInt.
//	b) Una vez completado lo anterior, pedirle al usuario un car�cter cualquiera y una
//	posici�n dentro del arreglo, y el programa debe intentar ingresar el car�cter en la
//	posici�n indicada, si es que hay lugar (es decir la posici�n est� vac�a o es un espacio
//	en blanco). De ser posible debe mostrar el vector con la frase y el car�cter ingresado,
//	de lo contrario debe darle un mensaje al usuario de que esa posici�n estaba ocupada.
//Por ejemplo, suponiendo la siguiente frase y los sub�ndices del vector:

Algoritmo ejercicio6
	definir frase, vector Como Caracter
	Definir tamano,i Como Entero
	Escribir "ingrese una frasse"
	Leer frase
	tamano = Longitud(frase)
	Dimension vector(tamano)
	para i= 0 Hasta tamano-1 Con Paso 1 Hacer
		vector(i) = SubCadena(frase,i,i)
		Escribir vector(i) " " Sin Saltar
	

	FinPara
	reemplazar(vector,tamano)
FinAlgoritmo


SubProceso reemplazar (vector Por Referencia,tamano)
	Definir letra,letraValor Como Caracter
	Definir posicion,i Como Entero
	Escribir " "
	Escribir "ingrese un caracter cualquiera"
	leer letra
	Escribir "elija la posici�n donde quiere colocar el caracter"
	leer posicion
	si  posicion < tamano y posicion >=0 Entonces
	si  vector(posicion) = " " Entonces
		vector(posicion) = letra
		para i = 0 Hasta tamano-1 Con Paso 1  Hacer
			Escribir vector(i) " " Sin Saltar
		FinPara
	SiNo
		Escribir "La posici�n ingresada esta ocupada"
	FinSi
FinSi

Escribir "ingreso un numero fuera de rango"
		FinSubProceso
	