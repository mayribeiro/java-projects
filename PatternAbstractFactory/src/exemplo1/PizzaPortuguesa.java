package exemplo1;

public class PizzaPortuguesa extends Pizza {

	private String cidade;
	
	public PizzaPortuguesa(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
