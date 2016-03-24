import java.awt.Color;
import java.util.Random;

public class Square extends Shape {
	
	private int shapeWidth;
	
	public Square(int shapeWidth){
		// TODO Constructor
		this.shapeWidth = shapeWidth;
	}
	
	
	@Override
	public Color getRandomColor() {		
		Random ran= new Random();
		
		float r,g,b;
		r=  ran.nextFloat()%2;
		g = ran.nextFloat()%2;
		b = ran.nextFloat()%2;
		return new Color(r, g, b);
	}
	
	@Override
	public int getShapeWidth(){
		// TODO Return Square width
		return shapeWidth;
	}
	
	@Override
	public int getShapeHeight(){
		// TODO Return Square height
		return shapeWidth;
	}


	@Override
	public int getCenterX(int mouseX) {
		// TODO Input mouse X position and return center X of square
		return mouseX - shapeWidth/2;
	}


	@Override
	public int getCenterY(int mouseY) {
		// TODO Input mouse Y position and return center Y of square
		return mouseY - shapeWidth/2;
	}


}