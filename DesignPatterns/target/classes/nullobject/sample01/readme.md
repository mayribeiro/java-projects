Nao foi colocado no Gof


Resolução:

Ele irá ilustrar como com o uso da herança é possível "enganar” o
código que utiliza a classe, introduzindo um novo comportamento que irá eliminar
a necessidade do uso de condicionais.

Problema:

Carrinho de compras ecommerce:
A classe ApresentacaoCarrinho apresentada na
listagem a seguir chama ométodo criarCarrinho() da classe CookieFactory
para recuperar um carrinho previamente criado pelo usuário a partir dos cookies
armazenados em seu navegador.

O grande problema desse código é que, caso nenhum
carrinho tenha sido criado, ele retorna um valor nulo. Daí é preciso adicionar
condicionais para configurar os valores adequados para quando o carrinho for nulo

Outra coisa
que precisaria ser alterada é a própria classe CookieFactory que deve retornar
uma instância de CarrinhoNulo em vez de null quando nenhum carrinho do
usuário for encontrado.