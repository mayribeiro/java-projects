package factorymethod.sample01.produto;

import factorymethod.sample01.GeradorArquivo;
import factorymethod.sample01.Repository;
import factorymethod.sample01.ServicoAbstrato;

public class ProdutoService extends ServicoAbstrato<Produto> {
	
	public ProdutoService(GeradorArquivo geradorArquivo) {
		super(geradorArquivo);
	}

	private Repository<Produto> repository;

	@Override
	public Repository<Produto> getRepository() {
	
		if (repository == null) {
			repository = new ProdutoRepository();
		}
		
		return repository;
	}

	public double getPrecoProduto(Object produtoId) {
		Produto p = repository.recuperarPorId(produtoId);
		return p.getPreco();
	}
}
