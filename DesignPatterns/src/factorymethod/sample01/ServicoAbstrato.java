package factorymethod.sample01;

public abstract class ServicoAbstrato<E> {

	public GeradorArquivo geradorArquivo;

	public ServicoAbstrato(GeradorArquivo geradorArquivo) {
		this.geradorArquivo = geradorArquivo;
	}
	
	public abstract Repository<E> getRepository();
	
	/**
	 * Servico Geral
	 */
	public void gravarEntidadeEmArquivo(Object id, String nomeArquivo) {
		
		//E entidade = getRepository().recuperarPorId(id);
		//geradorArquivo.gerarArquivo(nomeArquivo,((Object) entidade).getMapa());
	}
	
	
}
