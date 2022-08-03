//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.

Algoritmo cinco
	Definir num, max, min Como Entero
	Definir contador, acom, prom  Como Real
	contador = 0
	acom = 0
	leer max
	leer min
	Repetir
		Escribir "ingrese un numero y si coloca 0 Saldrá del programa"
		Leer num
		
		si num > max Entonces
			max = num
			
		FinSi
		si num < min y num <> 0 Entonces
			min = num
			
		FinSi
		
		si  num <> 0 Entonces
		contador = contador + 1
		acom = acom + num
	     FinSi
		 

		 
		
	Mientras Que num <> 0
	prom = acom / contador
	Escribir "el minimo es " min
	Escribir "el maximo es " max
	Escribir "el promedio es: " prom	 
	
	
FinAlgoritmo
