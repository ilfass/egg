Algoritmo sin_titulo
	Definir sumaAnterior,sumaPosterior,centroNumerico,cantidadDeCentroNumericos, aux Como Entero
	sumaAnterior = 0
	sumaPosterior = 1
	centroNumerico = 1
	cantidadDeCentroNumericos = 0
	aux = 1
	
	Mientras cantidadDeCentroNumericos < 8
		sumaAnterior = sumaAnterior + (centroNumerico-1)
		sumaPosterior = sumaPosterior - centroNumerico
		Mientras sumaPosterior <= sumaAnterior
			si sumaAnterior = sumaPosterior
				Escribir 'El centro numerico es igual a: ', centroNumerico, ' y la suma anterior y posterior es igual a: ', sumaAnterior
				cantidadDeCentroNumericos = cantidadDeCentroNumericos + 1
			FinSi
			aux = aux + 1
			sumaPosterior = sumaPosterior + aux
		FinMientras
		
		centroNumerico = centroNumerico + 1 
	FinMientras
FinAlgoritmo

