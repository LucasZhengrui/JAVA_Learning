// 本题的要求是∶
// 阅读Java_3.java程序，该程序的功能是按照命令行给定的
// 文件名和文件长度建立一个新的文件NewFile.doc。完成程
// 序并运行结果，在程序相同目录下创建了新的文件
// NewFile. doc.
// 【第一空】参考答案∶ RandomAccessFile
// 【第二空】参考答案∶ fileName
// 【第三空】参考答案∶ size

//程序的功能是按照命令行给定的文件名和文件长度建立一个新的文件NewFile.doc。
import java.io.*;

public class Java_3{
   public static void main(String[] args){
      String sizeStr;
      String fileName;
      if(args.length > 1)
         sizeStr = args[1];
      else
         sizeStr = "3000";
      if(args.length > 0)
         fileName = args[0];
      else
         fileName = "NewFile.doc";
         long size = 0;
      try{
         size = Long.parseLong(sizeStr);
      }
      catch(NumberFormatException e){}
      try{
     //*********Found********
         ___________________ raf = new RandomAccessFile(_____________,"rw");
     //*********Found********
         raf.setLength(__________);
         raf.close();
      }
      catch(IOException e){}
   }
}
