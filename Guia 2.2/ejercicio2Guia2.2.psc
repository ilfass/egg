Algoritmo sin_titulo
	
//	Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//	números al usuario hasta que la suma de los números introducidos supere el límite inicial.
	
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
