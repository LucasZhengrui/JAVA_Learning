package Java_code;

class SuperClass_ {
	int x;
	    SuperClass_() {
	    	x=3;
	 		System.out.println("in SuperClass : x=" +x);
	 	}
	 	void doSomething() {
	 		System.out.println("in SuperClass.doSomething()");
	}
}
class SubClass_ extends SuperClass_ 
{
	int x;
	SubClass_() 
	{
		super();	//调用父类的构造方法
		x=5;		//super( ) 要放在方法中的第一句
		System.out.println("in SubClass_ :x="+x);
	 }
	 void doSomething( ) 
	 {
	 	super.doSomething( ); //调用父类的方法
	 	System.out.println("in SubClass_.doSomething()");
	 	System.out.println("super.x="+super.x+" sub.x="+x);
	 }
}

public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass_ subC=new SubClass_();
 		subC.doSomething();
	}

}
