
Algoritmo Ejercicio5
	Definir i,vector,n,valores Como Entero
	Escribir "Especifique el tamaño del vector"
	leer n
	Dimension vector(n)
	
	Para i=0 Hasta n-1 Hacer
		escribir "ingrese el valor para la posición " i
		leer valores
		vector(i)= valores
	FinPara
	escribir valorMayor(vector, n)
	
FinAlgoritmo

Funcion retorno <- valorMayor (vector Por Referencia, n)
	Definir i,mayor Como Entero
	mayor =0
	Para i=0 Hasta n-1 Hacer
	
			si vector(i)= 0 Entonces
				mayor = vector(i)
				
			SiNo
				si vector(i) > mayor Entonces
					mayor =vector(i)
				FinSi
		FinSi
			
				
			FinPara
			Escribir "el mayor es: " mayor
			
FinSubProceso
