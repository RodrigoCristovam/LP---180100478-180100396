import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler = new Scanner (System.in);
		
		BinSearchTree t = new BinSearchTree();
		
		//Ordem que criará uma árvore binária perfeita com 16 valores no último nível de nós
		int[] sequencia ={16,8,4,2,1,3,6,5,7,12,10,9,11,14,13,15,24,20,18,17,19,22,21,23,28,26,25,27,30,29,31};
		
		String pronto;
		int numeroEscolhido;
		int numeroPersonagem;
		
		//Lista de personagens	
		Personagem joao = new Personagem("João", "Rapaz", "Pele clara", "Cabelo castanho", "Usa Óculos", 1);
		Personagem ana = new Personagem("Ana", "Rapariga", "Pele escura", "Cabelo loiro", "Usa óculos", 29);
		Personagem rodrigo = new Personagem("Rodrigo","Rapaz", "Pele escura", "Cabelo loiro", "Usa óculos",13);
		Personagem raquel = new Personagem("Raquel", "Rapariga", "Pele escura", "Cabelo loiro", "Não usa óculos",31);
		Personagem miguel = new Personagem("Miguel","Rapaz", "Pele clara", "Cabelo loiro", "Usa óculos",5);
		Personagem jose = new Personagem("José","Rapaz", "Pele clara", "Cabelo loiro", "Não usa óculos",7);
		Personagem guilherme = new Personagem("Guilherme","Rapaz", "Pele escura", "Cabelo castanho", "Não usa óculos",11);
		Personagem daniela = new Personagem("Daniela","Rapariga", "Pele clara", "Cabelo castanho", "Não usa óculos",19);
		Personagem maria = new Personagem("Maria" ,"Rapariga", "Pele clara", "Cabelo loiro", "Usa óculos",21);
		Personagem rui = new Personagem("Rui" ,"Rapaz", "Pele escura", "Cabelo castanho", "Usa óculos", 9);
		Personagem marta = new Personagem("Marta","Rapariga", "Pele clara", "Cabelo loiro", "Não usa óculos",23);
		Personagem ines = new Personagem("Inês","Rapariga", "Pele escura", "Cabelo castanho", "Usa óculos",25);
		Personagem manuel = new Personagem("Manuel" ,"Rapaz", "Pele escura", "Cabelo loiro", "Não usa óculos",15);
		Personagem diana = new Personagem("Diana","Rapariga", "Pele escura", "Cabelo castanho", "Não usa óculos",27);
		Personagem pedro = new Personagem("Pedro","Rapaz", "Pele clara", "Cabelo castanho", "Não usa óculos",3);
		Personagem joana = new Personagem("Joana" ,"Rapariga", "Pele clara", "Cabelo castanho", "Usa óculos",17);
		
		
		
		//Inserir valores na árvore binária que depois iram representar as perguntas que serão feitas ao utilizador
		//Estes insertes originam uma árvore binária perfeita, onde cada nó tem 0 ou 2 filhos.
		//Em cada nível de nós é feita uma pergunta pergunta para os valores 
				
		for (int i = 0; i < sequencia.length; i++) {
			//System.out.println(sequencia[i]);
			t.inserir(sequencia[i]);
		}
		
		NoBinTree no = t.procurar(sequencia[0]);
//		System.out.println();
//		System.out.println( "Árvore a partir do nó 6" );
		System.out.println(no.getValor());
		
		/*if(no.getValor()==8) {
			System.out.println();
		}*/
		
	        
		
            System.out.println("********************************************************************");
            System.out.println("                         JOGO do Quem é Quem?                       ");
            System.out.println("                                                                    ");
            System.out.println("REGRAS:                                                             ");
            System.out.println(" 1) Da lista de personagens que lhe iremos mostrar, escolha uma     ");
            System.out.println(" e decore as suas características.                                  "); 
            System.out.println(" 2) Serão feitas perguntas sobre essa personagem e o seu papel será ");
            System.out.println(" responder com sim ou não (S/N) de maneira a que o computador       ");
            System.out.println(" adivinhe qual a personagem que você escolheu.                      ");
            System.out.println("                                                                    ");
            System.out.println("                  Está pronto para iniciar o jogo?                  ");
            System.out.println("                          Sim ou não (S/N)                          ");
            System.out.println("********************************************************************");
            
            pronto = ler.next();
            
            
            if (!pronto.equals("s") && !pronto.equals("S") && !pronto.equals("n") && !pronto.equals("N")) {
                System.out.println("Opção Inválida. Escreva S ou N");
            }
            
            else if(pronto.equals("S") || pronto.equals("s")) {
                System.out.println("Aqui estão as personagens. Escolha uma ao inserir o seu número:");
                System.out.print("");
                System.out.print(" 1)João;"); 
                System.out.print(" 2)Miguel;");
                System.out.print(" 3)Joana;");
                System.out.print(" 4)José;");
                System.out.println(" 5)Rui;");
                System.out.print(" 6)Guilherme;");
                System.out.print(" 7)Rodrigo;");
                System.out.print(" 8)Manuel;");
                System.out.println(" 9)Pedro;");
                System.out.print(" 10)Daniela;");
                System.out.print(" 11)Maria;"); 
                System.out.print(" 12)Marta;");
                System.out.println(" 13)Inês;");
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
