package exemplo1.factory.method;

import exemplo1.Pizza;

/**
 * Factory Method
 * @author macbookpro
 *
 */
public abstract class PizzaFactory {

	protected Pizza pizza;
	
	public abstract void criarPizza(String tipo);
	
	public Pizza delivery() {
		return this.pizza;
	}
}
