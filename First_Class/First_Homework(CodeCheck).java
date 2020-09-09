package code0103;

public class MyClass {
		private int day;
	    private int month;
	    private int year;
	    public MyClass() {
	    	day = 1;
	    	month = 1;
	    	year = 1900;
	    }
	public MyClass(int d,int m,int y) {
	    day = d;
	    month = m;
	    year = y;
	}
	public void display(){
	    System.out.println(day + "-" + month + "-" + year);	
	}
	public static void main(String args[ ]) {
	    MyClass m1 = new MyClass();
	    MyClass m2 = new MyClass(25,12,2001);
	    m1.display();
	    m2.display();
	}
}
// github.com/LucasZhengrui
