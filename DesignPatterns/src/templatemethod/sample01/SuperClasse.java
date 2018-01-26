package templatemethod.sample01;

public abstract class SuperClasse {

	public void metodoPrincipal() {
		metodoGancho();
	}
	
	/**
	 * Hook methods
	 */
	protected abstract void metodoGancho();
}
