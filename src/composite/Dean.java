package composite;

public class Dean extends Cyclone {

	public Dean(Cyclone parent, String name) {
		super(parent, name);
	}
	
	public void doAction() {
		for(Cyclone c : this.children) {
			System.out.println("Dean " + this.name + " paid " + c.name);
			c.doAction();
		}
	}

}
