/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
Card aceClubs1 = new Card("ace", "clubs", 1);
Card threeHearts = new Card("3", "hearts", 3);
Card twoClubs = new Card("2", "clubs", 2);


System.out.println("- ace of clubs Test -");
System.out.println("  rank: " + aceClubs1.rank());
System.out.println("  suit: " + aceClubs1.suit());
System.out.println("  pointValue: " + aceClubs1.pointValue());
System.out.println("  toString: " + aceClubs1.toString());
System.out.println();

System.out.println("- three of hearts Test -");
System.out.println("  rank: " + threeHearts.rank());
System.out.println("  suit: " + threeHearts.suit());
System.out.println("  pointValue: " + threeHearts.pointValue());
System.out.println("  toString: " + threeHearts.toString());
System.out.println();

System.out.println("- two of clubs Test -");
System.out.println("  rank: " + twoClubs.rank());
System.out.println("  suit: " + twoClubs.suit());
System.out.println("  pointValue: " + twoClubs.pointValue());
System.out.println("  toString: " + twoClubs.toString());
System.out.println();

	}
}
