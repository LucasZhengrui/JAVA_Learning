public class Java_2 {
   public static void main(String[] args) {
     //*********Found********
      int[][] aMatrix = new __________[];   

      int i = 0;
      int j = 0;
      int k = 0;
        
     //*********Found********
      for ( i = 0; i < ______________; i++) {
        	
         aMatrix[i]=new int[j+1];  //创建数组。
        	
         //给每个数组元素赋值并在一行中打印输出。
         for ( k = 0; k < aMatrix[i].length; k++) {
            aMatrix[i][k]=k+1;
            System.out.print(aMatrix[i][k] + " ");
         }
         j++;
         System.out.println(); //换行。 
      }
   }
}



// 【第一空】 参考答案∶int[6] 
// 【第二空】 参考答案∶ aMatrix.length或 6 
