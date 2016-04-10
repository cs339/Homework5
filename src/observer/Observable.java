package observer;

import java.util.ArrayList;

public abstract class Observable {
	
	private ArrayList<Observer> observers;
	private int state;
	
	Observable(){
		observers = new ArrayList<Observer>();
		state = 0;
	}
	
	public int getState(){
		return state;
	}
	
	public void setState(int state){
		this.state = state;
		notifyObservers();
	}
	
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer){
		observers.remove(observer);
	}
	
	protected void notifyObservers(){
		for (Observer observer : observers){
			observer.update(state);
		}
		
	}
	
}
