// 本题的要求是∶
// 用冒泡法对数据进行排序，使程序的输出结果如下∶
// 排序前∶
// 32 18 41 23 2 56 36 67 59 20
// 排序后∶
// 2 18 20 23 32 36 41 56 59 67
// 【第一空】参考答案∶length
// 【第二空】参考答案∶ index
// 【第三空】参考答案; temp

import java.io.*;
public class Java_3{
   public static int data[]={32,18,41,23,2,56,36,67,59,20};
   public static void main(String args[]){
      int i;
      //*********Found**********
      int index=data.__________________;
      System.out.println("排序前:");
      for(i=0;i<index;i++)
         System.out.print(" "+data[i]+" ");
      System.out.println();
      //*********Found**********
      BubbleSort( _________________ );
      System.out.println("排序后:");
      for(i=0;i<index;i++)
         System.out.print(" "+data[i]+" ");
      System.out.println();
   }
   // 冒泡法排序
   public static void BubbleSort(int index){
      int i,j;
      int temp;
      for(j=1;j<index;j++){
         for(i=index-1;i>=j;i--){
	    if(data[i]<data[i-1]){  //比较相邻的两个数
               temp=data[i];
               data[i]=data[i-1];
               //*********Found**********
               data[i-1]= __________________ ;
            }
         }
      }
   }
}
