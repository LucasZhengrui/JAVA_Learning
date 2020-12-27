// 本题的要求是∶
// 完善程序，使程序输出结果如下∶
// 多高兴啊!
// 我是小龙
// 您好吗?
// 【第一空】参考答案∶ main
// 【第二空】参考答案∶ String
// 【第三空】参考答案∶this（）

public class Java_1 extends TT
{
   //*********Found**********
   public static void __________________(______________ args[])
   {
      Java_1 t = new Java_1("小龙");
   }
   public Java_1(String s)
   {
      super(s);
      System.out.println("您好吗？");
   }
   public Java_1()
   {
      this("我是文朋");
   }
}

class TT
{
   public TT()
   {
      System.out.println("多高兴啊!");
   }
   public TT(String s)
   {
   //*********Found**********
      _____________________;
      System.out.println("我是"+s);
   }
}
