package templatemethod.sample02;

public class Football extends Game {

	@Override
	void initialize() {
		System.out.println("Futebol Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Futebol Game Started. Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Futebol Game Finished!");
	}

}
