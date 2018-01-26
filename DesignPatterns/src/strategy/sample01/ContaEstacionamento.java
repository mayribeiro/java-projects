package strategy.sample01;

/** 
 * 
 * CONTEXTO
 * 
 * **/
public class ContaEstacionamento {

	private CalculoValor calculoValor;
	
	private Veiculo veiculo;
	
	private long inicio;
	
	private long fim;
	
	public double valorConta() {
		return calculoValor.calcular(fim - inicio, veiculo);
	}

	public CalculoValor getCalculoValor() {
		return calculoValor;
	}

	public void setCalculoValor(CalculoValor calculoValor) {
		this.calculoValor = calculoValor;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public long getInicio() {
		return inicio;
	}

	public void setInicio(long inicio) {
		this.inicio = inicio;
	}

	public long getFim() {
		return fim;
	}

	public void setFim(long fim) {
		this.fim = fim;
	}
	
}
