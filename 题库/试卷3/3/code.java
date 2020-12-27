// 本题的要求是∶ 
// 测试带有缓冲的输出流和不带缓冲的输出流在传输速度上哪个更快。程序输出结果如下; 
// 这是一个测试缓冲流和非缓冲流速度的程序。 
// 测试结果∶缓冲流的传输速度快于非缓冲流。 
// 【第一空】 参考答案; FileOutputStream 
// 【第二空】 参考答案∶ write 
// 【第三空】 参考答案∶close 或者 flush 

import java.io.*;
import java.util.*;

public class Java_3
{
   public static void main (String args[])
   throws IOException
   {
      FileOutputStream unbufStream = new FileOutputStream("test.one");
      BufferedOutputStream bufStream = new BufferedOutputStream(
      //*********Found**********
        new ____________________ ("test.two"));
      System.out.println();
      System.out.println("这是一个测试缓冲流和非缓冲流速度的程序。");
      System.out.println();
      int flag = time(unbufStream)-time(bufStream);
      if(flag > 0)
      {
         System.out.println("测试结果：缓冲流的传输速度快于非缓冲流。");
         System.out.println();
      }
      else
         System.out.println("测试结果：缓冲流的传输速度慢于非缓冲流。");
   }
   static int time (OutputStream out)
   throws IOException
   {
      Date then = new Date();
      for (int i=0; i<50000; i++)
      {
         //*********Found**********
         out.__________________ (1);
      }
      //*********Found**********
      out._________________ ();
      return (int)((new Date()).getTime() - then.getTime());
   }
}

