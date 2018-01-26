package strategy.sample02;

public class CalculoImpostoVinteOuQuinze implements CalculaImposto {

	@Override
	public double calcularSalarioComImposto(Funcionario umFuncionario) {
		
		if (umFuncionario.getSalarioBase() > 35000) {
			return umFuncionario.getSalarioBase() * 0.85;
		}
		
		return umFuncionario.getSalarioBase() * 0.8;
	}

}
