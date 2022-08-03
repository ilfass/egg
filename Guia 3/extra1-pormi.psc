Funcion retorno <- suma(unValor)
	Definir retorno, i, contador como entero
	contador=0

	Para i=1 Hasta unValor Con Paso 1 Hacer
		si unValor mod i == 0 
		contador = contador + i 
		FinSi
	Fin Para
Fin Funcion

//Realizar una función que calcule y retorne la suma de todos los divisores del número n
//distintos de n. El valor de n debe ser ingresado por el usuario.


Algoritmo SumaDeTodosDivisores
	Definir n Como Entero
	Escribir "ingrese el valor de N"
	leer n
	Escribir "la suma es " suma(n)
FinAlgoritmo


