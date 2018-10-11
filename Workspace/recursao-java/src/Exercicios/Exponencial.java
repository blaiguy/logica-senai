package Exercicios;

public class Exponencial {

	public static void main(String[] args) {
		int n1 , n2 ;
		int resultado = calcula(8, 3);
		System.out.println(resultado);
		

	}
		public static int calcula(int n1, int n2) {
			if (n2 != 0) {
				return n1 * calcula(n1, n2-1);
			} else {
				return 1;
		    	
	}

}
	}
