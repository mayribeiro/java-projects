package exemplo1.factory.method;

import exemplo1.RJPizzaCalabresa;
import exemplo1.RJPizzaPortuguesa;
import exemplo1.RJPizzaQuatroQueijos;

/**
 * Fabrica concreta 
 * @author macbookpro
 *
 */
public class PizzaFactoryRioDeJaneiro extends PizzaFactory {

	@Override
	public void criarPizza(String tipo) {
	
		if (tipo.equals("queijo")) {
			pizza = new RJPizzaQuatroQueijos();
		} else if (tipo.equals("portuguesa")) {
			pizza = new RJPizzaPortuguesa();
		} else if (tipo.equals("calabresa")) {
			pizza = new RJPizzaCalabresa();
		}

	}

}
