import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler = new Scanner (System.in);
		
		BinSearchTree t = new BinSearchTree();
		
		//Ordem que criar� uma �rvore bin�ria perfeita com 16 valores no �ltimo n�vel de n�s
		int[] sequencia ={16,8,4,2,1,3,6,5,7,12,10,9,11,14,13,15,24,20,18,17,19,22,21,23,28,26,25,27,30,29,31};
		
		String pronto;
		int numeroEscolhido;
		int numeroPersonagem;
		
		//Lista de personagens	
		Personagem joao = new Personagem("Jo�o", "Rapaz", "Pele clara", "Cabelo castanho", "Usa �culos", 1);
		Personagem ana = new Personagem("Ana", "Rapariga", "Pele escura", "Cabelo loiro", "Usa �culos", 29);
		Personagem rodrigo = new Personagem("Rodrigo","Rapaz", "Pele escura", "Cabelo loiro", "Usa �culos",13);
		Personagem raquel = new Personagem("Raquel", "Rapariga", "Pele escura", "Cabelo loiro", "N�o usa �culos",31);
		Personagem miguel = new Personagem("Miguel","Rapaz", "Pele clara", "Cabelo loiro", "Usa �culos",5);
		Personagem jose = new Personagem("Jos�","Rapaz", "Pele clara", "Cabelo loiro", "N�o usa �culos",7);
		Personagem guilherme = new Personagem("Guilherme","Rapaz", "Pele escura", "Cabelo castanho", "N�o usa �culos",11);
		Personagem daniela = new Personagem("Daniela","Rapariga", "Pele clara", "Cabelo castanho", "N�o usa �culos",19);
		Personagem maria = new Personagem("Maria" ,"Rapariga", "Pele clara", "Cabelo loiro", "Usa �culos",21);
		Personagem rui = new Personagem("Rui" ,"Rapaz", "Pele escura", "Cabelo castanho", "Usa �culos", 9);
		Personagem marta = new Personagem("Marta","Rapariga", "Pele clara", "Cabelo loiro", "N�o usa �culos",23);
		Personagem ines = new Personagem("In�s","Rapariga", "Pele escura", "Cabelo castanho", "Usa �culos",25);
		Personagem manuel = new Personagem("Manuel" ,"Rapaz", "Pele escura", "Cabelo loiro", "N�o usa �culos",15);
		Personagem diana = new Personagem("Diana","Rapariga", "Pele escura", "Cabelo castanho", "N�o usa �culos",27);
		Personagem pedro = new Personagem("Pedro","Rapaz", "Pele clara", "Cabelo castanho", "N�o usa �culos",3);
		Personagem joana = new Personagem("Joana" ,"Rapariga", "Pele clara", "Cabelo castanho", "Usa �culos",17);
		
		
		
		//Inserir valores na �rvore bin�ria que depois iram representar as perguntas que ser�o feitas ao utilizador
		//Estes insertes originam uma �rvore bin�ria perfeita, onde cada n� tem 0 ou 2 filhos.
		//Em cada n�vel de n�s � feita uma pergunta pergunta para os valores 
				
		for (int i = 0; i < sequencia.length; i++) {
			//System.out.println(sequencia[i]);
			t.inserir(sequencia[i]);
		}
		
		NoBinTree no = t.procurar(sequencia[0]);
//		System.out.println();
//		System.out.println( "�rvore a partir do n� 6" );
		System.out.println(no.getValor());
		
		/*if(no.getValor()==8) {
			System.out.println();
		}*/
		
	        
		
            System.out.println("********************************************************************");
            System.out.println("                         JOGO do Quem � Quem?                       ");
            System.out.println("                                                                    ");
            System.out.println("REGRAS:                                                             ");
            System.out.println(" 1) Da lista de personagens que lhe iremos mostrar, escolha uma     ");
            System.out.println(" e decore as suas caracter�sticas.                                  "); 
            System.out.println(" 2) Ser�o feitas perguntas sobre essa personagem e o seu papel ser� ");
            System.out.println(" responder com sim ou n�o (S/N) de maneira a que o computador       ");
            System.out.println(" adivinhe qual a personagem que voc� escolheu.                      ");
            System.out.println("                                                                    ");
            System.out.println("                  Est� pronto para iniciar o jogo?                  ");
            System.out.println("                          Sim ou n�o (S/N)                          ");
            System.out.println("********************************************************************");
            
            pronto = ler.next();
            
            
            if (!pronto.equals("s") && !pronto.equals("S") && !pronto.equals("n") && !pronto.equals("N")) {
                System.out.println("Op��o Inv�lida. Escreva S ou N");
            }
            
            else if(pronto.equals("S") || pronto.equals("s")) {
                System.out.println("Aqui est�o as personagens. Escolha uma ao inserir o seu n�mero:");
                System.out.print("");
                System.out.print(" 1)Jo�o;"); 
                System.out.print(" 2)Miguel;");
                System.out.print(" 3)Joana;");
                System.out.print(" 4)Jos�;");
                System.out.println(" 5)Rui;");
                System.out.print(" 6)Guilherme;");
                System.out.print(" 7)Rodrigo;");
                System.out.print(" 8)Manuel;");
                System.out.println(" 9)Pedro;");
                System.out.print(" 10)Daniela;");
                System.out.print(" 11)Maria;"); 
                System.out.print(" 12)Marta;");
                System.out.println(" 13)In�s;");
                System.out.print(" 14)Diana;");
                System.out.print(" 15)Ana;"); 
                System.out.print(" 16)Raquel;");
                
                numeroEscolhido = ler.nextInt();
                
                
            }
            else if(pronto.equals("N") || pronto.equals("n")) {
            	System.out.println("disses te nao");
            }
            
	}

}
