Algoritmo ejercicio_11
	Definir num, centena, decena, unidad Como Entero
	
	Escribir "Ingrese un número de 3 cifras: "
	Leer num
	
	unidad = num%10
	decena = ((num%100)-unidad)/10
	centena = (num-(num%100))/100
	
	Escribir "CENTENA: " centena
	Escribir "DECENA: " decena
	Escribir "UNIDAD: " unidad
	
FinAlgoritmo
