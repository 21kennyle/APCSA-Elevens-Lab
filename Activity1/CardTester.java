/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card aceClubs1= new Card("ace", "club", 1);
		
		System.out.println("test 1");
		System.out.println(" rank: "+ aceClubs1.rank());
		System.out.println(" suit: "+ aceClubs1.suit());
		System.out.println(" pointValue: "+ aceClubs1.pointValue());
		System.out.println(" toString: "+ aceClubs1.toString());

	}
}
