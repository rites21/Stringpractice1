package string_task;

public class Lastuppercase {

	public static void main(String[] args) {
		String s="hello hi i am ritesh";
		System.out.println(convertToTitleCase(s));


	}

	
	public static String convertToTitleCase(String s) {
		String str[]=s.split(" ");
		StringBuilder e=new StringBuilder();
		for(int i=0;i<str.length;i++) {
			e.append(str[i].substring(0,str[i].length()-1)).append(Character.toUpperCase(str[i].charAt(str[i].length()-1))).append(" ");
		}
		return e.toString();
	
	}

	
}

	
		

	