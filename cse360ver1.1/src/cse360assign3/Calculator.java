package cse360assign3;
// github repository URL: https://github.com/Ryano526/assign3
public class Calculator {

	private int total;
	String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity

	}
	
	public int getTotal () {
		return total; 	// returns correct total
	}
	
	public void add (int value) {
		total+=value;	// adds value to total
		history = history + " + " + value;
	}
	
	public void subtract (int value) {
		total-=value;	// subtracts value from total
		history = history + " - " + value;
	}
	
	public void multiply (int value) {
		total = total*total*value;	// multiply total by total by value
		history = history + " * " + value;
	}
	
	public void divide (int value) {
		total = total/value;		// divide total by the value
		history = history + " / " + value;
	}
	
	public String getHistory () {
		return history;
	}
}