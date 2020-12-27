// 本题的要求是∶ 
// 阅读Java_2.java程序，该程序把filel.txt文件中的字符串输出。完成程序的编写，运行 
// 所得结果为∶ 
// Hel1o! 
// Hello! 
// Hello! 
// 【第-空】 参考答案∶file 
// 【第二空】 参考答案∶ close 

import java.io.*;

public class Java_2{
   public static void main(String args[]) throws Exception{
      long filePoint = 0 ;
      String s;
      RandomAccessFile file = new RandomAccessFile("file1.txt","r");
      long fileLength = file.length();
      while (filePoint<fileLength){
         s = file.readLine();
         System.out.println(s);
     //*********Found********
         filePoint = _____________.getFilePointer();
      }
     //*********Found********
      file.____________();
   }
}
