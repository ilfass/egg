//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//sus estudiantes:
//	§ Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//	reprueba el curso si tiene una nota final inferior a 6.5
//	§ Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//	§ La mayor nota obtenida en las exposiciones.
//	§ Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//	El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//	las 3 notas y calculará todos informes claves que requiere el docente.
Algoritmo Notas_Finales_Alumnos
	Definir practicoInte, exposicion,exposicionMayor, parcial, notaFinal, promedioDesap, notaTotalDes, promedioInte Como Real
	Definir alumnos, alumnosDesp, alumnosInte, alumnosParcialAp, i Como Entero
	notaTotalDes = 0
	exposicionMayor = 0
	alumnosDesp = 0
	alumnosInte = 0
	alumnosParcialAp = 0
	promedioInte = 0
	promedioDesap = 0
	Escribir "Ingrese cantidad de alumnos: "
	Leer alumnos
	
	Para i <- 1  Hasta alumnos Con Paso 1 Hacer
		
		Escribir 'Ingrese nota de trabajo practico Integrador: '
		Leer practicoInte
		Escribir 'Ingrese nota de Exposicion: '
		Leer exposicion
		Escribir 'Ingrese nota del Parcial: '
		Leer parcial
		notaFinal = (practicoInte*0.35)+(exposicion*0.25)+(parcial*0.4)
		
		///Para sacar la nota promedio de los alumnos desaprobados:
		Si notaFinal < 6.5 Entonces
			alumnosDesp = alumnosDesp + 1
			notaTotalDes = notaTotalDes + notaFinal	
		FinSi		
		
		Si practicoInte > 7.5 Entonces			
			alumnosInte = alumnosInte + 1				
		FinSi
		
		Si exposicion > exposicionMayor Entonces
			exposicionMayor = exposicion
		FinSi
		
		Si parcial > 4.0 Y parcial < 7.5 Entonces
			alumnosParcialAp = alumnosParcialAp + 1
		FinSi
	Fin Para	
	promedioDesap = notaTotalDes/alumnosDesp
	promedioInte = (alumnosInte*100)/alumnos
	Escribir "La nota promedio final de estudiantes desaprobados es: ", promedioDesap
	Escribir "El porcentaje de alumnos con nota de TP Integrador superior a 7.5 es: ", promedioInte,"%"
	Escribir "La nota mayor de Exposicion es: ", exposicionMayor
	Escribir "El total de estudiantes que obtuvieron nota Parcial entre 4.0 y 7.5 es: ", alumnosParcialAp	
	
	
//	Para i <- 1  Hasta alumnos Con Paso 1 Hacer
//		Leer exposicion
//		si exposicion > exposicionMayor Entonces
//			exposicionMayor = exposicion
//		FinSi
//	Fin Para
//	Escribir 'La nota de exposicion mas alta es: ', exposicionMayor
	
	
FinAlgoritmo
