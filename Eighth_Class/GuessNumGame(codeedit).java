package Java_code;

import java.util.Scanner;
import java.util.Random;

public class NumberRandomGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// final int NUMBER = 100; // 定义最大的随机数不得超过100
		int randomNum = 0; //初始化该随机数
		int guessNum = 0,n = 1,a=1;
		int Numofguess = 1;// 初始化猜测的次数
		int choice = 0;
		while(a==1)
		{
			Random r = new Random();
			randomNum = r.nextInt(100);
			while(n==1)
			{
	//			Random r = new Random();
	//			randomNum = r.nextInt(100);
				System.out.println("Please input the number you guess: ");
				Scanner sc = new Scanner(System.in); 
				guessNum = sc.nextInt();
				
				if(randomNum == guessNum)
				{
					System.out.println("Correct!"+Numofguess);
					System.out.println("Next Game? Input '1' for next time, or input '0' for See you next time!");
					Scanner sc1 = new Scanner(System.in);
					choice = sc1.nextInt();
					if(choice == 0)
					{
						System.out.println("See you next time!");
						n = 0;a = 0;
					}
					else if(choice == 1)
					{
						System.out.println("Next time!");
						break;
					}
				}
				else if(randomNum < guessNum)
				{
					System.out.println("Too many! Please try again!");
					n = 1;
				}
				else if(randomNum > guessNum)
				{
					System.out.println("Too small! Please try again!");
					n = 1;
				}
				Numofguess++;
			}
		}
	}

}
