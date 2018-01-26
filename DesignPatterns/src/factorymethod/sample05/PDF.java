package factorymethod.sample05;

public class PDF implements Documento {

	@Override
	public void print() {
		System.out.println("Print Document pdf");
	}

}
