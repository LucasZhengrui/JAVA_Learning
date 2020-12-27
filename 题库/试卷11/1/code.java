// 在考生文件夹中存有文件名为Java_1.java文件，要求在命
// 令行中使用java Java_1进行调试，程序结果为∶
// a b c d e f g h i
// 【第一空】参考答案∶ DataOutputStream
// 【第二空】参考答案∶ test. dat
// 【第三空】参考答案∶ close

import java.io.*;

public class Java_1 {
  public static void main(String[] args) {
    char[] charArray = {'a','b','c','d','e','f','g','h','i'};
    char c  ;
    try{
//*********Found**********
        DataOutputStream out = new ______________________(
               new FileOutputStream("test.dat"));
        for(int i =0; i<charArray.length; i++){
           out.writeChar(charArray[i]);
        }
        out.close();		
        DataInputStream in = new DataInputStream(
//*********Found**********
               new FileInputStream("____________________"));
        while(in.available() != 0){
           c=in.readChar();
           System.out.print(c+" ");
        }
        System.out.println();
//*********Found**********
        in.____________________();
    }catch(IOException e){}
  }
}
