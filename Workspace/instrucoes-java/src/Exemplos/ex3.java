package Exemplos;

public class ex3 {
public static void main(String[] args) {
	
	double numero []= {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8};
	
	double acumulador = 0;

	for (int i = 0; i <= 7; i++) {
		
		double v = numero[i];
		acumulador = acumulador + v;
		
		System.out.println("acumulador " +acumulador );
	}
	
	
	
}
}
