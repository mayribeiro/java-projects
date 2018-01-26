package exemplo1;

public class PizzaQuatroQueijos extends Pizza {

	private String cidade;
	
	private Massa massa;
	
	private Queijo queijo;
	
	private Molho molho;
	
	private Salsa salsa;
	
	public PizzaQuatroQueijos(String cidade) {
		this.cidade = cidade;
	}
	
	public void prepara() {
		
		if (cidade.equals("sao-paulo")) {
			massa = new MassaGrossa();
			queijo = new QueijoMinas();
			molho = new MolhoMarroquino();
			salsa = new SalsaNobre();
		} else {
			massa = new MassaFina();
			queijo = new QueijoParmesao();
			molho = new MolhoDaRoca();
			salsa = new SalsaNobreApimentada();
		}
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
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
