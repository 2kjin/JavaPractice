package API._02;

public class Prob1 {

	public static void main(String args[]) {
		
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SSG", 6, '#') );
		System.out.println( prob1.leftPad("SSG", 5, '$') ); 
		System.out.println( prob1.leftPad("SSG", 2, '&') ); 
		 
	}
	
	public String leftPad(String str, int size, char padChar) {
		String res = str;
		/*  여기에 프로그램을 완성하십시오. */
		int l = str.length();
		if (str.length() < size) {
			for (str.length(); l <= size; l++) {
				res.concat(String.valueOf(padChar));
			}
			return res;
		}else {
			return str;
		}
	}
}
