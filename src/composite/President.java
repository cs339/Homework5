package composite;

public class President extends Cyclone {

	public President(Cyclone parent, String name) {
		super(parent, name);
	}
	
	public void doAction() {
		for(Cyclone c : this.children) {
			System.out.println("President " + this.name + " elected " + c.name);
			c.doAction();
		}
	}

}
