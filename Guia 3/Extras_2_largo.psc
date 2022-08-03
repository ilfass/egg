Funcion retorno <- cambio ( valorAcambiar )
	Definir retorno, valores Como Caracter
	Definir i, primervalor, segundovalor, tercervalor Como Entero
	Para i=0 Hasta Longitud(valorAcambiar) Con Paso 1 Hacer
		valores = SubCadena(valorAcambiar,i,i)
		Segun valores Hacer
			"1":
				si i = 0 Entonces
					primervalor = 1
				sino
					Si i= 1 Entonces
						segundovalor = 1
					sino
						Si i= 2 Entonces
							tercervalor = 1
						Fin Si
					Fin Si
				FinSi
			"2":si i = 0 Entonces
				primervalor = 2
			sino
				Si i= 1 Entonces
					segundovalor = 2
				sino
					Si i= 2 Entonces
						tercervalor = 2
					Fin Si
				Fin Si
			FinSi
			"3":
				si i = 0 Entonces
					primervalor = 3
				sino
					Si i= 1 Entonces
						segundovalor = 3
					sino
						Si i= 2 Entonces
							tercervalor = 3
						Fin Si
					Fin Si
				FinSi
			"4":
				si i = 0 Entonces
					primervalor = 4
				sino
					Si i= 1 Entonces
						segundovalor = 4
					sino
						Si i= 2 Entonces
							tercervalor = 4
						Fin Si
					Fin Si
				FinSi
			"5":
				si i = 0 Entonces
					primervalor = 5
				sino
					Si i= 1 Entonces
						segundovalor = 5
					sino
						Si i= 2 Entonces
							
							tercervalor = 5
						Fin Si
					Fin Si
				FinSi
			"6":
				si i = 0 Entonces
					primervalor = 6
				sino
					Si i= 1 Entonces
						segundovalor = 6
					sino
						Si i= 2 Entonces
							tercervalor = 6
						Fin Si
					Fin Si
				FinSi
			"7":
				si i = 0 Entonces
					primervalor = 7
				sino
					Si i= 1 Entonces
						segundovalor = 7
					sino
						Si i= 2 Entonces
							tercervalor = 7
						Fin Si
					Fin Si
				FinSi
			"8":
				si i = 0 Entonces
					primervalor = 8
					sino
					Si i= 1 Entonces
						segundovalor = 8
					sino
						Si i= 2 Entonces
							tercervalor = 8
						Fin Si
					Fin Si
				FinSi
			"9":
				si i = 0 Entonces
					primervalor = 9
					Si i= 1 Entonces
						segundovalor = 9
						Si i= 2 Entonces
							tercervalor = 9
						Fin Si
					Fin Si
				FinSi
			"0":
				si i = 0 Entonces
					primervalor = 0
				sino
					Si i= 1 Entonces
						segundovalor = 0
					sino
						Si i= 2 Entonces
							tercervalor = 0
						Fin Si
					Fin Si
				FinSi
		Fin Segun
	Fin Para
	
	Escribir "el nuevo numero es :" primervalor, segundovalor, tercervalor
Fin Funcion

//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//decimales

Algoritmo Extras_2
	Definir num1 como cadena
	Escribir "ingrese un numero hasta 3 digitos"
	leer num1
	Escribir "el nuevo entero es " cambio(num1)
FinAlgoritmo

