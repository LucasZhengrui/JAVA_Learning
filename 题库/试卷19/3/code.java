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
