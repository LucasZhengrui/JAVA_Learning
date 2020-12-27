// 本题的要求是∶ 
// 将一个char型数组写入test.dat文件中，然后将这 
// 些字符读出并显示在屏幕上。 
// 运行结果为∶ 
// a b c d e f 
// 【第一空】 参考答案∶ new FileOutputStream 
// 【第二空】 参考答案∶ c=in.readChar（）; 

import java.io.*;

public class Java_2
{
    public static void main(String[] args)
    {
        char[] charArray = {'a','b','c','d','e','f'};
        char c;   
        try
        {
     //*********Found********
            DataOutputStream out = new DataOutputStream(__________________________("test.dat"));
            for(int i =0; i<charArray.length; i++)
            {
                out.writeChar(charArray[i]);
            }
            out.close();
            DataInputStream in = new DataInputStream(new FileInputStream("test.dat"));
            while(in.available() != 0)
            {
     //*********Found********
                _____________________;
                System.out.print(c+" ");
            }
            System.out.println();
            in.close();
        }
        catch(IOException e){}
    }
}
