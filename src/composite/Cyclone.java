package composite;

import java.util.ArrayList;

public abstract class Cyclone {
	
	public ArrayList<Cyclone> children;
	
	public Cyclone parent;
	
	public String name;
	
	public Cyclone(Cyclone parent, String name) {
		if(parent != null) parent.children.add(this);
		this.children = new ArrayList<Cyclone>();
		this.parent = parent;
		this.name = name;
	}
	
	public Cyclone getParent() {
		return this.parent;
	}
	
	public void addChild(Cyclone child) {
		this.children.add(child);
	}
	
	public void removeChild(Cyclone child) {
		this.children.remove(child);
	}
	
	public abstract void doAction();
	
}
