Funcion retorno <- esMultiplo ( num1, num2)
	Definir retorno Como Logico
	retorno = (num1 mod num2 = 0)
Fin Funcion

//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es
//múltiplo del segundo, sino es múltiplo que devuelva falso.

Algoritmo sin_titulo
	Definir valor1, valor2 Como Entero
	Escribir "Ingrese dos numeros"
	leer valor1, valor2
	
	Escribir esMultiplo(valor1,valor2)
	
FinAlgoritmo
