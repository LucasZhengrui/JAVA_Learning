// 本题的要求是∶ 
// 在考生文件夹中存有文本文件a.txt。在命令行下输入java Java_3 a.txt b.txt 运行。程序的运行结果是将a.txt的内容拷贝到b.txt文件中。并在命令屏幕上显示如下; 
// has donel
// 【第一空】 参考答案∶"a.txt" 
// 【第二空】 参考答案∶"b.txt" 
// 【第三空】参考答案：b
// 【第四空】 参考答案∶ close 
// 【第五空】 参考答案∶ close 

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java_3
{
   public static void main(String args[])
   {
      if(args.length<2)
      {
         System.out.println("ERROR: need parameters.");    
         System.out.println("-usage: java <classname> <file1> <file2>");    
         System.exit(0);      //退出程序
      }
      //*********Found**********	
      File f1=new File( _________________ );
      //*********Found**********
      File f2=new File( _________________ );

      try
      {
         FileReader fr=new FileReader(f1);
         FileWriter fw=new FileWriter(f2);
         int b;
         
         while((b=fr.read()) != -1) 
        //*********Found**********
             fw.write( ________________ );
         //*********Found**********
         fr._____________();       //关闭流文件
         //*********Found**********
         fw._____________();      //关闭流文件
         System.out.println("has done!");
      }
      catch(IOException e)
      {
         e.printStackTrace();
      } 
   }
}
