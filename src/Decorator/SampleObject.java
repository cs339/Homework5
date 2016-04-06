package Decorator;

public class SampleObject implements ObjectInterface {
	@Override
	public void sayHi(){
		System.out.println("Hi");
	}
	
	@Override
	public void sayBye(){
		System.out.println("Bye");
	}
}
