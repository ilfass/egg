Algoritmo ejercicio_cooperativo
	
	Definir user, pass, selector Como Caracter
	Definir login Como Logico
	Definir saldo, intentos, cantBotellas,aleat, pago Como Entero
	intentos=0
	login= Falso
	Repetir
	Escribir "ingrese su usuario"
	Leer  user
	si user = "Albus_D"  Entonces
		Escribir "ingrese contraseña"
		Leer pass
		intentos = intentos +1
		Mientras pass <> "caramelosDeLimon" y  intentos < 3 Hacer
			intentos = intentos +1
			Escribir "ingrese la contraseña nuevamente"
			leer pass
		Fin Mientras
		si intentos = 3 Entonces
			Escribir "supero la cantidad de intentos"
			
		FinSi
		si pass = "caramelosDeLimon" Entonces
			login = Verdadero
		FinSi
	SiNo
		Escribir "El usuario ingresado es incorrecto"
		
	FinSi
Mientras Que !login
Escribir "Ingrese una opción"
Escribir "(A) Ingresar botellas"
Escribir "(B) Consultar Saldo"
Escribir "(C)Salir"
Leer selector
selector = Mayusculas(selector)
Segun selector Hacer
	A:
		Escribir "cuantas botellas va a ingresar al sistema"
		pago = 0
		leer cantBotellas
		Para i=0 Hasta cantBotellas Con Paso 1 Hacer
			aleat = aleatorio(100,3000)
			
			si aleat < 500 Entonces
				pago = pago +50
			FinSi
			si aleat > 500 y aleat <1501 Entonces
				pago = pago + 125
			FinSi
			si aleat > 1501 Entonces
				pago = pago + 200
			FinSi
		Fin Para
		Escribir "Le ofrecemos: $" pago 
		
	B:
		secuencia_de_acciones_2
	C:
		login = falso
	De Otro Modo:
		Escribir "debe elegir entre las opciones ofrecidas"
Fin Segun
FinAlgoritmo
