package cse360assign3;
// github repository URL: https://github.com/Ryano526/assign3
public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total; 	// returns correct total
	}
	
	public void add (int value) {
		total+=value;	// adds value to total
	}
	
	public void subtract (int value) {
		total-=value;	// subtracts value from total
	}
	
	public void multiply (int value) {
		total = total*total*value;	// multiply total by total by value
	}
	
	public void divide (int value) {
		total = total/value;		// divide total by the value
	}
	
	public String getHistory () {
		return "";
	}
}