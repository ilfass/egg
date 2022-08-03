Funcion retorno <- cambio ( valorAcambiar )
	Definir retorno, valores, primervalor, segundovalor, tercerrvalor,concatenado Como Caracter
	Definir i, nuevoNumero Como Entero
	Para i=0 Hasta Longitud(valorAcambiar) Con Paso 1 Hacer
		valores = SubCadena(valorAcambiar,i,i)
		Si i= 0 Entonces
			primervalor = valores
		SiNo
			
			Si i= 1 Entonces
			segundovalor = valores
				
		SiNo
	        
			Si i= 2 Entonces
				tercerrvalor = valores
				
			Fin Si
	
		Fin Si	
		Fin Si
	FinPara
	concatenado = Concatenar(primervalor,segundovalor)
	concatenado = Concatenar(concatenado, tercerrvalor)
	nuevoNumero = ConvertirANumero(concatenado)
	
	Escribir nuevoNumero
Fin Funcion




Algoritmo Extras_2
	Definir num1 como cadena
	Escribir "ingrese un numero hasta 3 digitos"
	leer num1
	Escribir "el nuevo entero es " cambio(num1)
FinAlgoritmo