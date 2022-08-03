Algoritmo ejercicio_9
	Definir  lado,i,x Como Entero
	
	Escribir "Ingrese el tamaño del lado con un número entero: "
	leer lado
	
	Para x<-1 Hasta lado Con Paso 1 Hacer
		Si x == 1 o x == lado Entonces
			Para i<-1 Hasta lado Con Paso 1 Hacer
				Escribir "*" Sin Saltar
			Fin Para
		SiNo
			Para i<-1 Hasta lado Con Paso 1 Hacer
				Si i == 1 o i == lado Entonces
					Escribir "*" Sin Saltar
				SiNo
					Escribir " " Sin Saltar
				FinSi
			Fin Para
		FinSi
		Escribir ""
	Fin Para
	
FinAlgoritmo
