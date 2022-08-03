Algoritmo extra2_6
	
	Definir dia, mes, anio como entero
	Escribir "Ingrese una fecha completa: "
	leer dia, mes, anio
	
si dia >= 1 y dia <= 30 y mes >= 1 y mes <= 12 Entonces
	
	Segun mes Hacer
		1:
			Escribir dia, " Enero ", anio
		2:
			Escribir dia, " Febrero ", anio
		3:
			Escribir dia, " Marzo ", anio
		4:
			Escribir dia, " Abril ", anio
		5:
			Escribir dia, " Mayo ", anio
		6:
			Escribir dia, " Junio ", anio
		7:
			Escribir dia, " Julio ", anio
		8:
			Escribir dia, " Agosto ", anio
		9:
			Escribir dia, " Septiembre ", anio
		10:
			Escribir dia, " Octubre ", anio
		11:
			Escribir dia, " Noviembre ", anio
		12:
			Escribir dia, " Diciembre ", anio
		
		De Otro Modo:
			Escribir "Ingrese fecha valida"
	Fin Segun
	
FinSi
	
FinAlgoritmo
