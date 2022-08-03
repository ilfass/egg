Funcion retorno <- factorial ( num )
	Definir retorno,i Como Entero
	
	retorno = 1
	
	Para i<-1 Hasta num Hacer
		retorno = i * retorno
	Fin Para
	
Fin Funcion

Funcion retorno <- numeroCombinatorio ( numerador,denominador )
	Definir retorno Como Entero

	retorno = factorial(numerador)/(factorial(denominador)*factorial(numerador-denominador))
	
Fin Funcion

Algoritmo ejercicio_19
	Definir numerador, denominador Como Entero
	
	Hacer
		Escribir "Ingrese un numerador: "
		leer numerador
		
		Escribir "Ingrese un demonidador: "
		leer denominador
		
		Si numerador == 0 o numerador > denominador Entonces
			Escribir "El demoninador tiene que ser diferente de 0 y menor que el numerador."
		FinSi
		
	Mientras Que denominador == 0 o numerador < denominador 
	
	Escribir numeroCombinatorio(numerador,denominador)
	
FinAlgoritmo
