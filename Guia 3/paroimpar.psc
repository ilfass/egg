Funcion retorno <- parimpar ( num1 )
	definir retorno como logico
	retorno = (num1 mod 2 <> 0)
	
Fin Funcion

//Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener
//	mensajes que digan si es par o no, eso debe pasar en el Algoritmo.


Algoritmo paroimpar
	Definir valor1 Como Entero
	
	Escribir "ingrese un nro"
	Leer valor1
	
	si (parimpar(valor1)) Entonces
		Escribir "El numero es impar"
	SiNo
		Escribir "El numero es par"
	FinSi
	
FinAlgoritmo


