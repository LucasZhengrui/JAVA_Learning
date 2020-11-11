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
	         for ( k = 0; k < j; k++) {
	            aTriangle[i][k]=k+1;
	     //*********Found********
	            System.out.print(aTriangle[i][k] + " ");
	         }
	         j--;
	         System.out.println(); //换行。
	      }
	   }
}
