package factorymethod.sample02;

public abstract class CarroFactory {

	public Carro criarCarro(ModeloCarro modelo) {

		switch (modelo) {

		case CELTA:
			return new Celta();
		case FIESTA: 
			return new Fiesta();
		case GOL:
			return new GOL();
		case PALIO: 
			return new Palio();
		default:
			break;
		}
		
		return null;
	}
}
