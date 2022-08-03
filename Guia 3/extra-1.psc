Funcion divisor <- calculo( num Por Referencia )
	definir divisor, contador Como Entero
	contador=0
	Para divisor=1 Hasta (num-1) 
		si num % divisor==0 y num<> divisor Entonces
			Escribir divisor
			contador = contador + divisor
			
		finSi
		
	Fin Para
	Escribir "la suma es :" contador
Fin Funcion

Algoritmo eje5_guia3
	//	Realizar una función que calcule y retorne la suma de todos los divisores del número n 
	//	distintos de n. El valor de n debe ser ingresado por el usuario.
	Definir num Como Entero
	Escribir "Ingrese un número"
	leer num
	Escribir "el numeor ingresado habia sido" calculo(num)
FinAlgoritmo
