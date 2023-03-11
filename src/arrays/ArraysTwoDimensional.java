package arrays;

public class ArraysTwoDimensional {

	public static void main(String[] args) {
		int[][] arr=new int[3][2];
		//System.out.println(arr);
		
		arr[0][0]=1;
		arr[0][1]=2;
		//arr[0][2]=3;
		
		arr[1][0]=3;
		arr[1][1]=4;
		
		arr[2][0]=5;
		arr[2][1]=6;
		//System.out.println(arr[0][0]);
		//System.out.println(arr[0][1]);
		
		/*System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].length);
		}*/
		
		int size=0;
		for(int i=0;i<arr.length;i++)
		{
			size+=arr[i].length;
		}
		System.out.println(size);
		
		
		
		
	}

}
