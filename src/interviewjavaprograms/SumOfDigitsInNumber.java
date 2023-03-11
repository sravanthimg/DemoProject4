package interviewjavaprograms;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;//0+5=5//5+4=9//9+3=12//12+2=14//14+1=15
			num=num/10;//1234//123//12//1//0
		}
		System.out.println("Sum of digits in a number:"+sum);
	}

}
