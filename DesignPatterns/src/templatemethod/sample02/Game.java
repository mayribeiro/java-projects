package templatemethod.sample02;

public abstract class Game {

	abstract void initialize();
	
	abstract void startPlay();
	
	abstract void endPlay();
	
	/**
	 * template method
	 * Metodos com a palavra-chave final nao pode ser sobreescrito pela subclasse(filha)
	 **/
	public final void play() {
		
		initialize();
		
		startPlay();
		
		endPlay();
	}
	
}
