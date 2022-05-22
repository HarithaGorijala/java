abstract class Shape1{
	abstract void draw();
}
class ShapeUtil extends Shape1{
	void draw() {
		System.out.println("this is Shape1 method");
	}
	void drawShape()
	{
		System.out.println("this is ShapeUtil class");
	}
}
public  class Shape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ShapeUtil su=new ShapeUtil();
         su.draw();
         su.drawShape();
	}	
}



