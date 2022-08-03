//9. Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
//	cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
//	(incluyendo a las vocales acentuadas) se mantienen sin cambios.
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//correspondiente. Utilice la estructura "según" para la transformación.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//	La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//	NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.


Algoritmo sin_titulo
	Definir frase Como Caracter
	Escribir 'Ingrese la frase:'
	leer frase
	codificar(frase)
FinAlgoritmo


SubProceso codificar(frase)
	Definir i Como Entero
	para i <- 0 hasta Longitud(frase)
		Segun Minusculas(Subcadena(frase,i,i)) Hacer
			'a':
				Escribir '@' Sin Saltar
			'e':
				Escribir  '#' Sin Saltar
			'i':
				Escribir '$' Sin Saltar
			'o':
				Escribir '%' Sin Saltar
			'u':
				Escribir '*' Sin Saltar
			De Otro Modo:
				Escribir Subcadena(frase,i,i) Sin Saltar
		Fin Segun
	FinPara
	Escribir ''
FinSubProceso
