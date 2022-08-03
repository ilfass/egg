//Ingrese un número de tres cifras y muestra la unidad, decena y la centena.
//Por ejemplo, si el número ingresado por pantalla es 123 el programa debe mostrar:
//	CENTENA: 1
//	DECENA: 2
//	UNIDAD: 3
Algoritmo ejercicioGrupal
	Definir num, unidad, decena, centena Como Entero
	
	Escribir "Ingrese un numero de tres cifras: "	
	Leer num
	Mientras (num<100) O (num>999) Hacer
		Escribir "Vuelva a ingresar un numero de TRES CIFRAS!!!"
		Leer num
	FinMientras
	
	unidad = num mod 10
	num = trunc(num/10)
	decena = num mod 10
	num = trunc(num/10)
	centena = num mod 10
	Escribir "CENTENA: ", centena
	Escribir "DECENA: ", decena
	Escribir "UNIDAD: ", unidad
	
//	Si (num > 99) Y (num < 1000) Entonces
//		unidad = num mod 10
//		num = trunc(num/10)
//		decena = num mod 10
//		num = trunc(num/10)
//		centena = num mod 10
//		Escribir "CENTENA: ", centena
//		Escribir "DECENA: ", decena
//		Escribir "UNIDAD: ", unidad
//	SiNo
//		Escribir "El numero que ingresó no es de tres cifras"
	//	FinSi	
	
FinAlgoritmo
