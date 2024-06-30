package JavaArray.Array03.prob;

public class Prob3 {
	public static void main(String[] args) {
		int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
		System.out.println("<< 중복되지 않은 숫자 >>");
		printUniqueNumber(array);
	}

	private static void printUniqueNumber(int[] array) {
		// 구현하세요.

		for (int i = 0 ; i < array.length; i++){
			boolean isUnique = true;
			for ( int j = 0; j < array.length; j++){
				if (i != j && array[i] == array[j]){
					isUnique = false;
					break;
				}
			}
			if( isUnique ){
				System.out.print(array[i] + ", ");
			}
		}

	}
}
