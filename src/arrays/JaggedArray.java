package arrays;

public class JaggedArray {

	public static void main(String[] args) {
		/*int[][] arr=new int[3][];
		
		arr[0]=new int[2];
		arr[1]=new int[5];
		arr[2]=new int[3];
		
		arr[0][0]=1;
		arr[0][1]=2;
		
		arr[1][0]=3;
		arr[1][1]=4;
		arr[1][2]=5;
		arr[1][3]=6;
		//arr[1][4];
		
		arr[2][0]=8;
		arr[2][1]=9;
		arr[2][2]=10;*/
		
		/*int[][] arr=new int[3][];
		arr[0]=new int[] {1,2};
		arr[1]=new int[5];
		arr[2]=new int[3];*/
		
		int[][] arr= {
				{1,2},
				{8,9,10},
				{1}
		};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
