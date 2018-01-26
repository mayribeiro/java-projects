package nullobject.sample02;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not available in customer database.";
	}

}
