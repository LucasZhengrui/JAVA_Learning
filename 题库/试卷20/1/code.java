// 本题的要求是∶ 
// 完成程序并运行求得答案。 
// 运行结果为∶ 
// aa=619 
// bb=-496 
// ff=593.94 
// dd=5.73831533317566 
// 【第一空】 参考答案∶char 
// 【第二空】 参考答案∶ int 

import java.io.*;

public class Java_1
{
    public static void main(String args[])
    {
     //*********Found********
        ______ a='w';
        byte   b1=6;
        int    i=500;
        long   b=123L;
        float  f=98.99f;
        double d=4.7788;
     //*********Found********
        ______ aa=a+i;
        long   bb=b-aa;
        float  ff=b1*f;
        double dd=ff/aa+d;  

        System.out.println("aa="+aa);
        System.out.println("bb="+bb);
        System.out.println("ff="+ff);
        System.out.println("dd="+dd);
    }
}
