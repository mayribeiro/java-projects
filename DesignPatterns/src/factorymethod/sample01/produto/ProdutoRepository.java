package factorymethod.sample01.produto;

import java.util.List;

import factorymethod.sample01.Repository;

public class ProdutoRepository implements Repository<Produto> {

	@Override
	public Produto recuperarPorId(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salvar(Produto entidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Produto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
