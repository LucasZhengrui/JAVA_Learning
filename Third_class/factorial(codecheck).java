public class Sum {

	public static void main(String[] args) {
		 int total=0;

	        for(int i=1;i<=10;i++){

	            int cTotal=1;

	            for(int j=1;j<=i;j++){

	                cTotal*=j;

	            }

	            total+=cTotal;

	            System.out.println(i+"!="+cTotal);

	        }

	        System.out.println("1!+2!+3!+...+10!的阶乘和是："+total);
		// TODO Auto-generated method stub

	}

}
