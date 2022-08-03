// Escribir un programa que calcule los primeros 4 centros num�ricos. Un centro num�rico
// es un n�mero que separa una lista de n�meros enteros (comenzando en 1) en dos
// grupos de n�meros, cuyas sumas son iguales. El primer centro num�rico es el 6, el cual
// separa la lista (1 a 8) en los grupos: (1, 2, 3, 4, 5) y (7, 8) cuyas sumas son ambas iguales
// a 15. El segundo centro num�rico es el 35, el cual separa la lista (1 a 49) en los grupos:
// (1 a 34) y (36 a 49) cuyas sumas son ambas iguales a 595.
Algoritmo Principal
	Definir nro, sumaAnteriores, sumaPosteriores, cantidadCentros, i, j Como Entero
	cantidadCentros = 0
	nro = 1
	
	Mientras cantidadCentros < 4 Hacer
		sumaAnteriores = 0
		
		Para i = 1 Hasta nro - 1 Hacer
			sumaAnteriores = sumaAnteriores + i
		Fin Para
		
		j = nro + 1
		sumaPosteriores = 0
		Mientras sumaAnteriores > sumaPosteriores Hacer
			sumaPosteriores = sumaPosteriores + j
			j = j + 1
		Fin Mientras
		
		Si sumaAnteriores = sumaPosteriores Entonces
			cantidadCentros = cantidadCentros + 1
			Escribir "Centro num�rico encontrado: ", nro, " (", sumaAnteriores, ")"
		Fin Si
		
		nro = nro + 1
	Fin Mientras
FinAlgoritmo