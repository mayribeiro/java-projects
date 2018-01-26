package exemplo1.abstrac.factory;

import exemplo1.Massa;
import exemplo1.MassaFina;
import exemplo1.Molho;
import exemplo1.MolhoDaRoca;
import exemplo1.Queijo;
import exemplo1.QueijoParmesao;
import exemplo1.Salsa;
import exemplo1.SalsaNobreApimentada;

public class PizzaRJIngredientesFactory extends PizzaIngredientesFactory {

	@Override
	public Massa criarMassa() {
		return new MassaFina();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoParmesao();
	}

	@Override
	public Molho criarMolho() {
		return new MolhoDaRoca();
	}

	@Override
	public Salsa criarSalsa() {
		return new SalsaNobreApimentada();
	}

}
