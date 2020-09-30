public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ARRAY_SIZE = 10;
		int a[] = new int [ARRAY_SIZE];
		int max = 0;
		int index = 0;
		for(int i = 0; i < a.length; i++)
		{
			a[i] = (int)(Math.random() * 10);  //产生随机数
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		max = a[0];
		for(int j = 1; j < ARRAY_SIZE; j++)
		{
			if(a[j] > max)
			{
				max = a[j];
				index = j;
			}
		}
		System.out.println("A["+index+"] has maximum value "+a[index]);
	}
}



// 8 2 8 0 2 5 9 8 7 9
// A[6] has maximum value 9
// The result is not only one.
