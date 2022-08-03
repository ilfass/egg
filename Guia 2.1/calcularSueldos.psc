//Realiza un programa que sólo permita introducir los caracteres ?S? y ?N?. Si el usuario
//	ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que
//	diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".

Algoritmo calcularSueldos
	definir letra Como Caracter
	
	escribir " introducir los caracteres S o N."
	leer letra
	Si letra = "S" o letra = "N" Entonces
		Escribir  "correcto"
	SiNo
		Escribir "incorrecto"
	Fin Si
	
FinAlgoritmo
