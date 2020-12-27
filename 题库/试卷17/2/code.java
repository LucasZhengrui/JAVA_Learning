// 本题的要求是∶ 
// 将一个有5个元素的整型数组录入data.dat文件中，再将data.dat 
// 中的所有数据读出并显示。 
// 运行结果为∶
// 1
// 2 
// 3
// 4 
// 5 
// 【第一空】 参考答案∶writeInt 
// 【第二空】 参考答案∶FileInputStream 

import java.io.*;

public class Java_2
{
    public static void main(String[] args)
    {
        int[] intArray = {1,2,3,4,5};
        int j  ;
    
        try
        {
            DataOutputStream out = new DataOutputStream(
              new FileOutputStream("data.dat"));
            for(j =0; j<intArray.length; j++)
            {
     //*********Found********
                out.____________________________(intArray[j]);
            }
            out.close();
  		
            DataInputStream in = new DataInputStream(
     //*********Found********
              new ____________________________("data.dat"));
            while(in.available() != 0)
            {
                j = in.readInt();
                System.out.println(j);
            }
            in.close();
        }
        catch(IOException e){}
    }
}
