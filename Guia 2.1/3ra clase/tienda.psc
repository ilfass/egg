//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
//	10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
//	mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
//	debe cobrar al cliente e imprimirlo por pantalla.

Algoritmo tienda
	Definir mes Como Caracter
	Definir importe Como Real
	Definir descuento Como Real
	Escribir "Ingresar un mes"
	leer mes
	Escribir "ingrese el importe"
	leer importe
	
	si mes = "septiembre" o mes = "octubre" o mes = "noviembre" Entonces
		
		descuento = importe - (importe *10 /100)
		Escribir " El importe a abonar es: " descuento
		
	SiNo
		Escribir "no tiene Descuento"
	FinSi
	
FinAlgoritmo
