//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.

Algoritmo temperatura
	Definir dias Como Entero
	Escribir " ingrese número de días"
	Leer dias
	Escribir "las temperaturas son: " 
	calcularTemperatura(dias)
FinAlgoritmo



SubProceso calcularTemperatura(dias)
	Definir tMax, tMin, tMedia, i Como real
	Para i=0 Hasta dias Con Paso 1 Hacer
		Escribir " ingrese temperatura maxima para dia " i
		Leer tMax
		Escribir " ingrese temperatura minima para dìa" i
		leer TMin
		tMedia= (tMax + tMin)/ 2
		Escribir "la temperatura media es: " tMedia
	Fin Para
	
FinSubProceso
