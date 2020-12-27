// 本题的要求是:
// 程序列出当前目录下所有文件和文件夹的名称。如果当前目录含有子文件夹，则也递归地列出子文件夹的内容，用缩进地方式反映层次关系，文件夹的名称用尖括号括起来。某次运行结果如下:
// 当前的工作目录是∶ Z∶\test 
// Java_2.class 
// <source> 
// <Javal> 
// Java_1.java 
// <Java2> 
// Java_2.java 
// <Java3> 
// Java_3.java 
// 【第一空】 参考答案∶curDir 
// 【第二空】 参考答案∶getName() 
// 【第三空】 参考答案∶i++ 
// 【第四空】 参考答案; level 

import java.io.File;

public class Java_2
{
   public static void main(String s[])
   {
      //Getting the Current Working Directory
      String curDir = System.getProperty("user.dir");
      System.out.println("当前的工作目录是:"+curDir);
		
      //*********Found**********
      File ff=new File(____________________);
      String[] files=ff.list();
      for(int i=0; i<files.length; i++)
      {
         String ss=curDir+"\\"+files[i];
         traverse(0,ss);	
      }
   }
	
   /**
   * 递归地遍历目录树
   * @param  level 目录的层次
   * @param  s     当前目录路径名
   */
   public static void traverse(int level,String s)
   {
      File f=new File(s);
      for(int i=0; i<level; i++) System.out.print("   ");
      if(f.isFile()) 
      {
         System.out.println(f.getName());
      }
      else if(f.isDirectory())
      {
         //*********Found**********
         System.out.println("<"+f._____________________+">");
         String[] files=f.list();
         level++;
         //*********Found**********
         for(int i=0; i<files.length;________________________)
         {
            String ss=s+"\\"+files[i];
            //*********Found**********
            traverse(_____________________,ss);
         }
      }
      else
      {
         System.out.println("ERROR!");
      }
   }
}
