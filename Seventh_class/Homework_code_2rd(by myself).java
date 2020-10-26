package Java_code;

class Student_message
{
	private int Stu_id; //The number of the student(Only one for only student)
	private String Stu_name; //The name of the student
	private int Achievement; //The Achievement of the student
	
	public Student_message(int id,String name,int Achi) 
	{
		Stu_id = id;
		Stu_name = name;
		Achievement = Achi;

	}
	public int Return_id()
	{
		return Stu_id;
	}
	
	public String Return_name()
	{
		return Stu_name;
	}
	
	public int Return_Ach()
	{
		return Achievement;
	}
}

class Undergraduate extends Student_message
{
	int x=0;
	public Undergraduate(int id,String name,int Achi)
	{
		super(id,name,Achi);
	}
	public void Under()
	{
		x=super.Return_Ach();
		if(x>60)
		{
			System.out.println(super.Return_name()+"is undergraduate student, and the average score is "+x+" he or she can get the Permission");
		}
		else
		{
			System.out.println(super.Return_name()+"is undergraduate student, and the average score is "+x+" he or she can not get the Permission");
		}
	}
}

class Graduate extends Student_message
{
	int x=0;
	public Graduate(int id,String name,int Achi)
	{
		super(id,name,Achi);
	}
	public void Gra()
	{
		x=super.Return_Ach();
		if(x>80)
		{
			System.out.println(super.Return_name()+"is graduate student, and the average score is "+x+" he or she can get the Permission");
		}
		else
		{
			System.out.println(super.Return_name()+"is graduate student, and the average score is "+x+" he or she can not get the Permission");
		}
	}
}

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate u1= new Undergraduate(1,"Lucas",61);
		Undergraduate u2= new Undergraduate(2,"Ammy",59);
		Graduate g1= new Graduate(3,"Edmond",81);
		Graduate g2= new Graduate(4,"John",76);
		u1.Under();
		u2.Under();
		g1.Gra();
		g2.Gra();// 输出平均分
	}
}
