package factorymethod.sample02;

public class FabricaVolksvagem implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new GOL();
	}

}
