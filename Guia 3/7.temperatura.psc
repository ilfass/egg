//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//programa pedir� el n�mero de d�as que se van a introducir.

Algoritmo temperatura
	Definir dias Como Entero
	Escribir " ingrese n�mero de d�as"
	Leer dias
	Escribir "las temperaturas son: " 
	calcularTemperatura(dias)
FinAlgoritmo



SubProceso calcularTemperatura(dias)
	Definir tMax, tMin, tMedia, i Como real
	Para i=0 Hasta dias Con Paso 1 Hacer
		Escribir " ingrese temperatura maxima para dia " i
		Leer tMax
		Escribir " ingrese temperatura minima para d�a" i
		leer TMin
		tMedia= (tMax + tMin)/ 2
		Escribir "la temperatura media es: " tMedia
	Fin Para
	
FinSubProceso
