package interviewjavaprograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		String rev="";
		
		/*for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse A String: "+rev);*/
		
		/*char[] a=str.toCharArray();
	     int len=a.length;
	     for(int i=len-1;i>=0;i--)
	     {
	    	 rev=rev+a[i];
	     }
	     System.out.println("Reverse A Number:"+rev);*/
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
