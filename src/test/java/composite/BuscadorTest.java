package composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuscadorTest {

	@Test
	void deveRetornarBase() {
		Pagina p1 = new Pagina("<p1>");
		Pagina p2 = new Pagina("<p2>");
		Site s1 = new Site("<s1>");
		s1.addPagina(p1);
		s1.addPagina(p2);
		Buscador b1 = new Buscador();
		b1.setBase(s1);
		assertEquals("<site><page><p1></page><page><p2></page></site>", b1.getBase());
	}
	
	 @Test
	    void deveRetornarExecacaoBuscadorSemBase() {
	        try {
	            Buscador b= new Buscador();
	            b.getBase();
	            fail();
	        }
	        catch (NullPointerException e) {
	            assertEquals("Base não encontrada", e.getMessage());
	        }
	    }

}
