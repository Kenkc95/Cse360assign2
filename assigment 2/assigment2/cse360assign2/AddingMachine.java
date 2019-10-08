package cse360assign2;

public class AddingMachine {
	// instance variables
	private int total;
	private String historyTransaction="0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	// methid to get total 
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total=total+value;
		historyTransaction= historyTransaction+"+"+value;
	}
	
	public void subtract (int value) {
		total=total-value;
		historyTransaction= historyTransaction+"-"+value;
	}
		
	public String toString () {
		return historyTransaction+" ";
	}

	public void clear() {
	
	}
}
