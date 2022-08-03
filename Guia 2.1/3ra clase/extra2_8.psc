Algoritmo extra2_8
	
	definir llantas Como Entero
	Escribir "Ingrese la cantidad de llantas compradas: "
	leer llantas
	
	si llantas < 5 Entonces
		Escribir "El valor a abonar es: " llantas*3000
	SiNo
		si llantas > 5 y llantas < 10 entonces
		
		Escribir "El valor a abonar es: " llantas*2500
	SiNo
		
		si llantas >= 10 Entonces
			Escribir "El valor a abonar es: " llantas*2000
			fin si
		FinSi
	FinSi
	
	
	
	
FinAlgoritmo
