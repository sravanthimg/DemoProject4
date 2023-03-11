package interviewjavaprograms;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter a Second Number:");
		int b=sc.nextInt();
		
		System.out.println("Enter a Third Number:");
		int c=sc.nextInt();
		
		if(a>b&&a>c)
		{
			System.out.println(a+" a is Largest");
		}else if(b>a&&b>c)
		{
			System.out.println(b+" b is Largest");
		}else
		{
			System.out.println(c+" c is largest");
		}

	}

}
