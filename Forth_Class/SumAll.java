public class SumAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int arr[][] = new int[3][4];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = i+j;
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				total = total + arr[i][j];
			}
			System.out.println("The Sum is:"+total);
		}
	}

}




//  0 1 2 3
//  1 2 3 4
//  2 3 4 5
// The Sum is:6
// The Sum is:16
// The Sum is:30
