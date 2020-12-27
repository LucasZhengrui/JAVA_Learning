// 本题的要求是∶ 
// 阅读Java_3.java程序，该程序的功能是求以命令行参数指定的整数的阶乘。完成程序并运行，所得结果为∶ 5的阶乘是 120.0
// 【第一空】 参考答案∶ args[0] 
// 【第二空】 参考答案∶num 
// 【第三空】 参考答案∶= fact 

//程序的功能是求以命令行参数指定的整数的阶乘。
public class Java_3{
   public static void main(String[] args){
      String num;
      if(args.length > 0)
     //*********Found********
         num = _____________;
      else
         num = "5";
     //*********Found********
      int input = Integer.parseInt(__________);
      double result = factorial(input);
      System.out.println(input+ " 的阶乘是 "+ result);
   }
   public static double factorial(int x){
      if( x < 0 )
      return 0.0;
      double fact = 1.0;
      while(x > 1){
     //*********Found********
         fact _____________ *x;
         x = x-1;
      }
      return fact;
   }
}
