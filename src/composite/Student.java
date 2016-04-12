package composite;

public class Student extends Cyclone {

	public Student(Cyclone parent, String name) {
		super(parent, name);
	}
	
	public void doAction() {
		System.out.println(this.name + " did their homework");
	}

}
