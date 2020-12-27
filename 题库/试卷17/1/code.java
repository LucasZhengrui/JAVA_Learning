// 本题的要求是∶ 
// 完成程序并运行求得答案。 
// 运行结果为∶ 
// aa=313 
// bb=365 
// ff=791.92 
// dd=7.30889581565857 
// 【第一空】 参考答案∶char 
// 【第二空】 参考答案∶float 

import java.io.*;

public class Java_1
{
    public static void main(String args[])
    {
     //*********Found********
        ______ a='q';
        byte   b1=8;
        int    i=200;
        long   b=678L;
     //*********Found********
        ______ f=98.99f;
        double d=4.7788;
        int    aa=a+i;
        long   bb=b-aa;
        float  ff=b1*f;
        double dd=ff/aa+d;  

        System.out.println("aa="+aa);
        System.out.println("bb="+bb);
        System.out.println("ff="+ff);
        System.out.println("dd="+dd);
    }
}
