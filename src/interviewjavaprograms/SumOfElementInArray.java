package interviewjavaprograms;

public class SumOfElementInArray {

	public static void main(String[] args) {
		int a[]= {5,2,6,7,8};
		int len=a.length;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum Of Array elements:"+sum);

	}

}
