Funcion retorno <- validar ( usuario, contra )
	Definir retorno Como Caracter
	Definir intentos Como Entero
	Definir validacion Como Logico
	validacion = Falso
	intentos = 0
	Hacer
		Si intentos < 2 Entonces
			
			si usuario == "usuario1" y contra == "asdasd" Entonces
				validacion = Verdadero
				Escribir "felicitaciones ha ingresado"
			SiNo
				Escribir "ingrese un nuevo nombre de usuario"
				leer usuario
				Escribir  "ingrese una nueva contraseña"
				leer contra
			FinSi
			intentos = intentos +1
			
		SiNo
			Escribir "supero la cantidad de intentos"
			validacion = verdadero
		FinSi
		
	Mientras Que validacion = falso

Fin Funcion

//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd".
//Además, la función calculara el número de intentos que se ha usado para loguearse, tenemos
//solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso.




Algoritmo login
	Definir nombre, passw Como Caracter
	Escribir "ingrese nombre de usuario"
	leer nombre
	Escribir  "ingrese contraseña"
	leer passw
	
	escribir validar(nombre, passw)
	
FinAlgoritmo
