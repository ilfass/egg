//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A continuaci�n,
//se debe pedir al usuario que ingrese n�meros enteros situados entre el m�ximo y m�nimo.
//Cada vez que un n�mero se encuentre entre ese intervalo, se sumara uno a una variable.
//El programa terminar� cuando se escriba un n�mero que no pertenezca a ese intervalo, y
//al finalizar se debe mostrar por pantalla la cantidad de n�meros ingresados dentro del
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
