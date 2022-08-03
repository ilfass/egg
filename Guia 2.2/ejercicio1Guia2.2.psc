Algoritmo sin_titulo
	
//	Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota
//	se pedirá de nuevo hasta que la nota sea correcta.

	Definir nota como entero;
	Escribir "Ingrese una nota entre 0 y 10: "
	leer nota 
	
	Mientras nota<0 o nota>10 hacer
		Escribir "Error. Debe ingresar una nota mayor a 0 y menor a 10. Ingrese nuevamente:"
		leer nota;
	FinMientras
	
	Escribir "La nota es: " nota

FinAlgoritmo
