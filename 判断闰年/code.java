import java.io.*;

public class Java_1
{
   //*********Found**********
  public static void main(String[] args) throws Exception
   {
      InputStreamReader ir;
      BufferedReader in;
      ir=new InputStreamReader(System.in);
      in=new BufferedReader(ir);
      System.out.println("输入年份是:");
      //*********Found**********
      String s=in.readline();
   //*********Found**********
      int year=Integer.parseInt(s);
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

