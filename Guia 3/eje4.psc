Funcion c <- retornador ( frase,letra)
	Definir c Como Caracter
	Definir i,contador Como Entero
	contador=0
	Para i=0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		si subcadena(frase,i,i)==letra
			contador=contador+1
		FinSi
	Fin Para
	Escribir "La letra aparece " contador " veces"
Fin Funcion

//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//	función Subcadena().
Algoritmo sin_titulo
	Definir frase,letra Como Caracter
	
	Escribir "Ingrese una frase"
	Leer frase
	Escribir "Ingrese la letra a buscar en la frase"
	Leer letra
	Escribir retornador(frase,letra)
FinAlgoritmo
