
public class Personagem {
		
	private String nomePersonagem;
	private String genero;
	private String corPele;
	private String corCabelo;
	private String oculos;
	public String getNomePersonagem() {
		return nomePersonagem;
	}
	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCorPele() {
		return corPele;
	}
	public void setCorPele(String corPele) {
		this.corPele = corPele;
	}
	public String getCorCabelo() {
		return corCabelo;
	}
	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}
	public String getOculos() {
		return oculos;
	}
	public void setOculos(String oculos) {
		this.oculos = oculos;
	}
	public Personagem(String nomePersonagem, String genero, String corPele, String corCabelo, String oculos) {
		super();
		this.nomePersonagem = nomePersonagem;
		this.genero = genero;
		this.corPele = corPele;
		this.corCabelo = corCabelo;
		this.oculos = oculos;
	}
	@Override
	public String toString() {
		return "Personagem [nomePersonagem=" + nomePersonagem + ", genero=" + genero + ", corPele=" + corPele
				+ ", corCabelo=" + corCabelo + ", oculos=" + oculos + "]";
	}
	
	
}
