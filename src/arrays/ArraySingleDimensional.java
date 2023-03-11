package arrays;

public class ArraySingleDimensional {

	public static void main(String[] args) {
		//int i[];
		//i=new int[5];*/
		//int[] j;//optional
		int[] i=new int[5];
		//String[] i=new String[5];
		//boolean[] i=new boolean[1];
		i[1]=5;
		i[4]=20;
		i[3]=40;
		i[0]=50;
		//i[-5]=12;
		
		/*System.out.println(i[2]);
		System.out.println(i[0]);
		int sum=i[0]+i[1]+i[2]+i[3]+i[4];
		System.out.println(sum);*/
		
		//i[5]=60;
		
		
		/*for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}*/
		
		int j=0;
		while(j<i.length)
		{
			System.out.println(i[j]);
			j++;
			
		}
		
		
		
		


	}

}
