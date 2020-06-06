
public class Principal {

	public static void main(String[] args) {
		
		BinSearchTree t = new BinSearchTree();
		
		//Ordem que criará uma árvore binária perfeita com 16 valores no último nível de nós
		int[] sequencia ={16,8,4,2,1,3,6,5,7,12,10,9,11,14,13,15,24,20,18,17,19,22,21,23,28,26,25,27,30,29,31};
		
		//Inserir valores na árvore binária que depois iram representar as perguntas que serão feitas ao utilizador
		for (int i = 0; i < sequencia.length; i++) {
			//System.out.println(sequencia[i]);
			t.inserir(sequencia[i]);
		}
		
		
		//Ester insertes originam uma árvore binária perfeita, onde cada nó tem 0 ou 2 filhos.
		//Em cada nível de nós 
		
		//A pergunta para os valores 
		
		NoBinTree no = t.procurar(sequencia[1]);
//		System.out.println();
//		System.out.println( "Árvore a partir do nó 6" );
		System.out.println( no.getValor() );
		
//		no = t.procurar(25);
//		System.out.println( "Árvore a partir do nó 25" );
//		System.out.println( no );
		
	}

}
