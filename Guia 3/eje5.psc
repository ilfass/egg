///Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
///primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
///3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD
Funcion ne <- primo( num )
	Definir ne Como Logico
	Definir i Como Entero
	i=num-1
	ne=Falso
	Mientras ne==Falso y i>1 Hacer
		
		si (num mod i) =0
			ne=Verdadero
		FinSi
		i=i-1
	Fin Mientras
Fin Funcion

Algoritmo algo
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	Escribir primo(num)
FinAlgoritmo
	