// 本题的要求是∶ 
// 完成程序并运行求得答案。 
// 运行结果为∶ 
// aa=220 
// b=569 
// ff=593.94 
// dd=7.478527296829224 
// 【第一空】  参考答案∶ long 
// 【第二空】  参考答案∶ double 

import java.io.*;

public class Java_1
{
    public static void main(String args[])
    {
        char   a='x';
        byte   b1=6;
        int    i=100;
        long   b=789L;
        float  f=98.99f;
        double d=4.7788;
        int    aa=a+i;
     //*********Found********
        ______ bb=b-aa;
        float  ff=b1*f;
     //*********Found********
        ______ dd=ff/aa+d;  

        System.out.println("aa="+aa);
        System.out.println("bb="+bb);
        System.out.println("ff="+ff);
        System.out.println("dd="+dd);
    }
}
