package composite;

import java.util.ArrayList;
import java.util.List;

public class Site extends Conteudo {
	private List<Conteudo> paginas;

	public Site(String html) {
		super(html);
		this.paginas = new ArrayList<Conteudo>();
	}
	
	public void addPagina(Conteudo conteudo) {
		this.paginas.add(conteudo);
	}

	@Override
	public String getConteudo() {
		String conteudo = "<site>";
		for(Conteudo pagina : paginas){
			conteudo += pagina.getConteudo();
		}
		conteudo += "</site>";
		return conteudo;
	}

}
