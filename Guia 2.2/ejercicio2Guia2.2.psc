Algoritmo sin_titulo
	
//	Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n solicite
//	n�meros al usuario hasta que la suma de los n�meros introducidos supere el l�mite inicial.
	
	Definir valorLimite, num, acumulador como entero;
	Escribir "Ingrese el valor limite: "
	leer valorLimite
	
	Mientras acumulador <= valorLimite Hacer
		Escribir "Ingrese un numero: "
		leer num;
		
		acumulador= acumulador+ num;
		
		Escribir "La suma de numeros ingresados hasta el momento es: ", acumulador
	FinMientras
	
	Escribir "La suma de los numeros ingresados ha superado el limite."
	
FinAlgoritmo
