//Escriba un programa que solicite dos números enteros (mínimo y máximo). A continuación,
//se debe pedir al usuario que ingrese números enteros situados entre el máximo y mínimo.
//Cada vez que un número se encuentre entre ese intervalo, se sumara uno a una variable.
//El programa terminará cuando se escriba un número que no pertenezca a ese intervalo, y
//al finalizar se debe mostrar por pantalla la cantidad de números ingresados dentro del
//intervalo.

Algoritmo Extras_2
	Definir numMin, numMax, numgral, cont Como Entero
	Escribir "dos numeros enteros"
	Leer numMin, numMax
	Escribir "ingrese numeros enteros para ver si caen dentro del intervalo"
	leer numgral
	cont=0
	
	Mientras numgral> numMin y numgral<numMax Hacer
		cont = cont +1
		Escribir "ingrese otro entero para ver si caen dentro del intervalo"
		Leer numgral
	FinMientras
	Escribir "Se ingresaron " cont " num dentro del intervalo"
FinAlgoritmo
