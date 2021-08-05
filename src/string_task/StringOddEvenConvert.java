package string_task;

public class StringOddEvenConvert {

	public static void main(String[] args) {
		String s="hey i am ritesh";
		System.out.println(convertIfOdd(s));
	}





public static String convertIfOdd(String s) {
	String str1[] = s.split(" ");
	StringBuilder z = new StringBuilder();
	for (int i = 0; i < str1.length; i++) {
		if(str1[i].length() % 2 != 0) {
			z.append(str1[i].substring(0, str1[i].length()/2)).append(Character.toUpperCase(str1[i].charAt(str1[i].length()/2))).append(str1[i].substring(str1[i].length()/2 +1)).append(" ");
		}
		else {
			z.append(Character.toUpperCase(str1[i].charAt(0))).append(str1[i].substring(1)).append(" ");
		}
	}
	return z.toString().trim();
}
}
	
		

	