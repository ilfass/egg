Algoritmo fraseConEspacio
	Definir i,LongitudPalabra Como Entero
	Definir frase Como Caracter
	Escribir 'Ingrese una frase:'
	Leer frase
	Para i <- 0  Hasta Longitud(frase)-1 Con Paso 1 Hacer
		Escribir Subcadena(frase,i,i),' ' Sin Saltar
	Fin Para
	Escribir ''
FinAlgoritmo
