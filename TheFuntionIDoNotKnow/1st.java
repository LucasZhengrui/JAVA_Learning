public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,4,6,8,10};
		int size = 6;
		int result = -1;
		try {
			for(int i=0;i<size && result == -1;i++)
			{
				if(array[i] == 20)
				{
					result = i;
				}
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch---1");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catch---2");
		}
		catch(Exception e)
		{
			System.out.println("Catch---3");
		}
	}
}



// Catch---2
