Algoritmo darVueltaPalabraRecursivo
	Definir frase, nuevaFrase Como Caracter
	Leer frase
	nuevaFrase = darVuelta(frase,Longitud(frase)-1)
	si nuevaFrase == frase 
		Escribir 'La palabra es un palindromo'
	SiNo
		Escribir 'Frase alrevez: ', nuevaFrase
	FinSi
FinAlgoritmo



Funcion retorno <- darVuelta(frase,longFrase)
	Definir retorno Como Caracter
	si longFrase == 0
		retorno =Subcadena(frase,0,0)
	SiNo
		retorno = Subcadena(frase,longFrase,longFrase) + darVuelta (frase,(longFrase -1))
	FinSi
	
FinFuncion
	