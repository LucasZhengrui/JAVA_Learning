package while_for_dowhile;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int map[][] = new int[5][5];// 定义一个5 X 5的空二维数组
		 for(int i=0;i<5;i++)
			 for(int j=0;j<5;j++)
				 map[i][j]=0;       // 初始化矩阵
		 int []x ={0,1,0,-1};
		 int []y ={1,0,-1,0};
		 int a=0,b=0,c=0;
		 map[0][0]=1;
		 for(int k=2;k<=25;k++)
		 {
			 int ta = a+x[c];
			 int tb = b+y[c];
			 if( ta>4 || tb>4 || ta<0 || tb<0)
			 {
				 c = (c+1)%4;
				 ta = a+x[c];
				 tb = b+y[c];
			 }
			 if(map[ta][tb] != 0)
			 {
				 c = (c+1)%4;
				 ta = a+x[c];
				 tb = b+y[c];
			 }
			 a=ta;
			 b=tb;
			 map[a][b] = k;
		 }
		 for(int i=0;i<5;i++)
		 {
			 for(int j=0;j<5;j++)
			 {
				 System.out.print(map[i][j]+" ");
			 }
			 System.out.println();
		 }

	}

}



// 1 2 3 4 5 
// 16 17 18 19 6 
// 15 24 25 20 7 
// 14 23 22 21 8 
// 13 12 11 10 9 
