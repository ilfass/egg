Funcion retorno <- esMultiplo ( num1, num2)
	Definir retorno Como Logico
	retorno = (num1 mod num2 = 0)
Fin Funcion

//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
//que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es
//m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.

Algoritmo sin_titulo
	Definir valor1, valor2 Como Entero
	Escribir "Ingrese dos numeros"
	leer valor1, valor2
	
	Escribir esMultiplo(valor1,valor2)
	
FinAlgoritmo
