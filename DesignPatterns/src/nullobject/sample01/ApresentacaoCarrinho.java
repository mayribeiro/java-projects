package nullobject.sample01;

import javax.servlet.http.HttpServletRequest;

public class ApresentacaoCarrinho {

	public void colocarInformacoesCarrinho(HttpServletRequest request) {

		Carrinho c = CookieFactory.criarCarrinho(request);

		if (c != null) {
			request.setAttribute("valor", c.getValor());
			request.setAttribute("qtd", c.getTamanho());
		} 

		if (request.getAttribute("username") == null) {
			request.setAttribute("userCarrinho", c.getNomeUsuario());
		} else {
			request.setAttribute("userCarrinho", request.getAttribute("username"));
		}
	}
}
