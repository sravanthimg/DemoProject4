package interviewjavaprograms;

public class NumberOfEvenOrOdd {

	public static void main(String[] args) {
		int num=123456;
		//int even_num=0;
		//int odd_num=0;
		
		/*while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even_num++;
			}else
			{
				odd_num++;
			}
			num=num/10;
			
		}
		System.out.println("Number of Even Numbers:"+even_num);
		System.out.println("Number of Odd Numbers:"+odd_num);*/
		
		//To print Odd or Even Numbers
		System.out.println("Even numbers-------");
		for(int i=1;i<num;i++)
		{
			int even=num%10;
			if(even%2==0)
			{
				System.out.println(i);
			}
			num=num/10;
		}
		System.out.println("Odd Numbers-------");
		for(int i=1;i<num;i++)
		{
			int odd=num%10;
			if(odd%2!=0)
			{
				System.out.println(i);
			}
			num=num/10;
		}
		
	}

}
