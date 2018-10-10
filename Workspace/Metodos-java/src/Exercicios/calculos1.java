package Exercicios;

public class calculos1 {

	public static void main(String[] args) {
		// Invocação
		System.out.println(calculos1.soma(2.0, 4.0));
	}

	// Declaração
	public static double soma(double num1, double num2) {
		return num1 + num2;

	}

	public static double subtracao(double num1, double num2) {
		return num2 - num1;
	}

	public static double divisao(double num1, double num2) {
		return num2 / num1;
	}

	public static double multiplicacao(double num1, double num2) {
		return num2 * num1;
	}
}
