import java.util.Scanner;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		minute = sc.nextInt();
		second = sc.nextInt();
	}
	public void set(int h, int m, int s)
	{
		hour = h;
		minute = m;
		second = s;
	}
	public void show()
	{
		System.out.println(hour+":"+minute+":"+second);
	}
}
