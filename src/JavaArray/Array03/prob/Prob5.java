package JavaArray.Array03.prob;

public class Prob5 {
	public static int getValue(int[] values, boolean isMax) {

		// int 타입 배열의 최대값 또는 최소값을 리턴한다.

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i : values) {
			min = Math.min(min, i);
			max = Math.max(max, i);
		}

		int res = (isMax) ? max : min;

    return res;
  }
	
	public static void main(String[] args) { 
		int[] values = {57, 3, 43, 5, 39, 23, 55, 2};
		
		int maxValue = getValue(values, true);
		int minValue = getValue(values, false); 
		
		System.out.println("최대값 = " + maxValue);
		System.out.println("최소값 = " + minValue); 

	} 
}
