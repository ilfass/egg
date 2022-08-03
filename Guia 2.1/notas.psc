Algoritmo sin_titulo
	Definir nota1, nota2, nota3 Como Real
	Definir bandera Como Logico
	Escribir "Ingrese Nota 1: "
	Leer nota1
	Escribir "Ingrese Nota 2: "
	Leer nota2
	Escribir "Ingrese Nota 3: "
	Leer nota3
	Si (nota1 >= 1  Y nota1 <= 10) Y (nota2 >= 1  Y nota2 <= 10) Y (nota3 >= 1  Y nota3 <= 10) Entonces
		bandera= Verdadero 
		Escribir bandera
	SiNo bandera= Falso
		Escribir bandera
	FinSi
	
FinAlgoritmo
