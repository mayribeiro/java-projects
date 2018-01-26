package strategy.sample01;

public class CalculoDiaria implements CalculoValor {

	private static final long HORA = 0;
	
	private double valorDiaria; 
	
	public CalculoDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	public double calcular(long tempo, Veiculo veiculo) {
		return valorDiaria * Math.ceil(tempo / HORA);
	}

}
