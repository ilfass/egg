/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/
public class Ejercicio18 {

	public static void main(String[] args) {
		System.out.println("Creamos la matriz de aleatorios 3x3 y lo leemos");
		int[][] matriz = arrayCreation();
		leerMatriz(matriz);
		System.out.println("");
		int[][] matrizTrasp = matrizTraspuesta(matriz);
		leerMatriz(matrizTrasp);
	}
	
	
	  public static int[][] arrayCreation(){
		    int[][] array = new int[3][3];
		    for(int i=0;i<3;i++) {
		      for(int j=0;j<3;j++) {
		        array[i][j] =(int) (Math.random()*10);
		      }
		    }
		    return array;
	  }	    
	  public static void leerMatriz(int[][] matriz) {
		  for(int i = 0 ; i < 3 ; i++) {
			  for(int j = 0 ; j < 3 ; j++) {
				  System.out.print(matriz[i][j] + " ");
			  }
			  System.out.println("");
		  }
	  }
	  public static int[][] matrizTraspuesta(int[][] matriz){
		  int[][] matrizTrasp = matriz;
		  for(int i = 0 ; i < 3 ; i++) {
			  for(int j = 0 ; j < 3 ; j++) {
				  matrizTrasp[j][i] = matriz[i][j];
			  }
	      }
		  return matrizTrasp;
      }
}