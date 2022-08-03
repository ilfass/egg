Algoritmo ejercicioExtra3
	menu()
FinAlgoritmo

SubAlgoritmo menu()
	Definir eleccion Como Entero
	
	Escribir "1- Calcular muro de ladrillo "
	Escribir "2- Calcular viga de hormigon "
	Escribir "3- Calcular columnas de hormigon "
	Escribir "4- Calcular contrapisos "
	Escribir "5- Calcular techo "
	Escribir "6- Calcular Pisos"
	Escribir "7- Calcular pintura "
	Escribir "8- Calcular iluminacion "
	Escribir "9- Salir"
	
	
	Hacer
		Escribir ""
		Escribir "Escribir ingrese una opcion "
		Leer eleccion
		Segun eleccion Hacer
			1:
				calcularMuro()
			2:
				calcularViga()
			3:
				calcularColumna()
			4:
				calcularContrapisos()
			5:
				calcularTecho()
			6:
				calcularPisos()
			7:
				calcularPintura()
			8:
				calcularIluminacion()
			9:
				Escribir "Saliste!"
		Fin Segun
		
	Mientras Que eleccion < 0 o eleccion > 8
	
	
FinSubAlgoritmo

//Parte1
Funcion  sup <-calcularSuperficie(largo, ancho)
	Definir sup Como Real
	sup = largo * ancho
FinFuncion

Funcion  vol <-calcularVolumen(sup,largo,ancho)
	Definir  vol Como Real
	vol=sup*largo*ancho
FinFuncion

//--------------------------/

//Parte2
SubProceso calcularMuro ()
	Definir espesor, largo, alto, superficie como real
	Escribir "¿Quiere realizar un muro de 20cm o 30cm de espesor?"
	Leer espesor
	Escribir "¿De cuántos metros de largo quiere realizar el muro?"
	Leer largo
	Escribir "¿De cuántos metros de alto quiere realizar el muro?"
	leer alto
	Escribir "La superficie del muro es de: ", largo*alto, " metros"
	
	si espesor = 30 Entonces
		Escribir "En total va a necesitar: ", largo*alto*15.2, " kg de cemento, ", largo*alto*0.115 " m3 de arena, ", largo*alto*120, " ladrillos."
	SiNo
		Escribir "En total va a necesitar: ", largo*alto*10.9, " kg de cemento, ", largo*alto*0.09 " m3 de arena, ", largo*alto*90, " ladrillos."
	FinSi
	
FinSubProceso


//--------------------------/

//Parte 3
SubAlgoritmo  calcularViga()
	Definir largoViga Como Real
	Escribir 'Ingrese el largo de la viga expresado en M (metro):'
	Leer largoViga
	Escribir 'Cemento se necesitan: ', largoViga * 9, ' KG'
	Escribir 'Arena se necesitan: ', largoViga * 0.02 ' M2'
	Escribir 'Piedra se necesitan: ', largoViga * 0.02 ' M2'
	Escribir 'Hierro del 8 se necesitan:', largoViga * 4 ' M'
	Escribir 'Hierro del 4 se necesitan: ', largoViga * 3 ' M'
FinSubAlgoritmo

//--------------------------/

//Parte 4

SubProceso calcularColumna()
	
	Definir largoDeColumna Como Real
	
	Escribir "INGRES LARGO DE LA COLUMNA: "
	leer largoDeColumna
	
	Escribir "CANTIDAD DE CEMENTO EN KG NECESARIOS: ", largoDeColumna * 7.5
	Escribir "CANTIDAD DE ARENA NECESARIA EN m2: ", largoDeColumna * 0.016 
	Escribir "CANTIDAD DE PIEDRA NECESARIA EN m2: ", largoDeColumna * 0.016
	Escribir "CANTIDAD DE HIERRO DEL 10 NECESARIA EN METROS: ", largoDeColumna * 6
	Escribir "CANTIDAD DE HIERRO DEL 4 NECESARIA EN METROS: ", largoDeColumna * 3
	
FinSubProceso

//--------------------------/

//Parte 5
SubProceso   calcularContrapisos( )
	Definir retorno, calcular, largo, ancho, espesor Como real
	Escribir "Ingrese el largo, ancho y espesor en ese orden "
	Leer largo
	Leer ancho
	leer espesor
	//arena = 105
	//cemento = 0.45
	//piedra = 0.9	
	calcular= calcularvolumen (largo, ancho, espesor)
	Escribir "necesita " calcular * 105 "kg de cemento, "
	Escribir calcular* 0.45 "m3 de arena" " y "  
	Escribir calcular* 0.9 "m3 de piedra"
Fin Funcion


//---------------------------/

//parte 6

SubProceso calcularTecho ()
	definir espesor, ancho, largo, superficie,cemento,piedra,arena,hierro8,hierro6, volumen Como Real
	cemento=33
	arena=0.072
	piedra=0.072
	hierro8=7
	hierro6=4
	
	
	Escribir "Ingrese el espesor del techo"
	leer espesor
	escribir"Ingrese el ancho del techo"
	leer ancho
	Escribir "Ingrese el largo del techo"
	leer largo
	
	superficie= calcularSuperficie(ancho,largo)
	volumen= calcularVolumen(largo, ancho, espesor)
	
	escribir"se necesita de cemento: ",superficie*cemento," Kg"
	Escribir "se nececita de arena: ",volumen*arena " m3"
	Escribir "se necesita de piedra: " volumen*piedra " m3"
	Escribir "se nececita de hierro del 8: " superficie*hierro8 " m"
	Escribir "se necesita de hierro del 4:" superficie*hierro6 " m"
	
	
FinSubProceso

//---------------------------/

//Parte 7
SubProceso calcularPisos()
	Definir ancho, largo, superficie Como Real
	Escribir "Ingrese el ancho y largo"
	Leer ancho, largo
	Escribir calcularSuperficie(largo,ancho) * 1.1
	
FinSubProceso

//---------------------------/

//Parte 8
SubAlgoritmo calcularPintura()
	
	Definir ancho, largo Como Real
	Escribir Sin Saltar "Ingrese el ancho: "
	leer ancho
	Escribir Sin Saltar "Ingrse el largo: "
	leer largo
	
	Escribir "La cantidad de pintura que necesita es", trunc(calcularSuperficie(ancho, largo) / 6) + 1, "lts"
FinSubAlgoritmo

//---------------------------/

//Parte 9
SubProceso 	calcularIluminacion()
	Definir superficie Como Entero
	
	Escribir "Ingresar la superficie de la habitación: "
	leer superficie
	
	Escribir "La cantidad mínima de superficie de iluminación es de:" superficie*0.2 " m2."
FinSubProceso