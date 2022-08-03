Algoritmo sin_titulo
	
//	Escribir una estructura PARA que le solicite al usuario varios números y al finalizar muestre el
//	mayor número ingresado.
	
	Definir num, max, cantidad como entero;
	
	cantidad= 5
//	max=0
	
	Para i<-1 Hasta cantidad Hacer
		Escribir "Ingrese cantidad de numeros";
		Leer num 
		si num > max Entonces
			max= num
		FinSi
	Fin Para
	
	Escribir "El numero mayor es: ", max
FinAlgoritmo
