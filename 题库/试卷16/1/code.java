// 本题的要求是∶ 
// 对Java_1.java文件进行调试，使程序输出结果如下; 
// 0 1 2 3 4 5 6 7 8 9 
// 参考答案∶ anArray【i】 

import java.io.*;
public class Java_1{
   public static void main(String[] args) {
      int[] anArray;   //声明一个整数型数组
      anArray = new int[10];   //创建一个整数数组对象s
      //对数组中每个元素赋值并显示
      for (int i = 0; i < anArray.length; i++) {
         anArray[i] = i;
         //*********Found**********
         System.out.print(_______________+ " ");
      }
      System.out.println();
   }
}
