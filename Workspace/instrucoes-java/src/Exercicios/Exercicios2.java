package Exercicios;

import java.util.Random;

public class Exercicios2 {
	public static void main(String[] args) {
		int n= new Random().nextInt (7) +1;

		switch (n) {
		case 1:
			System.out.println("� Domingo!");
			break;
		case 2:
			System.out.println("� Segunda!");
			break;
		case 3:
			System.out.println("� terca feira");
			break;
		case 4:
			System.out.println("� quarta feira!");
			break;
		case 5:
			System.out.println("� quinta feira!");
			break;
		case 6:
			System.out.println("� sexta feira");
			break;

		default:
			System.out.println("� sabado");
			break;

		}
	}
}


