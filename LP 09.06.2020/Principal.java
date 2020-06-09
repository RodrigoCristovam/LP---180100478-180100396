import java.util.Scanner;

public class Principal {

	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinSearchTree t = new BinSearchTree();

		// Ordem que criar� uma �rvore bin�ria perfeita com 16 valores no �ltimo n�vel
		// de n�s
		int[] sequencia = { 16, 8, 4, 2, 1, 3, 6, 5, 7, 12, 10, 9, 11, 14, 13, 15, 24, 20, 18, 17, 19, 22, 21, 23, 28,
				26, 25, 27, 30, 29, 31 };

		String pronto;

		// Lista de personagens
		Personagem[] personagensArray = new Personagem[16];

		Personagem joao = new Personagem("Jo�o", "Masculino", "Pele clara", "Cabelo castanho", "Usa �culos");
		Personagem ana = new Personagem("Ana", "Feminino", "Pele escura", "Cabelo loiro", "Usa �culos");
		Personagem rodrigo = new Personagem("Rodrigo", "Masculino", "Pele escura", "Cabelo loiro", "Usa �culos");
		Personagem raquel = new Personagem("Raquel", "Feminino", "Pele escura", "Cabelo loiro", "N�o usa �culos");
		Personagem miguel = new Personagem("Miguel", "Masculino", "Pele clara", "Cabelo loiro", "Usa �culos");
		Personagem jose = new Personagem("Jos�", "Masculino", "Pele clara", "Cabelo loiro", "N�o usa �culos");
		Personagem guilherme = new Personagem("Guilherme", "Masculino", "Pele escura", "Cabelo castanho",
				"N�o usa �culos");
		Personagem daniela = new Personagem("Daniela", "Feminino", "Pele clara", "Cabelo castanho", "N�o usa �culos");
		Personagem maria = new Personagem("Maria", "Feminino", "Pele clara", "Cabelo loiro", "Usa �culos");
		Personagem rui = new Personagem("Rui", "Masculino", "Pele escura", "Cabelo castanho", "Usa �culos");
		Personagem marta = new Personagem("Marta", "Feminino", "Pele clara", "Cabelo loiro", "N�o usa �culos");
		Personagem ines = new Personagem("In�s", "Feminino", "Pele escura", "Cabelo castanho", "Usa �culos");
		Personagem manuel = new Personagem("Manuel", "Masculino", "Pele escura", "Cabelo loiro", "N�o usa �culos");
		Personagem diana = new Personagem("Diana", "Feminino", "Pele escura", "Cabelo castanho", "N�o usa �culos");
		Personagem pedro = new Personagem("Pedro", "Masculino", "Pele clara", "Cabelo castanho", "N�o usa �culos");
		Personagem joana = new Personagem("Joana", "Feminino", "Pele clara", "Cabelo castanho", "Usa �culos");

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

		System.out.println(personagensArray[0].getNomePersonagem());
		// Inserir valores na �rvore bin�ria que depois iram representar as perguntas
		// que ser�o feitas ao utilizador
		// Estes insertes originam uma �rvore bin�ria perfeita, onde cada n� tem 0 ou 2
		// filhos.
		// Em cada n�vel de n�s � feita uma pergunta pergunta para os valores

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
		do {
			if (!pronto.equals("s") && !pronto.equals("S") && !pronto.equals("n") && !pronto.equals("N")) {
				System.out.println("Op��o Inv�lida. Escreva S ou N");
				pronto = ler.next();
			}

			else if (pronto.equals("N") || pronto.equals("n")) {
				System.out.println("E agora?");
				pronto = ler.next();
			}

		} while (!pronto.equals("S") && !pronto.equals("s"));

		int numeroPersonagem = imprimeNomes();
		System.out.println("Caracter�sticas do " + personagensArray[numeroPersonagem - 1].getNomePersonagem() + ":");
		System.out.println("G�nero: " + personagensArray[numeroPersonagem - 1].getGenero() + ".");
		System.out.println("Cor da pele: " + personagensArray[numeroPersonagem - 1].getCorPele() + ".");
		System.out.println("Cor do cabelo: " + personagensArray[numeroPersonagem - 1].getCorCabelo() + ".");
		System.out.println(personagensArray[numeroPersonagem - 1].getOculos() + ".");
		System.out.println();

		System.out.println("Decorou? Podemos come�ar com as perguntas?");
		pronto = ler.next();
		do {
			if (!pronto.equals("s") && !pronto.equals("S") && !pronto.equals("n") && !pronto.equals("N")) {
				System.out.println("Op��o Inv�lida. Escreva S ou N");
				pronto = ler.next();
			}

			else if (pronto.equals("N") || pronto.equals("n")) {
				System.out.println("E agora?");
				pronto = ler.next();
			}

		} while (!pronto.equals("S") && !pronto.equals("s"));

		switch (numeroPergunta) {
		case 16:
			System.out.println("� rapaz?");
		}
	}

	public static int imprimeNomes() {
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
		System.out.println("");

		int numeroEscolhido = ler.nextInt();
		return numeroEscolhido;
	}

}
