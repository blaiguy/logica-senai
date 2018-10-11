package Exercicios;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int proximo=0,atual=0,anterior=1;
		while(proximo<=10){
		    proximo=atual+anterior;
			System.out.print(proximo+",");
			anterior=atual;
			atual=proximo;
		}
	}

}
