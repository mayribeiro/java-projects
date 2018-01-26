package factorymethod.sample01;

import java.util.List;

public interface Repository<E> {
	
	public E recuperarPorId(Object id);
	
	public void salvar(E entidade);
	
	public void excluir(Object id);
	
	public List<E> listarTodos();

}
