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
