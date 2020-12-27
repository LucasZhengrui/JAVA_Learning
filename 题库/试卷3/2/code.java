// 本题的要求是∶ 
// 阅读Java2.java程序，完成程序的编写，运行结果为∶ 
// 1 2 3 4 5 6 
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
// 【第一空】 参考答案∶ aTriangle[i].length 
// 【第二空】 参考答案∶ aTriangle[i][k] 

public class Java_2 {
   public static void main(String[] args) {
      int[][] aTriangle = new int[6][];
      int i = 0;
      int j = 6;
      int k = 0;
      for ( i = 0; i < aTriangle.length; i++) {
         aTriangle[i]=new int[j];  //创建数组。
         //给每个数组元素赋值并在一行中打印输出。
     //*********Found********
         for ( k = 0; k < ________________________; k++) {
            aTriangle[i][k]=k+1;
     //*********Found********
            System.out.print(________________________ + " ");
         }
         j--;
         System.out.println(); //换行。
      }
   }
}
