// 本题的要求是∶ 
// 对该程序进行调试，使程序能够判断所输入的年份是否闻年。  
// 【第一空】 参考答案∶throws 
// 【第二空】 参考答案∶readLine 
// 【第三空】 参考答案∶parseInt 

import java.io.*;

public class Java_1
{
   //*********Found**********
  public static void main(String[] args) ____________ Exception
   {
      InputStreamReader ir;
      BufferedReader in;
      ir=new InputStreamReader(System.in);
      in=new BufferedReader(ir);
      System.out.println("输入年份是:");
      //*********Found**********
      String s=in.________________();
   //*********Found**********
      int year=Integer.__________________(s);
      if(year%4==0&&year%100!=0||year%400==0)
      {
         System.out.println(""+year+"年是闰年.");
      }
      else
      {
         System.out.println(""+year+"年不是闰年.");
      }
   }
}
