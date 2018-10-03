package Exemplos;

public class ex4 {

	public static void main(String[] args) {
		
		int nota []= {3,5,7,8};
		int media = 0;
		
		for (int i = 0; i < 4; i++) 	{
			 int v = nota[i];
		media += v;  
		
	}

	media = media/ nota.length;
	if(media>=5) {

	
		System.out.println("passou");
	} else {

		System.out.println("errou");
	}

}

}