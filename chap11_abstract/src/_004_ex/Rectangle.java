package _004_ex;

public class Rectangle implements InterfaceArea {

	
	private double width;  
    private double height; 
	
	public  Rectangle(double width , double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
	return width*height;
	}

}
