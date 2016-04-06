package Decorator;

public class SampleDecorator extends AbstractDecorator {
	public SampleDecorator(ObjectInterface decoratedObject) {
		super(decoratedObject);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sayHi(){
		decoratedObject.sayHi();
		decoratorSaysHi(decoratedObject);
	}
	
	@Override
	public void sayBye(){
		decoratedObject.sayHi();
		decoratorSaysBye(decoratedObject);
	}
	
	private void decoratorSaysHi(ObjectInterface decoratedObject){
		System.out.println("Decorator Says Hi");
	}
	
	private void decoratorSaysBye(ObjectInterface decoratedObject){
		System.out.println("Decorator Says Bye");
	}
}

