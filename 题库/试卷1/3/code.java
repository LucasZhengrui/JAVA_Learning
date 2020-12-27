//if语句实例
import javax.swing.JOptionPane;

public class Java_3 {
   public static void main( String args[] ){
      String firstNumber,   //存储第1个输入数据
             secondNumber,  //存储第2个输入数据
             result;        //字符串输出
      int number1,          //用来比较的第1个int型数据 
          number2;          //用来比较的第2个int型数据
      //以字符串格式读输入数据
      firstNumber =
         JOptionPane.showInputDialog( "请输入第1个整数:" );
      secondNumber =
         JOptionPane.showInputDialog( "请输入第2个整数:" );          
      //将字符串转换为int整数
     //*********Found********
      number1 = Integer.parseInt( __________________________ );
      number2 = Integer.parseInt( secondNumber );
      //用空字符串初始化结果变量
      result = "";
      if ( number1 == number2 )
         result = number1 + " == " + number2;
      if ( number1 != number2 )
         result = number1 + " != " + number2;
      if ( number1 < number2 )
         result = result + "\n" + number1 + " < " + number2;
      if ( number1 > number2 )
         result = result + "\n" + number1 + " > " + number2;
      if ( number1 <= number2 )
         result = result + "\n" + number1 + " <= " + number2;
      if ( number1 >= number2 )
         result = result + "\n" + number1 + " >= " + number2;
      //显示结果
      JOptionPane.showMessageDialog(
         null, result, "比较结果",
     //*********Found********
         JOptionPane._______________________ );
      System.exit( 0 );
   }
}



// 【第一空】 参考答案: firstNumber 
// 【第二空】 参考答案：INFORMATION_MESSAGE 
