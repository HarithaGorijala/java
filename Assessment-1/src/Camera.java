class Camera1{
	String brand;
	float cost;
	
}
class DigitalCamera extends Camera1{
	String memory;
	DigitalCamera(String brand,float cost,String memory){
		this.brand=brand;
		this.cost=cost;
		this.memory=memory;
	}
	void display()
	{
		System.out.println("camera brand is:" + brand);
		System.out.println("camera cost is:" + cost);
		System.out.println("camera memory is:" + memory);
	}
}
public class Camera {

	public static void main(String[] args) {
		DigitalCamera dc=new DigitalCamera(" ",0," ");
		dc.display();

	}

}
