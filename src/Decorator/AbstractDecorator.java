package Decorator;

public abstract class AbstractDecorator implements ObjectInterface {
	   protected ObjectInterface decoratedObject;

	   public AbstractDecorator(ObjectInterface decoratedObject){
	      this.decoratedObject = decoratedObject;
	   }

	   public void sayHi(){
		   decoratedObject.sayHi();
	   }	
	   public void sayBye(){
		   decoratedObject.sayBye();
	   }	
	}
