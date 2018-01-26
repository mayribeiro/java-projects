package strategy.sample02;

public class Test {

	public static void main(String[] args) {
		
		Funcionario maycon = new Funcionario(0, 1500);
		double salarioImpostoMaycon = maycon.calcularSalarioComImposto();
		System.out.println(salarioImpostoMaycon);
		
		Funcionario joao = new Funcionario(1, 1500);
		double salarioImpostoJoao = joao.calcularSalarioComImposto();
		System.out.println(salarioImpostoJoao);
		
		Funcionario jose = new Funcionario(2, 1500);
		double salarioImpostoJose = jose.calcularSalarioComImposto();
		System.out.println(salarioImpostoJose);
	}
}
