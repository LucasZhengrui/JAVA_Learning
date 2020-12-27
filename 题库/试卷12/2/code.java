// 本题的要求是∶
// 阅读Java_2.java程序，该程序的功能是将本程序代码打
// 印输出。完成程序编写并运行。所得结果即本程序代码。
// 【第一空】参考答案∶ throws
// 【第二空】参考答案∶file

import java.io.*;

public class Java_2{
     //*********Found********
   public static void main(String args[]) ___________ Exception{
      long filePoint = 0 ;
      String s;
      RandomAccessFile file = new RandomAccessFile("Java_2.java","r");
      long fileLength = file.length();
      while (filePoint<fileLength){
     //*********Found********
         s = ___________.readLine();
         System.out.println(s);
         filePoint = file.getFilePointer();
      }
      file.close();
   }
}
