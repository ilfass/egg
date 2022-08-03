Algoritmo sin_titulo
	
//	Diseña un programa que guarde una vocal secreta en una variable, debemos pedirle al usuario
//	que intente adivinar la vocal secreta, e intentará tantas veces como sea necesario hasta que la
//	adivine
	
	Definir vocal, vocalSecreta Como Caracter; 
	Escribir "Ingrese una vocal: "
	leer vocal;
	
	vocalSecreta="a"
	
	Mientras vocal <> vocalSecreta Hacer
		Escribir "No adivino la vocal, ingrese otra nuevamente"
		leer vocal
	FinMientras
	
	Escribir "Excelente, la vocal era: ", vocalSecreta
	
FinAlgoritmo
