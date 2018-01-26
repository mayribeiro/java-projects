package strategy.sample02;

public class CalculoImpostoQuinzeOuDez implements CalculaImposto {

	@Override
	public double calcularSalarioComImposto(Funcionario umFuncionario) {
		
		if (umFuncionario.getSalarioBase() > 2000) {
			return umFuncionario.getSalarioBase() * 0.85;
		}
		
		return umFuncionario.getSalarioBase() * 0.9;
	}

}
