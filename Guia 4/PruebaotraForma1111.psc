Algoritmo sin_titulo
	Definir sumaAnterior,sumaPosterior,centroNumerico,cantidadDeCentroNumericos, aux Como Entero
	sumaAnterior = 0
	sumaPosterior = 0	
	centroNumerico = 1
	cantidadDeCentroNumericos = 0
	aux = 0
	
	Mientras cantidadDeCentroNumericos < 204
		sumaAnterior = sumaAnterior + (centroNumerico-1)
		sumaPosterior = sumaPosterior - centroNumerico
		Mientras sumaPosterior <= sumaAnterior y centroNumerico <> 1
			si sumaAnterior = sumaPosterior
				Escribir 'El centro numerico es igual a: ', centroNumerico, ' y la suma anterior y posterior es igual a: ', sumaAnterior
				Escribir ''
			FinSi
			Escribir 'Antes'
			Escribir 'sumaAnterior:     ', sumaAnterior
			Escribir 'centroNumerico:   ', centroNumerico
			Escribir 'sumaPosterior:    ', sumaPosterior
			Escribir 'aux:              ', aux
			Escribir ''
			aux = aux + 1
			sumaPosterior = sumaPosterior + aux
			Escribir 'Antes'
			Escribir 'sumaAnterior:     ', sumaAnterior
			Escribir 'centroNumerico:   ', centroNumerico
			Escribir 'sumaPosterior:    ', sumaPosterior
			Escribir 'aux:              ', aux
		FinMientras
		Escribir '---------------------'
		cantidadDeCentroNumericos = cantidadDeCentroNumericos + 1
		centroNumerico = centroNumerico + 1 
	FinMientras
FinAlgoritmo

