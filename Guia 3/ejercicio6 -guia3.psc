SubProceso Intercambiar(num1 por referencia, num2 por referencia)
	definir aux Como Entero
	aux= num1
	num1= num2
	num2= aux
FinSubProceso

Algoritmo ejercicio
	definir a, b como entero
	escribir "Ingrese dos n�meros"
	leer a
	leer b
	escribir "Usted ingres� como n�mero A:" a " y como n�mero B:" b " Ahora vamos a intercambiarlos"
	Intercambiar(a, b)
	escribir "Ahora n�mero A es " a " y n�mero B es " b
FinAlgoritmo
	