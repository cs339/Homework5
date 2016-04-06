package Decorator;

public class Demo {
	public static void main(String[] args) {
	      ObjectInterface object1 = new SampleObject();
	      ObjectInterface object2 = new SampleDecorator(new SampleObject());

	      System.out.println("Object wtihout decorator");
	      object1.sayHi();
	      object1.sayBye();

	      System.out.println("");
	      
	      System.out.println("Object with decorator");
	      object2.sayHi();
	      object2.sayBye();
	   }
}
