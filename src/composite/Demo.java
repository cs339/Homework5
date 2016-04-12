package composite;

public class Demo {

	public static void main(String[] args) {
		President x = new President(null, "Steven Leath");
		Dean d1 = new Dean(x, "John Mcbride");
		Dean d2 = new Dean(x, "Eric Johnston");
		Professor p1 = new Professor(d1, "Tien Nguyen");
		Professor p2 = new Professor(d2, "Pavan Aduri");
		Professor p3 = new Professor(d2, "Steve Kautz");
		Student s1 = new Student(p1, "Georges Niang");
		Student s2 = new Student(p2, "Jason Huntrods");
		Student s3 = new Student(p2, "Aaron Forest");
		Student s4 = new Student(p3, "Matt McKillip");
		x.doAction();
	}

}
