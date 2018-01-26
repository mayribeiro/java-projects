package exemplo1.abstrac.factory;

import exemplo1.Massa;
import exemplo1.Molho;
import exemplo1.Pizza;
import exemplo1.Queijo;
import exemplo1.Salsa;

public class PizzaPortuguesa extends Pizza {

	private PizzaIngredientesFactory ingredientesFactory;
	
	private Massa massa;
	
	private Queijo queijo;
	
	private Molho molho;
	
	private Salsa salsa;

	public PizzaPortuguesa(PizzaIngredientesFactory ingredientesFactory) {
		this.ingredientesFactory = ingredientesFactory;
	}
	
	public void prepara() {
		massa = ingredientesFactory.criarMassa();
		queijo = ingredientesFactory.criarQueijo();
		molho = ingredientesFactory.criarMolho();
		salsa = ingredientesFactory.criarSalsa();
	}

	public PizzaIngredientesFactory getIngredientesFactory() {
		return ingredientesFactory;
	}

	public void setIngredientesFactory(PizzaIngredientesFactory ingredientesFactory) {
		this.ingredientesFactory = ingredientesFactory;
	}

	public Massa getMassa() {
		return massa;
	}

	public void setMassa(Massa massa) {
		this.massa = massa;
	}

	public Queijo getQueijo() {
		return queijo;
	}

	public void setQueijo(Queijo queijo) {
		this.queijo = queijo;
	}

	public Molho getMolho() {
		return molho;
	}

	public void setMolho(Molho molho) {
		this.molho = molho;
	}

	public Salsa getSalsa() {
		return salsa;
	}

	public void setSalsa(Salsa salsa) {
		this.salsa = salsa;
	}

}
