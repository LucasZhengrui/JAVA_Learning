package Java_code;

public class Java_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int s = 0;
		for(int i=0;i<a.length;i++)
		{
			s+=a[i][i];
		}
		System.out.println(s);
	}

}
