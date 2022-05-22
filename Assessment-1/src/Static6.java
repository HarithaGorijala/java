class printer{
	static {
		System.out.println("Static block in printer class");
	}
	public static void display(String message) {
		System.out.println(message);
	}
}

public class Static6 {
	public static int sampleVariable=1;
	static {
		System.out.println("Static block in Tester class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleVariable++;
		printer p=null;
		System.out.println("in main");
		p.display("the value of sample variable is:" + sampleVariable);

	}

}
