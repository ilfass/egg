//Construir un programa que simule un men� de opciones para realizar las cuatro
//	operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//	num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
//	o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.

Algoritmo menusuma
	Definir opc como caracter
	Definir num1, num2 como entero
	Escribir "Ingrese una opci�n S R M D"
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
