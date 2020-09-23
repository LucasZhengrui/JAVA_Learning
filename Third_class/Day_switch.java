package while_for_dowhile;

import java.util.Scanner; // 引用Scanner

public class Day_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner day = new Scanner(System.in);
		int n;
		n = day.nextInt();
		switch(n)
		{
			case 1: System.out.println("Monday");
			break;
			case 2: System.out.println("Tuesday");
			break;
			case 3: System.out.println("Wednesday");
			break;
			case 4: System.out.println("Thursday");
			break;
			case 5: System.out.println("Friday");
			break;
			case 6: System.out.println("Saturday");
			break;
			case 7: System.out.println("Sunday");
			break;
			default: System.out.println("Inout Error");
			break;
		}
	}

}


// 7
// Sunday
