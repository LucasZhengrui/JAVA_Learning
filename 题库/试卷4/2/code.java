// 本题的要求是∶ 
// 构造一个5行5列的二维数组，给数组赋值，并将其按照行列对齐的方式输出，使程序输出结果如下∶ 
// 0  0  0  0  1 
// 0  0  0  2  3 
// 0  0  4  5  6 
// 0  7  8  9  10 
// 11 12 13 14 15 
// 【第一空】 参考答案∶ j<5 或者 j<=4 或者 j<a[i].length 
// 【第二空】 参考答案; a[i][j]=k++ 


import java.io.*;

public class Java_2{
   public static void main(String args[]) { 
      int a[][] = new int[5][5];
      int i,j,k=1;
      for(i=0;i<5;i++)
         //*********Found**********
         for( j=0; _____________ ;j++ )
            if((i+j)<4)
               a[i][j]=0;
            else{ 				
               //*********Found**********
               _______________________;
            }
      for(i=0;i<5;i++){ 
         for(j=0;j<5;j++)
            if(a[i][j]<10)
               System.out.print(a[i][j]+ "   ");
            else
               System.out.print(a[i][j]+ "  ");
         System.out.println();
      }
   }
}
