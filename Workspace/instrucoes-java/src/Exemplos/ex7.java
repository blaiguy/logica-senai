package Exemplos;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] cedulas = {100, 50, 20, 10, 5, 2, 1};
 int saque = 1233;
 int x;
 for (int  i = 0; i < 7; i++) {
	 x = saque / cedulas [i];
	 //saque = saque - x*	cedulas [i];	
	 saque = saque  % cedulas [i];	
	 System.out.println("Notas de "+cedulas [i] +":"+x );
	 
 }
	}

}
