package exemplo1;

public class PizzaCalabresa extends Pizza {

	private String cidade;
	
	public PizzaCalabresa(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
