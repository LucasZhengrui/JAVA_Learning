// 本题的要求是∶ 
// 打开一个文本文件test.txt，统计该文件中包含的数字的个数与英文字母的个数（忽略大写）。例如itest.txt文本文件中包含的内容为"123abcDEF99G"，则程序的输出结果如下; 
// 数字数是5，字母数是7 
// 【第一空】 参考答案; try 
// 【第二空】 参考答案∶new FileInputStream


import java.io.*;
public class Java_2{
   public static void main (String[] args){
      byte buf[] = new byte[5];
      int len= 0 ,c1 = 0,c2=0;
      //*********Found**********
      ______________________{
         //*********Found**********
         FileInputStream in = _________________________("test.txt");
         while((len =in.read(buf,0,5))>0){
            for(int i = 0; i < len;i++)
               if(buf[i]>= '0' && buf[i] <= '9'){
                  c1 ++;
               }
               else 
                  if((buf[i]>= 'a' && buf[i] <= 'z')||buf[i]>= 'A' && buf[i] <= 'Z') 
                     c2++;
            if(len <5) break;
         }
         in.close(); 
      }catch(Exception e ){}
      System.out.println("数字数是 " + c1 + "，字母数是 " + c2);
   }
}
