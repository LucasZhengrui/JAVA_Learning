// 本题的要求是∶ 
// 完成程序并运行求得答案。 
// 运行结果为∶ 
// aa=304 
// nn=263 
// ff=593.94 
// dd=6.73255002435115 
// 【第一空】 参考答案; char 
// 【第二空】 参考答案∶float 

import java.io.*;

public class Java_1
{
    public static void main(String args[])
    {
     //*********Found********
        ____   a='h';
        byte   b=6;
        int    i=200;
        long   n=567L;
     //*********Found********
        _____  f=98.99f;
        double d=4.7788;
        int    aa=a+i;
        long   nn=n-aa;
        float  ff=b*f;
        double dd=ff/aa+d;  
        System.out.println("aa="+aa);
        System.out.println("nn="+nn);
        System.out.println("ff="+ff);
        System.out.println("dd="+dd);
    }
}
