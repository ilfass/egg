//Realizar un programa que pida al usuario el horario en el que se conect� al zoom. Si ese horario
//	est� entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrar� un mensaje por
//	pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese l�mite,
//		se mostrar� un mensaje por pantalla que diga "Hoy tendr�s tardanza. Recuerda avisarle a tus
//		coaches cuando llegar�s tarde. Ma�ana te esperamos a tiempo, tu participaci�n en el equipo es
//VITAL"

Algoritmo Zoom
	Definir horaConexion Como Entero
	Definir minutosConexion Como Entero
	Escribir "hora de conexi�n"
	leer horaConexion
	Escribir "minutos de conexi�n"
	leer minutosConexion
	si ((horaConexion = horaIngreso) y (minutosConexion < (minutosConexion + 15) )) entonces
FinAlgoritmo
