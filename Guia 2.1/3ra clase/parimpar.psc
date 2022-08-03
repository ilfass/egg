//Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
//En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni impar".
//Nota: investigar la función mod de PSeInt

Algoritmo parimpar
	Definir num Como Entero
	Escribir "ingrese un numero entero"
	Leer num

	si num = 0 Entonces
		Escribir " Usted ingreso un cero"
sino
	
	si num mod 2 = 0 Entonces
		Escribir "el num ingresado es par"
	SiNo
		si num mod 2 <> 0 Entonces
			Escribir "el num ingresado es impar"

		FinSi
	FinSi
	FinSi
	
FinAlgoritmo
