//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//	es una ?A?. Si la primera letra es una ?A?, se deberá de imprimir un mensaje por pantalla
//	que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota:
//		investigar la función Subcadena de PseInt.


Algoritmo sin_titulo
	Definir frase como cadena
	Escribir "Escribir una frase"
	Leer  frase
	
	si subcadena(frase,0,0)= Subcadena(frase,Longitud(frase)-1,Longitud(frase)) Entonces
		Escribir "CORRECTO"
		
	SiNo
		Escribir "INCORRECTO"
	FinSi
FinAlgoritmo
