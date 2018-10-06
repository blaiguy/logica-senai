package exemplos;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas {
	public static void main(String[] args) {

		String[] nomes = { "Masundidi", "Fulano", "Ciclano", "Beltrano" };

		ArrayList<String> listaNomes = new ArrayList<>();

		// add - adicione um elemento na lista
		listaNomes.add("Masundidi");
		listaNomes.add("Fulano");
		listaNomes.add("Ciclano");
		listaNomes.add("Beltrano");

		// Imprimir a lista
		System.out.println(listaNomes);

		// size - mostra a quantidade de elementos na lista
		int tamanholistaNomes = listaNomes.size();
		System.out.println("ArrayList: " + tamanholistaNomes);

		int tamanhoArraysNomes = nomes.length;
		System.out.println("Array:" + tamanhoArraysNomes);

		// contains(obj) - verifica um elemento existe na coleção
		boolean existeNome = listaNomes.contains("Fulano");
		System.out.println(existeNome);

		existeNome = listaNomes.contains("José");
		System.out.println(existeNome);

		// remove (obj) - remove um elemento na lista
		boolean foiRemovido = listaNomes.remove("Masundidi");
		System.out.println(foiRemovido);

		// Imprimir a lista
		System.out.println(listaNomes);
		
		// get - obter elemrnto através de seu indice
		String nomeEscolhido = listaNomes.get(1);
		System.out.println(nomeEscolhido);
		
		//indexof -mobter o indice do elemento através do seu nome
		System.out.println(" = indexOf================");
		int indiceDoBeltrano = listaNomes.indexOf("Beltrano");
		String Beltrano = listaNomes.get(indiceDoBeltrano);
		System.out.println(Beltrano);
		
		// addAll(Collection) - adiciona uma outra lista dentro dessa 
		System.out.println("=addAll =================");
		ArrayList<String> listaDeOutrosNomes = new ArrayList<>();
		
		listaDeOutrosNomes.add("Charmander");
		listaDeOutrosNomes.add("Squirtle");
		listaDeOutrosNomes.add("Bulbaseur");
		

		listaNomes.addAll(listaDeOutrosNomes);
		
		System.out.println(listaNomes);
	}

}
