Algoritmo sin_titulo
	Definir  nota1,nota2,nota3,nota4 ,menor , promedio Como real
	Escribir "Ingrese las notas de sus T.Ps"
	leer nota1,nota2,nota3,nota4 
	
	si nota1<nota2 Y nota1< nota3 Y nota1 <nota4 Entonces
		menor = nota1
		promedio= (nota2+nota3+nota4)/3
	sino 
		si nota2<nota1 Y nota2<nota3 Y nota2 <nota4 Entonces
			menor = nota2
			promedio= (nota1+nota3+nota4)/3
		sino 
			si nota3<nota2 Y nota3<nota1 Y nota3<nota4 Entonces
				menor = nota3
				promedio= (nota2+nota1+nota4)/3
			sino 
				si nota4<nota2 Y nota4<nota3 Y nota4<nota1 Entonces
					menor = nota4
					promedio= (nota2+nota3+nota1)/3
					
					
				fin si 
				
			finsi
		FinSi
		
	FinSi

FinAlgoritmo
