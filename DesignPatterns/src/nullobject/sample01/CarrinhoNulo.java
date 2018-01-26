package nullobject.sample01;

public class CarrinhoNulo extends Carrinho {

	@Override
	public double getValor() {
		return 0.0;
	}

	@Override
	public int getTamanho() {
		return 0;
	}

	@Override
	public String getNomeUsuario() {
		return "<a href=login.jsp>Login</a>";
	}

	@Override
	public String toString() {
		return "CarrinhoNulo [toString()=" + super.toString() + "]";
	}

	
}
