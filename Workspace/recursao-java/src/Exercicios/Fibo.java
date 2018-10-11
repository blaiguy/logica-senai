package Exercicios;

public class Fibo {

	public static void main(String[] args) {
		int qntdSeq = 3;
		// 1) Establecemos uma quantidade de números de 0 a 10
		for (int i = 0; i <= qntdSeq; i++) {
			// 2) Um lopping/laço controla  quantidade de números que queremos saber
			// da sequencia de Fibonacci
		
		System.out.println(fibonacci(i));
	}

}
	public static int fibonacci (int x) {
		// 3) Se o qntdSeq for menor ou igual a 1, retorne ele mesmo
		// (Já que a sequencia começa com 0 e 1)
		if (x <= 1) {
			return x;
		} else {
	    
	    // 4) Devido a complexidade dessa segunda parte,
		// Fiz um desenho e coloquei na pasta /res do projeto
			return fibonacci(x-1) + fibonacci(x-2);
		}
		}
	}