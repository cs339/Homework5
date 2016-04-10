package observer;

public class MyObserver implements Observer {
	
	private int id;
	
	MyObserver(int id){
		super();
		this.id = id;
	}

	@Override
	public void update(int state) {
		System.out.println("I am observer " + id + " and I just noticed that the state of the subject changed to " + state);
	}

}
