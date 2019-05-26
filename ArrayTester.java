package problem4;

public class ArrayTester {
	
	public static int[] getColumn (int[][] arr2d, int c) {
		//part a
		int[] column = new int[arr2d[0].length];
		for(int i = 0; i < arr2d[c].length; i++) {
			column[i] = arr2d[i][c];
		}
		
		return column;
	}
	
	public static boolean containsDuplicates(int[] arr) {
		return false;
	}
	
	public static boolean isLatin(int[][] square) {
		//part b
		if (containsDuplicates(square[0])) {
			return false;
		}
		
		for(int r = 1; r < square.length; r++) {
			if (!hasAllValues(square[0], square[r])) {
				return false;
			}
		}
		
		for (int c = 0; c < square[0].length; c++) {
			if(!hasAllValues(square[0], getColumn(square, c))) {
				return false;
			}
		}
		
		return true;
	}

	private static boolean hasAllValues(int[] is, int[] is2) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
