// 本题的要求是∶ 
// 构造一个5行5列的矩阵并将其打印输出，使程序的输出结果如下：
// 1   2   3   4   5   
// 6   7   8   9   0 
// 10  11  12  0   0 
// 13  14  0   0   0 
// 15  0   0   0   0 
// 【第一空】 参考答案∶new 
// 【第二空】 参考答案∶a[i][j]=0 

public class Java_2{
   public static void main(String args[]) { 
      //*********Found**********
      int a[][] = ________________ int[5][5];
      int i,j,k=1;
      for(i=0;i<5;i++)
         for(j=0;j<5;j++)
            if((i+j)<5){
               a[i][j]=k;
               k++;
            }else
               //*********Found**********
               ____________________;
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
