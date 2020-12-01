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
         filePoint = file.getFilePointer(); //填入file，输出文件内容
      }
     //*********Found********
      file.close(); //填入close函数，用于释放内存
   }
}
