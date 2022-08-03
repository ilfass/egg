Algoritmo sin_titulo
	
//	Vamos a hacer nuevamente el ejercicio de la vocal misteriosa, pero esta vez con una estructura
//	Hacer-Mientras. ¿Puedes notar cual es la diferencia entre ambas estructuras?
	
	Definir vocal, vocalSecreta Como Caracter; 
	Escribir "Ingrese una vocal: "
	leer vocal;
	
	vocalSecreta="a"
	
	Repetir
		Escribir "No adivino la vocal, ingrese otra nuevamente"
		leer vocal
	Mientras Que  vocal <> vocalSecreta 
	
	Escribir "Excelente, la vocal era: ", vocalSecreta
	
	
FinAlgoritmo
