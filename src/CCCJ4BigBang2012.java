
public class CCCJ4BigBang2012 {
/*
 * 
 * Link:
 * https://cemc.uwaterloo.ca/contests/computing/2012/stage1/juniorEn.pdf
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bigBang());
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
