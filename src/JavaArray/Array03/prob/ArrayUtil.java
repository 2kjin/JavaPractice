package JavaArray.Array03.prob;

public class ArrayUtil {
	public static void main(String[] args){
		char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
		s = reverseString(s, 0, 3);
		System.out.println(s);
	}

	public static char[] reverseString(char[] s, int start, int end) {

		//reverseString 메소드 구현
		while (start < end){
			char tmp = s[start];
			s[start] = s[end];
			s[end] = tmp;

			start++;
			end--;
		}
		return s;
  }
}
