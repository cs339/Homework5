package observer;

public class Demo {

	public static void main(String[] args) {
		MyObservable subject = new MyObservable();
		Observer observer1 = new MyObserver(1);
		Observer observer2 = new MyObserver(2);
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.setState(3);
		subject.addToState(5);
	}

}
