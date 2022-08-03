Funcion retorno <- fibonacci ( n )
	Definir retorno,a,b,c,x Como Entero
	
	a = 0
	b = 1
	
	Para x<-0 Hasta n Con Paso 1 Hacer
		retorno = a
		c = a
		a = a + b
		b = c
	Fin Para
	
Fin Funcion

Algoritmo ejercicio_17
	Definir n Como Entero
	
	Escribir "Indicar la cantidad de n numero para la serie:" Sin Saltar
	leer n
	
	Escribir fibonacci(n)
	
FinAlgoritmo
