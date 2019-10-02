import java.util.Scanner;

public class CCCJ2MagicSquare {

	public static void main(String[] args) {
		
		System.out.println(magicSquares());
	}
	
	public static String magicSquares() {
		
		//int[][] arr = {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
		int[][] arr = {{5, 10, 1, 3}, {10, 4, 2, 3}, {1, 2, 8, 5}, {3, 3, 5, 0}};
			
		Scanner s = new Scanner(System.in);
		
		//for (int r = 0; r < 4; r = r + 1) 
		//	for (int c = 0; c < 4; c = c + 1)
		//		arr[r][c] = s.nextInt();
		
		int total = arr[0][0] + arr[0][1] + arr[0][2] + arr[0][3];
		
		//Check row sums
		for (int r = 1; r < 4; r = r + 1) {
			
			int t = 0;
			for (int c = 0; c < 4; c = c + 1)
				t = t + arr[r][c];
			
			if (t != total)
				return "not magic";
		}
		
		//Check column sums
		for (int c = 0; c < 4; c = c + 1) {
			
			int t = 0;
			for (int r = 0; r < 4; r = r + 1)
				t = t + arr[r][c];
			if (t != total)
				return "not magic";
		}
		
		return "magic";
	}

}
