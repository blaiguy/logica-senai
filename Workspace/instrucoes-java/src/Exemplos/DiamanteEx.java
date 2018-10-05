package Exemplos;

public class DiamanteEx {

	public static void main(String[] args) {

		int d = 0;
		int centro = 15;
		for (int j = 0; j < 10; j++) {
			int esquerda = centro - d;
			int direita = centro + d;

			for (int i = 0; i < 11; i++) {
				if (i <= esquerda) {
					System.out.print(" ");
				} else if (i >= direita) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			if (j < 5) {
				d++;
			} else {
				d--;
			}
		}
	}
}
