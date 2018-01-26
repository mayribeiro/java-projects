package example2;

import example2.TVSimpleFactory.TVMODE;

public class Test {

	public static void main(String[] args) {
		
		TVSimpleFactory.getTV(TVMODE.LED).createTV();
	}
}
