//Escriba un programa para obtener el grado de eficiencia de un operario de una fábrica de
//	tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un período
//	de prueba:
//		? Producir menos de 200 tornillos defectuosos.
//		? Producir más de 10000 tornillos sin defectos.
//	? El grado de eficiencia se determina de la siguiente manera:
//		? Si no cumple ninguna de las condiciones, grado 5.
//			? Si sólo cumple la primera condición, grado 6.
//				? Si sólo cumple la segunda condición, grado 7.
//					? Si cumple las dos condiciones, grado 8
//					Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el
//							ejercicio. No hacer todos al mismo tiempo y después probar.
Algoritmo gradoEficiencia
	
	Definir tornillosDefectuosos, tornillosSinDefectos Como Entero
	
	Escribir "cuantos tornillos defectuosos produjo?"
	leer tornillosDefectuosos
	Escribir  "cuantos tornillos sin defectos."
	leer tornillosSinDefectos
	
	si tornillosDefectuosos < 200 y tornillosSinDefectos > 10000 Entonces
		Escribir "El trabajor es grado 8"
		
	SiNo
		si tornillosDefectuosos > 200 y tornillosSinDefectos > 10000 Entonces
			Escribir "El trabajor es grado 7"
		SiNo
			si tornillosDefectuosos < 200 y tornillosSinDefectos < 10000 Entonces
				Escribir "El trabajor es grado 6"
			SiNo
				Escribir "El trabajor es grado 5"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
