import java.util.Scanner;

public class Principal {

	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinSearchTree t = new BinSearchTree();

		// Ordem que criará uma árvore binária perfeita com 16 valores no último nível
		// de nós
		int[] sequencia = { 16, 8, 4, 2, 1, 3, 6, 5, 7, 12, 10, 9, 11, 14, 13, 15, 24, 20, 18, 17, 19, 22, 21, 23, 28,
				26, 25, 27, 30, 29, 31 };

		String pronto;
		String decisao;

		// Lista de personagens
		Personagem[] personagensArray = new Personagem[16];

		Personagem joao = new Personagem("João", "Masculino", "Pele clara", "Cabelo castanho", "Usa Óculos");
		Personagem ana = new Personagem("Ana", "Feminino", "Pele escura", "Cabelo loiro", "Usa óculos");
		Personagem rodrigo = new Personagem("Rodrigo", "Masculino", "Pele escura", "Cabelo loiro", "Usa óculos");
		Personagem raquel = new Personagem("Raquel", "Feminino", "Pele escura", "Cabelo loiro", "Não usa óculos");
		Personagem miguel = new Personagem("Miguel", "Masculino", "Pele clara", "Cabelo loiro", "Usa óculos");
		Personagem jose = new Personagem("José", "Masculino", "Pele clara", "Cabelo loiro", "Não usa óculos");
		Personagem guilherme = new Personagem("Guilherme", "Masculino", "Pele escura", "Cabelo castanho","Não usa óculos");
		Personagem daniela = new Personagem("Daniela", "Feminino", "Pele clara", "Cabelo castanho", "Não usa óculos");
		Personagem maria = new Personagem("Maria", "Feminino", "Pele clara", "Cabelo loiro", "Usa óculos");
		Personagem rui = new Personagem("Rui", "Masculino", "Pele escura", "Cabelo castanho", "Usa óculos");
		Personagem marta = new Personagem("Marta", "Feminino", "Pele clara", "Cabelo loiro", "Não usa óculos");
		Personagem ines = new Personagem("Inês", "Feminino", "Pele escura", "Cabelo castanho", "Usa óculos");
		Personagem manuel = new Personagem("Manuel", "Masculino", "Pele escura", "Cabelo loiro", "Não usa óculos");
		Personagem diana = new Personagem("Diana", "Feminino", "Pele escura", "Cabelo castanho", "Não usa óculos");
		Personagem pedro = new Personagem("Pedro", "Masculino", "Pele clara", "Cabelo castanho", "Não usa óculos");
		Personagem joana = new Personagem("Joana", "Feminino", "Pele clara", "Cabelo castanho", "Usa óculos");

		personagensArray[0] = joao;
		personagensArray[1] = ana;
		personagensArray[2] = rodrigo;
		personagensArray[3] = raquel;
		personagensArray[4] = miguel;
		personagensArray[5] = jose;
		personagensArray[6] = guilherme;
		personagensArray[7] = daniela;
		personagensArray[8] = maria;
		personagensArray[9] = rui;
		personagensArray[10] = marta;
		personagensArray[11] = ines;
		personagensArray[12] = manuel;
		personagensArray[13] = diana;
		personagensArray[14] = pedro;
		personagensArray[15] = joana;

		/*
		 * for(int i=0; i<personagensArray.length; i++){ personagensArray[i]= }
		 */

		//System.out.println(personagensArray[0].getNomePersonagem());
		// Inserir valores na árvore binária que depois iram representar as perguntas
		// que serão feitas ao utilizador
		// Estes insertes originam uma árvore binária perfeita, onde cada nó tem 0 ou 2
		// filhos.
		// Em cada nível de nós é feita uma pergunta pergunta para os valores

		for (int i = 0; i < sequencia.length; i++) {
			// System.out.println(sequencia[i]);
			t.inserir(sequencia[i]);
		}

		NoBinTree no = t.procurar(sequencia[0]);
		int numeroPergunta = no.getValor();

		/*
		 * if(no.getValor()==8) { System.out.println(); }
		 */

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
		do {
			if (!pronto.equals("s") && !pronto.equals("S") && !pronto.equals("n") && !pronto.equals("N")) {
				System.out.println("Opção Inválida. Escreva S ou N");
				pronto = ler.next();
			}

			else if (pronto.equals("N") || pronto.equals("n")) {
				System.out.println("E agora?");
				pronto = ler.next();
			}

		} while (!pronto.equals("S") && !pronto.equals("s"));

		int numeroPersonagem = imprimeNomes();

		System.out.println("Características do " + personagensArray[numeroPersonagem - 1].getNomePersonagem() + ":");
		System.out.println("Género: " + personagensArray[numeroPersonagem - 1].getGenero() + ".");
		System.out.println("Cor da pele: " + personagensArray[numeroPersonagem - 1].getCorPele() + ".");
		System.out.println("Cor do cabelo: " + personagensArray[numeroPersonagem - 1].getCorCabelo() + ".");
		System.out.println(personagensArray[numeroPersonagem - 1].getOculos() + ".");
		System.out.println();

		System.out.println("Decorou? Podemos começar com as perguntas?");
		pronto = ler.next();
		
		do {
			if (!pronto.equals("s") && !pronto.equals("S") && !pronto.equals("n") && !pronto.equals("N")) {
				System.out.println("Opção Inválida. Escreva S ou N");
				pronto = ler.next();
			}

			else if (pronto.equals("N") || pronto.equals("n")) {
				System.out.println("E agora?");
				pronto = ler.next();
			}

		} while (!pronto.equals("S") && !pronto.equals("s"));

		// Inicio das perguntas
		do {
		switch (numeroPergunta) {
		case 16:
			System.out.println("É rapaz?");
			decisao = ler.next();
			if (!pronto.equals("s") && !pronto.equals("S") && !pronto.equals("n") && !pronto.equals("N")) {
				do {
					System.out.println("Opção Inválida. Escreva S ou N");
					System.out.println("É rapaz?");
					pronto = ler.next();

				} while (!pronto.equals("s") && !pronto.equals("S") && !pronto.equals("n") && !pronto.equals("N"));
			}

			else if (pronto.equals("s") || pronto.equals("S")) {
				System.out.println("disse sim");
				// pronto = ler.next();
			} else if (pronto.equals("n") || pronto.equals("N")) {
				System.out.println("disse nao?");
				// pronto = ler.next();
			}
		}
		
		
		
		}while(numeroPergunta!=1 && numeroPergunta!=3 &&	numeroPergunta!=5 &&	numeroPergunta!=7 &&	numeroPergunta!=9 &&	numeroPergunta!=11 &&	numeroPergunta!=13 &&	numeroPergunta!=15 &&	numeroPergunta!=17 &&	
				numeroPergunta!=19 &&	numeroPergunta!=21 &&	numeroPergunta!=23 &&	numeroPergunta!=25 &&	numeroPergunta!=27 &&	numeroPergunta!=29 &&	numeroPergunta!=31);	
		
		}

	public static int imprimeNomes() {
		int numeroEscolhido=0;
		int numero;
		
		System.out.println("Aqui estão as personagens. Escolha uma ao inserir o seu número:");
		System.out.print("");
		System.out.print(" 1)João;");
		System.out.print(" 2)Ana;");
		System.out.print(" 3)Rodrigo;");
		System.out.println(" 4)Raquel;");
		System.out.print(" 5)Miguel;");
		System.out.print(" 6)José;");
		System.out.print(" 7)Guilherma;");
		System.out.println(" 8)Daniela;");
		System.out.print(" 9)Maria;");
		System.out.print(" 10)Rui;");
		System.out.print(" 11)Marta;");
		System.out.println(" 12)Inês;");
		System.out.print(" 13)Manuel;");
		System.out.print(" 14)Diana;");
		System.out.print(" 15)Pedro;");
		System.out.print(" 16)Joana;");
		System.out.println("");

		numero = ler.nextInt();	
		if(numero>16 || numero<1) {
		do {
		System.out.println("Caracter Inválido. Escolha um número válido!");
		numero = ler.nextInt();	
			} while(numero>16 || numero<1);	
		}
		numeroEscolhido=numero;
		
		return numeroEscolhido;		
	}
	
	public static void fazPerguntas() {
		
	}
}
