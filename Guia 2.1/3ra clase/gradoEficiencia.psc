//Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica de
//	tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per�odo
//	de prueba:
//		? Producir menos de 200 tornillos defectuosos.
//		? Producir m�s de 10000 tornillos sin defectos.
//	? El grado de eficiencia se determina de la siguiente manera:
//		? Si no cumple ninguna de las condiciones, grado 5.
//			? Si s�lo cumple la primera condici�n, grado 6.
//				? Si s�lo cumple la segunda condici�n, grado 7.
//					? Si cumple las dos condiciones, grado 8
//					Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el
//							ejercicio. No hacer todos al mismo tiempo y despu�s probar.
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
