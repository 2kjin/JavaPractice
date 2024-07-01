package JavaArray.Array03.prob;

import java.util.Arrays;

public class Prob6 {

	public static void main(String[] args) {
		Prob6 median = new Prob6();

		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+ Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("=================================================");

		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+ Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		// 메소드를 완성하세요

		int sum  = 0;
		int cnt = 0;
		int ans = values[0];

		for ( int i : values){
			sum += i;
			cnt++;
		}

		double avg = (double) sum / cnt ;

		double minDiff = Math.abs(avg - ans);

		for (int i : values){
			double diff = Math.abs(avg - i);
			if ( diff < minDiff || (diff == minDiff && i < ans)){
				minDiff = diff;
				ans = i;
			}
		}
		return ans;
	}
}
