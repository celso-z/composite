package composite;

public class Pagina extends Conteudo {

	public Pagina(String html) {
		super(html);
	}

	@Override
	public String getConteudo() {
		return "<page>" + this.getHtml() + "</page>";
	}

}
