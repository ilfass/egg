//Solicitar al usuario que ingrese dos n�meros enteros y determinar si ambos son pares o
//	impares. Mostrar en pantalla un mensaje que indique "Ambos n�meros son pares" siempre
//	y cuando cumplan con la condici�n. En caso contrario se deber� imprimir el siguiente
//	mensaje "Los n�meros no son pares, o uno de ellos no es par".

Algoritmo parimpar2
	Definir num, num1 Como Entero
	Escribir "ingrese dos numeros enteros"
	Leer num, num1
	
	
		si (num mod 2) = 0 y (num1 mod 2 ) = 0 Entonces
			Escribir "los numeros ingresados son pares"
		SiNo
			
			Escribir "Los n�meros no son pares, o uno de ellos no es par"
				
			FinSi
	
	
FinAlgoritmo