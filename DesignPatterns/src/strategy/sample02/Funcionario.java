package strategy.sample02;

public class Funcionario {
	
	private static final int DESENVOLVEDOR = 0;
	private static final int DBA = 1;
	private static final int GERENTE = 2;

	private CalculaImposto calculaImposto;

	private double salarioBase;
	
	public Funcionario(int cargo, double salarioBase) {
		this.salarioBase = salarioBase;
		
		switch (cargo) {
		case DESENVOLVEDOR:
			calculaImposto = new CalculoImpostoQuinzeOuDez();
			cargo = DESENVOLVEDOR;
			break;
		case DBA:
			calculaImposto = new CalculoImpostoQuinzeOuDez();
			cargo = DBA;
			break;
		case GERENTE:
			calculaImposto = new CalculoImpostoVinteOuQuinze();
			cargo = GERENTE;
			break;

		default:
			throw new RuntimeException("Cargo não encontrado :/");
		}
	}
	
	public double calcularSalarioComImposto() {
	    return calculaImposto.calcularSalarioComImposto(this);
	}
	
	public CalculaImposto getCalculaImposto() {
		return calculaImposto;
	}

	public void setCalculaImposto(CalculaImposto calculaImposto) {
		this.calculaImposto = calculaImposto;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
}
