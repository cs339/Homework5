package observer;

public class MyObservable extends Observable {

	MyObservable(){
		super();
	}
	
	public void addToState(int x){
		setState(getState() + x);
	}
}
