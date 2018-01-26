package strategy.sample01;

public class Calculo15Minutos implements CalculoValor {

	private static final long HORA = 0;
	
	private double valorPeriodo; 
	
	public Calculo15Minutos(double valorPeriodo) {
		this.valorPeriodo = valorPeriodo;
	}

	@Override
	public double calcular(long tempo, Veiculo veiculo) {
		return valorPeriodo * Math.ceil(tempo / HORA);
	}

}
