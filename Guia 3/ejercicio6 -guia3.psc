SubProceso Intercambiar(num1 por referencia, num2 por referencia)
	definir aux Como Entero
	aux= num1
	num1= num2
	num2= aux
FinSubProceso

Algoritmo ejercicio
	definir a, b como entero
	escribir "Ingrese dos números"
	leer a
	leer b
	escribir "Usted ingresó como número A:" a " y como número B:" b " Ahora vamos a intercambiarlos"
	Intercambiar(a, b)
	escribir "Ahora número A es " a " y número B es " b
FinAlgoritmo
	