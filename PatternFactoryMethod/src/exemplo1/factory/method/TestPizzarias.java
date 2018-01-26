package exemplo1.factory.method;

import exemplo1.Pizza;

public class TestPizzarias {

	public static void main(String[] args) {
		
		/**
		 * SAO PAULO
		 */
		PizzaFactory pizzaSP = new PizzaFactorySaoPaulo();
		pizzaSP.criarPizza("queijo");
		Pizza pizza = pizzaSP.delivery();
		
		System.out.println(pizza);
		
		/**
		 * RIO DE JANEIRO
		 */
		PizzaFactory pizzaRJ = new PizzaFactoryRioDeJaneiro();
		pizzaRJ.criarPizza("calabresa");
		pizza = pizzaRJ.delivery();
		
		System.out.println(pizza);
	}
}
