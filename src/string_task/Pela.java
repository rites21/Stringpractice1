package string_task;

import java.util.Scanner;

public class Pela {

	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        StringBuilder sb = new StringBuilder(A);
	        sb = sb.reverse();
	        String B = sb.toString();
	        if(A.equals(B)){
	            System.out.println("yes");
	        }
	        else{
	            System.out.println("no");
	            
	        }

	}

}
