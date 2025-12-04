package composite;

public abstract class Conteudo {
	private String html;

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public Conteudo(String html) {
		super();
		this.html = html;
	}
	
	public abstract String getConteudo();
}
