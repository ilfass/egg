//Escribir una función recursiva que devuelva la suma de los primeros N enteros.
Algoritmo sumaTotalHstaN
	Definir num Como Entero
	Escribir 'Ingrese un numero entero:'
	Leer num
	Escribir suma_totalhastaN(num)
FinAlgoritmo


Funcion resultado <- suma_totalhastaN(num)
	Definir resultado Como entero
	si num > 0 Entonces
		resultado = num + suma_totalhastaN(num-1)
	FinSi
FinFuncion
	