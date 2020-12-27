// 本题的要求是∶ 
// 完成程序并运行求得答案。 
// 运行结果为∶ 
// al=169 
// n1=855 
// f1=829.6 
// d1=959.1519754653931 
// 【第一空】 参考答案∶long 
// 【第二空】 参考答案∶double 

import java.io.*;

public class Java_1
{
    public static void main(String args[])
    {
        char   a='r';
        byte   b=8;
        int    i=55;
     //*********Found********
        _______   n=1024L;
        float  f=103.7f;
     //*********Found********
        _______ d=954.2431;
        int    a1=a+i;
        long   n1=n-a1;
        float  f1=b*f;
        double d1=f1/a1+d;  
        System.out.println("a1="+a1);
        System.out.println("n1="+n1);
        System.out.println("f1="+f1);
        System.out.println("d1="+d1);
    }
}
