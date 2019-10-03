
public class CCCJ4BigBang2012 {
/*
 * 
 * Link:
 * https://cemc.uwaterloo.ca/contests/computing/2012/stage1/juniorEn.pdf
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bigBangAlt());
	}
	
	
	/**
	 * 
	 * Approach 2 takes advantage of two things
	 * 
	 * 		1. Mapping characters to ASCII values - This means we can apply the encryption to a value and once done map the ASCII value back to a char. 
	 * 		2. MOD 26 - This means we can avoid conditional statements since MOD 26 will give us a value between 0 - 25.  If we shift that by 65 it will take us to the ASCII values for characters. 
	 * 
	 * 		
	 * 
	 */
	public static String bigBangAlt() {
		
		int k = 3;
		String input = "ABCDEFGHIJKLMNOPQRSTUVWZYZ";
		input = "FXAB";
		String result = "";
		
		for (int i = 0; i < input.length(); i = i + 1) {
			
			//System.out.println((int)(input.charAt(i)));
			int temp = (int)(input.charAt(i));
			
			//26
			//52
			temp = temp - 13; //reset to (A)52 - (Z)(52 + 26)
			
			System.out.println(temp);
			
			int s = 3*(i + 1) + k;
			
			temp = temp - s;
			temp = temp % 26;
			temp = temp + 65;
			
			
			result = result + (char)temp;
			
			
		}
		
		return result;
		
	}
	public static String bigBang() {
		
		String[] letters = {"A","B","C","D","E","F","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int k = 3;
		String input = "FXAB";
		
		String result = "";
		
		for (int i = 0; i < input.length(); i = i + 1) {
		
			String clet = "" + input.charAt(i);
			int loc = 0;
			
			for (int j = 0; j < letters.length; j = j + 1) {
				
				if (letters[j].equals(clet)) {
					loc = j;
					break;
				}
				
			}
			
			int s = 3*(i + 1) + k;
			
			int nloc = loc - s;
					
			if (nloc < 0) {
				nloc = 25 + nloc;
			}
			
			//System.out.println(loc);
			//System.out.println(s);
			//System.out.println(nloc+"\n");
			result = result + letters[nloc];
			
		}
		
		return result;
		
	}

}
