
public class Principal {

	public static void main(String[] args) {
		
		BinSearchTree t = new BinSearchTree();
		
		//Ordem que criar� uma �rvore bin�ria perfeita com 16 valores no �ltimo n�vel de n�s
		int[] sequencia ={16,8,4,2,1,3,6,5,7,12,10,9,11,14,13,15,24,20,18,17,19,22,21,23,28,26,25,27,30,29,31};
		
		//Inserir valores na �rvore bin�ria que depois iram representar as perguntas que ser�o feitas ao utilizador
		for (int i = 0; i < sequencia.length; i++) {
			//System.out.println(sequencia[i]);
			t.inserir(sequencia[i]);
		}
		
		
		//Ester insertes originam uma �rvore bin�ria perfeita, onde cada n� tem 0 ou 2 filhos.
		//Em cada n�vel de n�s 
		
		//A pergunta para os valores 
		
		NoBinTree no = t.procurar(sequencia[1]);
//		System.out.println();
//		System.out.println( "�rvore a partir do n� 6" );
		System.out.println( no.getValor() );
		
//		no = t.procurar(25);
//		System.out.println( "�rvore a partir do n� 25" );
//		System.out.println( no );
		
	}

}
