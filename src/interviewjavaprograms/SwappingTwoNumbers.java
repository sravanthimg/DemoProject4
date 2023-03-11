package interviewjavaprograms;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a=10,b=20;
		//Using third variable
		System.out.println("Before Swapping:"+a+" "+b);
		/*int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping:"+a+" "+b);*/
		
		//Using + and - operator
		/*a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		System.out.println("After Swapping:"+a+" "+b);*/
		
		//using * and / operator
		/*a=a*b;//200
		b=a/b;//10
		a=a/b;//20
		System.out.println("After Swapping:"+a+" "+b);*/
		
		//Using single statement
		b=a+b-(a=b);
		System.out.println("After Swapping:"+a+" "+b);
		

	}

}
