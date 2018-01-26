package factorymethod.sample04;

public class ShapeFactory {

	private static final String SQUARE = "SQUARE";
	private static final String RECTANGLE = "RECTANGLE";
	private static final String CIRCLE = "CIRCLE";

	public Shape getShape(String shapeType) {
		
		switch (shapeType) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		default:
			break;
		}

		return null;
	}
	
}
