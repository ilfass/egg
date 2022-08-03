Algoritmo ejercicio_7
	Definir frase,retorno Como Caracter
	Definir i, e Como Entero
	
	Escribir "Ingrese una frase: "
	leer frase
	
	retorno = ""
	e = Longitud(frase)
	
	Para i = 0 Hasta e Con Paso 1 Hacer
		retorno = retorno + Subcadena(frase,i,i) + " "
	Fin Para
	
	Escribir retorno
FinAlgoritmo
