Funcion retornar <- empleados ( horas, turno, feriado )
	
	 si turno = A
Fin Funcion

//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//	un 15% si el turno es nocturno.

Algoritmo fabrica
	Definir horas, turno, feriado Como Entero
	Escribir "ingrese cantidad de horas trabajadas"
	leer horas
	Escribir "ingrese el turno: Diurno (A) Ncturno (B)"
	leer turno
	Escribir "Indique si es feriado (si) (NO)"
	leer feriado
FinAlgoritmo


