package cse360assign2;
/* Tan Dao 
 * CSe 360
 * Professor: Debra Callis
 * Octorber,9,2019
 * program try to get used to github push and fetch .
 */
public class main {
	public static void main(String[] args)
	{
		// Create Calculate class object 
		AddingMachine myCalculator= new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println("Testing program !");
		System.out.println(myCalculator.toString());
		System.out.println("Total="+myCalculator.getTotal());
	}

}
