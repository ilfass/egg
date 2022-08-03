//Construir un programa que simule un menú de opciones para realizar las cuatro
//	operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//	numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
//	o ?m? para la multiplicación y ?D? o ?d? para la división.

Algoritmo menusuma
	Definir opc como caracter
	Definir num1, num2 como entero
	Escribir "Ingrese una opción S R M D"
	leer opc
	Escribir "numero 1"
	leer num1
	Escribir "numero2"
	leer num2
	Segun opc Hacer  
		"S","s":
			Escribir "la suma es " num1 + num2
			
		"R","r":
			Escribir  num1 - num2
		"M","m":	
			Escribir  num1 * num2
		"D","d":
			Escribir  num1 / num2
			
	Fin Segun

	
FinAlgoritmo
