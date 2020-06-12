
public class BinSearchTree {
	
	private NoBinTree raiz;
	
	
	private void inserir( int num, NoBinTree pai ) {
		if( pai.getValor() > num ) {
			// Segue pela esquerda
			if( pai.getFilhoEsquerda() == null) {
				NoBinTree novo = new NoBinTree(num);
				pai.setFilhoEsquerda(novo);
			}
			else
				inserir( num, pai.getFilhoEsquerda() );
			
		}
		else if(  pai.getValor() < num ) {
			// Segue pela direita
			if( pai.getFilhoDireita() == null) {
				NoBinTree novo = new NoBinTree(num);
				pai.setFilhoDireita(novo);
			}
			else
				inserir( num, pai.getFilhoDireita() );
			
		}
		else
		{
			// num é igual a pai.getValor(), 
			// não são permitidos duplicados
			
			throw new IllegalArgumentException("não são permitidos valores duplicados !");	
		}		
	}
	
	
	public void inserir( int num ) {
		
		if( raiz == null ) {
			NoBinTree novo = new NoBinTree(num);
			raiz = novo;
		}
		else
			inserir(num, raiz);
			
	}
	
	public void inserirIterativo( int num ) {	
		NoBinTree novo = new NoBinTree(num);
		
		if( raiz == null ) {	
			raiz = novo;
		}
		else { 
			NoBinTree pai = raiz;
			
			boolean feito = false;
			
			while ( !feito ) {
				
				if( pai.getValor() > num ) {
					// Insere pela esquerda
					if( pai.getFilhoEsquerda() == null) {
						pai.setFilhoEsquerda(novo);
						feito = true;	
					}
					else
						pai = pai.getFilhoEsquerda();
					
				}
				else if(  pai.getValor() < num ) {
					// Insere pela direita
					if( pai.getFilhoDireita() == null) {
						pai.setFilhoDireita(novo);
						feito = true;
					}
					else
						pai = pai.getFilhoDireita();				
				}
				else
				{
					// num é igual a pai.getValor(), 
					// não são permitidos duplicados
					
					throw new IllegalArgumentException("não são permitidos valores duplicados !");	
				}	
			}	
			
		}
		
	}
	
	public NoBinTree procurar( int num ) {
		
		if( raiz == null ) {
			return null;
		}
		else
			return procurar(num, raiz);
			
	}
	
	
	private NoBinTree procurar( int num, NoBinTree no ) {
		
		if( no == null )
			return null;
		
		if( no.getValor() == num )
			return no;
		
		if( no.getValor() > num ) {
			// Segue pela esquerda
			return procurar( num, no.getFilhoEsquerda() );
		}
		else  {
			// Segue pela direita
			return procurar( num, no.getFilhoDireita() );
				
		}
	
	}
	
}
