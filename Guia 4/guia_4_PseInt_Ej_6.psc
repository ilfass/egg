// Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide 
// desarrollar un programa que:
// a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra. 
// b) Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una 
//    posición dentro del arreglo, y el programa debe intentar ingresar el carácter en la 
//    posición indicada, si es que hay lugar (es decir la posición está vacía o es un espacio 
//    en blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado, 
//    de lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada. 

Algoritmo guia_4_PseInt_Ej_6
	Definir frase, vector, input Como Caracter
	Definir i, pos Como Entero
	Definir colocado Como Logico
	
	colocado = Falso
	Dimension vector[20]
	Hacer
		Escribir "Ingrese una frase maximo de 20 caracteres:"
		Leer frase
	Mientras Que Longitud(frase) > 20
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		Si Subcadena(frase, i, i) <> "" Entonces
			vector[i] = Subcadena(frase, i, i)
		SiNo
			vector[i] = " "
		FinSi
	Fin Para
	
	Escribir "Ingrese un caracter:"
	Leer input
	Escribir "Ingrese la posicion en el arreglo donde desea colocar:"
	Leer pos
	
	escribirVector(vector, frase)
	Escribir " "
	Si vector[pos] == " " Entonces
		vector[pos] = input
		escribirVector(vector,frase)
	SiNo
		Escribir "La posicion esta ocupada."
	FinSi
FinAlgoritmo
SubProceso escribirVector(vector Por Referencia, frase)
	Definir i Como Entero
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		Si i <> 19 Entonces
			Si i < 10 Entonces
				Escribir Sin Saltar vector[i] " "
			SiNo
				Escribir Sin Saltar vector[i] "  "
			FinSi
		SiNo
			Escribir vector[i]
		FinSi
	Fin Para
	Para i <- 0 Hasta 19 Con Paso 1 Hacer
		Si i <> 19 Entonces
			Escribir Sin Saltar i " "
		SiNo
			Escribir i
		FinSi
	Fin Para
FinSubProceso
