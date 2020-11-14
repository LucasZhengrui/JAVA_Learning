package Java_code;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aMatrix = {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3},{4,4,4,4,4}};
		int i = 0; //循环变量
		int j = 0; //循环变量
        //print matrix
        for (i = 0; i < aMatrix.length; i++) {
   //*********Found********
	       for ( j = 0; j < aMatrix.length ; j++) {
   //*********Found********
	        System.out.print(aMatrix[i][j] + " ");
	       }
	    System.out.println();
        }
	}

}
