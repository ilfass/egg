Algoritmo extra2_9
	
	
	Definir anio Como Entero
	Escribir "Ingrese un anio: "
	leer anio
	
	Si anio mod 4 = 0 y anio mod 100 <> 0 Entonces
		Escribir "El a�o es biciesto"
	SiNo
		si anio mod 100 = 0 y anio mod 400 = 0 Entonces
			Escribir "El a�o ingresado tambien es biciesto"
		FinSi
	FinSi
	
FinAlgoritmo
