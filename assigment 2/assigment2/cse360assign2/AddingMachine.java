package cse360assign2;
/*Tan Dao progrmaer 
 * Professor Debra Callis 
 * Octorber, 9, 2019
 * Program help us to get used to github and posting program on qebsite
 * here is the URL https://github.com/Kenkc95/Cse360assign2
 * the class in the file assigment2 /cse360assign2 
 * there are a main to test and class AddingMachine in packed cse360assign2
 * */
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
