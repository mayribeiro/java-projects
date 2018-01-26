package example2;

public class TVSimpleFactory {

	enum TVMODE{COLOR, LED, LCD, THREEDIM};
	
	public static ITV getTV(TVMODE mode) {
		
		if (mode.equals(TVMODE.LED)) {
			return new ITV() {
				
				@Override
				public void createTV() {
					System.out.println("LED TV");
				}
			};
		}
		
		return null;
	}
	
}
