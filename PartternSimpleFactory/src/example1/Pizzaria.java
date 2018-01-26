package example1;

/**
 * Lembre que quanto menor o escopo das entidades do projeto melhor será para atualizar e
 * evoluir seu software
 * @author macbookpro
 *
 */
public class Pizzaria {

	private Pizza pizza;
	
	public void criarPizza(String tipo) {
		
		//PizzaSimpleFactory pizzaSimpleFactory = new PizzaSimpleFactory();
		pizza = PizzaSimpleFactory.criarPizza("queijo");
		
		//pizza = pizzaSimpleFactory.criarPizza("queijo");
		System.out.println(pizza);
	}
}
