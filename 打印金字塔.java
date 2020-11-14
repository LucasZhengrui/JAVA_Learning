package Java_code;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*********Found**********
        for (int i=1;i<6;i++){
            for(int k=1;k<=5-i;k++)
                //*********Found**********
            	System.out.print(" ");;
            //*********Found**********
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            //*********Found**********
            System.out.print("\n");
        }
	}

}
