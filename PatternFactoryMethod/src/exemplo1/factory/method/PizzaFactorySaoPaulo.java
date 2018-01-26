package exemplo1.factory.method;

import exemplo1.SPPizzaCalabresa;
import exemplo1.SPPizzaPortuguesa;
import exemplo1.SPPizzaQuatroQueijos;

/**
 * Fabrica concreta 
 * @author macbookpro
 *
 */
public class PizzaFactorySaoPaulo extends PizzaFactory {

	@Override
	public void criarPizza(String tipo) {
	
		if (tipo.equals("queijo")) {
			pizza = new SPPizzaQuatroQueijos();
		} else if (tipo.equals("portuguesa")) {
			pizza = new SPPizzaPortuguesa();
		} else if (tipo.equals("calabresa")) {
			pizza = new SPPizzaCalabresa();
		}

	}

}
