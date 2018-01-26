package exemplo1.abstrac.factory;

import exemplo1.Massa;
import exemplo1.Molho;
import exemplo1.Queijo;
import exemplo1.Salsa;

public abstract class PizzaIngredientesFactory {

	public abstract Massa criarMassa();
	public abstract Queijo criarQueijo();
	public abstract Molho criarMolho();
	public abstract Salsa criarSalsa();	
	
}
