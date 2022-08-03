Algoritmo extra2_10
	
	Definir kilos,precio,monto Como Real
	Escribir "Ingrese la cantidad de kg comprados: "
	leer kilos
	
	precio = 50
	
	
	si kilos >= 0 y kilos <= 2 Entonces
		monto = precio
		Escribir "El monto a pagar es: " , monto
	sino 
		si kilos >= 2.01 y kilos <= 5 Entonces
			monto = precio - (precio*0.1)
			Escribir "El monto a pagar es: " , monto
			
		sino 
			si kilos >= 5.01 y kilos <= 10 Entonces
				monto = precio - (precio*0.15)
				Escribir "El monto a pagar es: " , monto
				
			sino 
				si kilos >= 10.01 Entonces
					monto = precio - (precio*0.2)
					Escribir "El monto a pagar es: ", monto
				FinSi
			FinSi
		FinSi
	fin si
	
	
FinAlgoritmo
