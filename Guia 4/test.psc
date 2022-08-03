Algoritmo sin_titulo
	Definir arr,palabra Como Caracter
	Definir x Como Entero
	
	Dimension arr[12]
	palabra="vector"
	
	Para x<-0 Hasta 11 Hacer
		Si x < Longitud(palabra)-1 Entonces
			arr[x] = Subcadena(palabra,x,x)
		SiNo
			arr[x] = "*"
		FinSi
		
	Fin Para
	
	Para x<-0 Hasta 11 Hacer
		Escribir Sin Saltar arr[x]
	Fin Para
FinAlgoritmo
