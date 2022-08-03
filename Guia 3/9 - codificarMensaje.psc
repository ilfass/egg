Algoritmo codificarMensaje
	Definir frase Como Caracter
	Escribir 'Ingrese una frase para codificar:'
	Leer frase
	Escribir ''
	codificar(frase)
FinAlgoritmo

	

SubAlgoritmo codificar (frase Por Valor) 
	Definir i Como Entero
	Definir nuevoCaracter,fraseNueva Como Caracter
	fraseNueva = ''
	Para i <- 0 Hasta Longitud(frase) - 1 Con Paso 1 Hacer
		nuevoCaracter = Minusculas(Subcadena(frase,i,i))
		Segun nuevoCaracter
			'a':
				nuevoCaracter = '@'
			'e':
				nuevoCaracter = '#'
			'i':
				nuevoCaracter = '$'
			'o':
				nuevoCaracter = '%'
			'u':
				nuevoCaracter = '*'
		FinSegun
		fraseNueva = Concatenar(fraseNueva,nuevoCaracter)
	Fin Para
	Escribir 'Mensaje codificado: ',fraseNueva
FinSubAlgoritmo
	