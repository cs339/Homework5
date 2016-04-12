package composite;

public class Professor extends Cyclone {

	public Professor(Cyclone parent, String name) {
		super(parent, name);
	}
	
	public void doAction() {
		for(Cyclone c : this.children) {
			System.out.println("Professor " + this.name + " graded " + c.name + "'s homework");
			c.doAction();
		}
	}

}
