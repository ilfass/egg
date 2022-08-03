//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:

Algoritmo ejercicio12
	Definir palabra,matrix Como caracter
	definir i,j,contador Como Entero
	Dimension matrix(3,3)
	Escribir "ingrese una palabra de nueve caracteres"
	leer palabra
	contador=0
	Repetir
		si longitud(palabra)<>9 Entonces
			Escribir	"la palabra debe tener 9 caracteres"
			leer palabra
		FinSi
	Mientras Que longitud(palabra) <> 9 
	
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			Segun i Hacer
				0:
					matrix(i,j)= SubCadena(palabra,contador,contador)
					contador= contador+1
				1:
					matrix(i,j)= SubCadena(palabra,contador,contador)
					contador= contador+1
				2:
					matrix(i,j)= SubCadena(palabra,contador,contador)
					contador= contador+1
				De Otro Modo:
					Escribir "algo salió mal"
			Fin Segun
			
			
//			si i=0 Entonces
//				matrix(i,j)= SubCadena(palabra,contador,contador)
//				contador= contador+1
//				si i=1 Entonces
//					matrix(i,j)= SubCadena(palabra,contador,contador)
//					contador= contador+1
//					si i=2 Entonces
//						matrix(i,j)= SubCadena(palabra,contador,contador)
//						contador= contador+1
//				FinSi
//			FinSi
//		FinSi
		FinPara
	FinPara


	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matrix(i,j) " "
		Fin Para
		Escribir ""
	Fin Para
		 

FinAlgoritmo
