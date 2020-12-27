// 本题的要求是∶ 
// 编写程序完成类Java_3的完整功能，该类定义了 
// 几何点对象的操作。该程序运行结果如下∶ 
// x=5 y=5 
// Location is(5,5) 
// x=8 y=9 
// Location is(8,9) 
// 【第一空】 参考答案∶{this.x=x;this.y=y;} 
// 【第二空】 参考答案∶{x=p.x;y=p.y;} 
// 【第三空】 参考答案∶ Java_3 p=new Java_3（x，y）; 
// 【第四空】 参考答案∶return p; 
// 【第五空】 参考答案∶ Java_3 p=new Java_3（5，5）; 
// 【第六空】 参考答案∶ p.translate（3，4）; 

public class Java_3
{
	//点的坐标
	int x,y;
	//无参数的构造方法
	public Java_3() {}
	//带两个参数的构造方法
     //*********Found********
        public Java_3(int x,int y){____________________}
	//带一个参数的构造方法
     //*********Found********
      public Java_3(Java_3 p){_____________________}
       //以对象的形式返回当前点的位置
	public Java_3 getLocation(){
     //*********Found********
            Java_3 p=_____________________;    //实例化一个Java_3对象p                     
     //*********Found********
            _____________________;             //返回对象p
	}
	
	//返回点的横坐标
	public int getX(){return x;}
	//返回点的纵坐标
	public int getY(){return y;}
	//把当前点移到新的位置（x，y）上
	public void move(int x,int y){this.x = x;this.y = y;}
	//以(x，y)的格式返回点的位置
	public String toString(){return "("+x+","+y+")";}
	//在原有坐标上分别增加x和y 
	public void translate(int x,int y){this.x += x;this.y += y;}
	//主方法
	public static void main(String args[]){
     //生成一个对象(5,5)
     //*********Found********
            Java_3 p=______________________;
            System.out.println("x="+ p.x+" y="+ p.y);
            //以(x,y)的方式打印坐标的位置
            System.out.println("Location is"+ p.toString());
            //在原有位置上增加（3，4）
     //*********Found********
             _____________________;
            //打印横坐标和纵坐标的值
            System.out.println("x="+ p.x+" y="+ p.y);
            //以(x,y)的方式打印坐标的位置
            System.out.println("Location is"+ p.toString());
	}
}
