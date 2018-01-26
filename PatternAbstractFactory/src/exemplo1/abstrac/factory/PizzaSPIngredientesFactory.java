package exemplo1.abstrac.factory;

import exemplo1.Massa;
import exemplo1.MassaGrossa;
import exemplo1.Molho;
import exemplo1.MolhoMarroquino;
import exemplo1.Queijo;
import exemplo1.QueijoMinas;
import exemplo1.Salsa;
import exemplo1.SalsaNobre;

public class PizzaSPIngredientesFactory extends PizzaIngredientesFactory {

	@Override
	public Massa criarMassa() {
		return new MassaGrossa();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoMinas();
	}

	@Override
	public Molho criarMolho() {
		return new MolhoMarroquino();
	}

	@Override
	public Salsa criarSalsa() {
		return new SalsaNobre();
	}

}
