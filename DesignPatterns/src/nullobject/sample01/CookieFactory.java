package nullobject.sample01;

import javax.servlet.http.HttpServletRequest;

public class CookieFactory {

	public static Carrinho criarCarrinho(HttpServletRequest request) {
		return new CarrinhoNulo();
	}

}
