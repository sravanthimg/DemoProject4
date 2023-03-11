package interviewjavaprograms;

public class EvenAndOddOfArray {

	public static void main(String[] args) {
		int a[]= {1,4,3,2,6,8,9};
		
		System.out.println("Even numbers in array----");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		}
		System.out.println("Odd Numbers in Array-----");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
