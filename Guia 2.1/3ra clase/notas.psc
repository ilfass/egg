//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba un
//	curso, sabiendo que aprobar� el curso si su promedio de tres calificaciones es mayor o
//		igual a 70; y reprueba en caso contrario.

Algoritmo notas
	Definir nota1,nota2,nota3,promedio Como Real
	Escribir "ingrese 3 notas"
	Leer nota1,nota2,nota3
	
	promedio = (nota1 + nota2 +nota3)/3 
	
	si promedio >= 70 Entonces
		Escribir "aprobo"
	SiNo
		Escribir "No aprobo"
	FinSi
FinAlgoritmo
