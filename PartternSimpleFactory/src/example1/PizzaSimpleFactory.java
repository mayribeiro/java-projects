package example1;

/**
 * Classes final nao podem ser extendidas
 * 
 * Declarei o constructor como private para que ele nao possa ser intanciado
 * @author macbookpro
 *
 */
public final class PizzaSimpleFactory {
	
	private PizzaSimpleFactory() {}
	
	public static Pizza criarPizza(String tipo) {
		
		Pizza pizza = null;
		
		if (tipo.equals("queijo")) {
			pizza = (Pizza) new PizzaQuatroQueijos();
		} else if (tipo.equals("portuguesa")) {
			pizza = (Pizza) new PizzaPortuguesa();
		} else if (tipo.equals("calabresa")) {
			pizza = (Pizza) new PizzaCalabresa();
		} else if (tipo.equals("camarao")) {
			pizza = (Pizza) new PizzaCamarao();
		}
		
		return pizza;
	}

}
