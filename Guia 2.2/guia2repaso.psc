Algoritmo sin_titulo
	
	definir pass, user, aceptar Como Caracter
	definir login Como Logico
	definir intentos, botellas, i, gramos, saldo, option Como Entero
	saldo = 0
	intentos = 0
	
	escribir "Ingresar usuario"
	leer user
	si user == "Albus_D" Entonces
		escribir "Ingresar contraseña"
		leer pass
		si pass <> "caramelosDeLimon"
			Entonces
			intentos = intentos + 1
			Mientras intentos < 3 y pass <> "caramelosDeLimon" Hacer
				escribir "Ingresar contraseña"
				leer pass
				intentos = intentos + 1
				si pass == "caramelosDeLimon" Entonces
					login = Verdadero
				FinSi
			Fin Mientras
		SiNo
			login = Verdadero
		FinSi
	FinSi
	
	Mientras login == Verdadero Hacer
		
		Escribir "1) INGRESAR BOTELLAS - 2) CONSULTAR SALDO - 3) SALIR -"
		leer option
		Segun option Hacer
			
			1:
				escribir "CUÁNTAS BOTELLAS VA A INGRESAR"
				leer botellas
				
				Para i<-1 Hasta botellas Con Paso 1 Hacer
					gramos = Aleatorio(100, 3000)
					Escribir gramos
					si gramos < 500 entonces
						
						escribir "ACEPTA 50 por ", gramos, " gramos?"
						leer aceptar
						si aceptar == "si" Entonces
							saldo = saldo + 50
						SiNo
							Escribir "Devolviendo"
						FinSi
					SiNo
						
						si gramos >= 501 y gramos <=1500 Entonces
							
							escribir "ACEPTA 150 por ", gramos, " gramos?"
							leer aceptar
							si aceptar == "si" Entonces
								saldo = saldo + 150
							SiNo
								Escribir "Devolviendo"
							FinSi
							
						SiNo
							escribir "ACEPTA 200 por ", gramos, " gramos?"
							leer aceptar
							si aceptar == "si" Entonces
								saldo = saldo + 200
							SiNo
								Escribir "Devolviendo"
							FinSi
							
						FinSi
					FinSi
				Fin Para
			2:
				Escribir "TU SALDO ES DE: ", saldo
			3:
				login = Falso
			De Otro Modo:
				Escribir "OPCIÓN NO VÁLIDA"
		Fin Segun
	Fin Mientras
	
	
	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
