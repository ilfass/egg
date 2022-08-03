Algoritmo EjercicioIntegrador
	Definir matrizTotal, letras Como Caracter
	Definir m,tamano Como Entero
//	Escribir "especifique el tamaño de la matriz que debe ser cuadrada"
	//	leer m
	letras= "CDDACCACCACAAABC"
	tamano= Longitud(letras)
	segun tamano hacer
		9:
			m=tamano/3
		16:m=tamano/4
		1369:m=tamano/37
	FinSegun	
	
	Dimension matrizTotal(m,m)
	cargarmatriz(matrizTotal,letras,m)
	
	compararmatriz(matrizTotal,m)
	
	
	
FinAlgoritmo


SubProceso cargarmatriz (matrizTotal Por Referencia,letras,m)
	Definir prueba como cadena
	Definir i,j,tamano,conta Como Entero
	definir validacion Como Logico
	validacion=falso
	
conta=0

Escribir " el tamaño es " m
	para i=0 Hasta m-1 Hacer
		para j=0 Hasta m-1 Hacer
//			Repetir
//				Escribir "ingrese un caracter del genoma que debe ser A B C o D"
//				leer letras
//				letras=Mayusculas(letras)
			//			si letras = "A" o letras = "B" o letras = "C" o letras= "D" Entonces
			//letra =Subcadena(letras,i,i)
			matrizTotal(i,j) = Subcadena(letras,conta,conta)
			conta=conta +1 
//				validacion=Verdadero
//			SiNo
//				validacion=falso
//			FinSi
//		Mientras Que 	validacion=falso
		FinPara
	FinPara
	mostrarmatriz(matrizTotal,m)
FinSubProceso

SubProceso compararmatriz(matrizTotal,m)
	Definir vector, vector1 Como caracter
	Definir cont, i, j,contvali,contvali1 Como Entero
	Dimension vector(m), vector1(m)
	cont=0
	contvali=0
	contvali1=0
	Para i=0 Hasta m-1 Hacer
		para j=0 Hasta m-1	hacer	
//			vector(i) = matrizTotal(j,cont)
//			cont=cont + 1
			//			vector1(i)= matrizTotal(j,m-j-1)
			si i= j Entonces
				vector(i)= matrizTotal(i,j)
			FinSi
			si i+j = m-1 Entonces
				vector1(i)= matrizTotal(i,j)
			FinSi
			//Escribir vector(i) " " Sin Saltar
			//Escribir vector1(i) " " Sin Saltar
		FinPara
	FinPara
	
	para i=0 Hasta m-1
		si vector(i) = matrizTotal(0,0) Entonces
			contvali=contvali +1
		FinSi
		si vector1(i) = matrizTotal(0,m-1) Entonces
			contvali1=contvali1 +1
		FinSi
	FinPara
	si contvali= m y contvali1 = m Entonces
		Escribir "salvados tenemos un genZ"
		mostrarmatriz(matrizTotal,m)
	SiNo
		escribir "estamos al horno"
	FinSi
FinSubProceso


SubProceso mostrarmatriz (matrizTotal,m)
	Definir i,j Como Entero
	para i=0 Hasta m-1 Hacer
		para j=0 Hasta m-1 Hacer
			Escribir "| " matrizTotal(i,j) " |" Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso