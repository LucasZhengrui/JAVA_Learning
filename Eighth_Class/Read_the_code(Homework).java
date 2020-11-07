package Java_code;

public class testMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER = 100; // The max number is 100
		int count = 10;
		int randomNum = 0;
		int probability[] = new int[6]; // 定义一个六个数字的空数组       
		for(int i=0; i<6; i++) {
			probability[i] = 0;	
		} // 给这个含有六个数的数组进行初始化
		for(int i=0; i<NUMBER; i++) 
		{
			randomNum = (int)(Math.random()*6) + 1;
			probability[randomNum-1]++;// 给这个已初始化的数组进行随机数赋值
			System.out.print(randomNum + "\t");// 输出这些随机数
			if(i%count == 9)
				System.out.println();
		}
		for(int i=0; i<6; i++) 
		{
			System.out.println("\n"+(i+1)+":\t"+probability[i]);
		}
	}
}
