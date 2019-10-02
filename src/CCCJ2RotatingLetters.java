import java.util.Scanner;
/*
 * https://www.cemc.uwaterloo.ca/contests/computing/2013/stage1/juniorEn.pdf
 * 
 */
public class CCCJ2RotatingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(rotatingLetters());
	}
	
	public static String rotatingLetters() {
		
		Scanner s = new Scanner(System.in);
	
		String input = s.next();
		
		input = input.replaceAll("I","");
		input = input.replaceAll("O","");
		input = input.replaceAll("S","");
		input = input.replaceAll("H","");
		input = input.replaceAll("Z","");
		input = input.replaceAll("X","");
		input = input.replaceAll("N","");
		
		if (input.length() == 0)
			return "YES";
		
		return "NO";
	}

}
