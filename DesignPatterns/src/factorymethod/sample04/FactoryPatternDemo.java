package factorymethod.sample04;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new  ShapeFactory();
		
		Shape circulo = shapeFactory.getShape("CIRCLE");
		circulo.draw();
		
		Shape retangulo = shapeFactory.getShape("RECTANGLE");
		retangulo.draw();
		
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();		
	}
}
