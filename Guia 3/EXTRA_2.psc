//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con
//decimales


Algoritmo sin_titulo
	
	Definir numCadena Como Cadena
	Definir numeroEntero Como Entero
	Escribir "Ingresar un numero de 3 digitos"
	leer numCadena
	numeroEntero = Convertir(numCadena)
	Escribir numeroEntero
	
FinAlgoritmo

Funcion num = Convertir(numCadena)
	Definir num Como Entero
	
	si Longitud(numCadena)<=3
		escribir "Se ingreso un numero Valido"
		num = ConvertirANumero(numCadena)
	SiNo
		Escribir "ingreso un numero no valido."
	FinSi
	
FinFuncion
