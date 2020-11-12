package Java_code;

import java.io.*;

public class Java_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[5][5];
	      int i,j,k=1;
	      for(i=0;i<5;i++)
	         //*********Found**********
	         for( j=0; j<5 ;j++ )
	            if((i+j)<4)
	               a[i][j]=0;
	            else{ 				
	               //*********Found**********
	               a[i][j]+=k;
	               k++;
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
