package composite;

public class Buscador {
	private Conteudo base;

	public String getBase() {
		if(this.base == null) {
			throw new NullPointerException("Base não encontrada");
		}
		return base.getConteudo();
	}

	public void setBase(Conteudo base) {
		this.base = base;
	}
}
