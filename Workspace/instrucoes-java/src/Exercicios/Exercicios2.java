package Exercicios;

import java.util.Random;

public class Exercicios2 {
	public static void main(String[] args) {
		int n= new Random().nextInt (7) +1;

		switch (n) {
		case 1:
			System.out.println("é Domingo!");
			break;
		case 2:
			System.out.println("é Segunda!");
			break;
		case 3:
			System.out.println("é terca feira");
			break;
		case 4:
			System.out.println("é quarta feira!");
			break;
		case 5:
			System.out.println("é quinta feira!");
			break;
		case 6:
			System.out.println("é sexta feira");
			break;

		default:
			System.out.println("é sabado");
			break;

		}
	}
}


