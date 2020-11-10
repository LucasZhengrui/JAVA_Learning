package Java_code;

import javax.swing.JOptionPane;// 使用对话框所要用到的包

public class Java_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    
		String firstNumber,   //存储第1个输入数据
        secondNumber,  //存储第2个输入数据
        result;        //字符串输出
		int number1,          //用来比较的第1个int型数据 
		number2;          //用来比较的第2个int型数据
// 定义变量部分    
    
 //以字符串格式读输入数据
		firstNumber = JOptionPane.showInputDialog( "请输入第1个整数:" );
		secondNumber = JOptionPane.showInputDialog( "请输入第2个整数:" );   
    
 //将字符串转换为int整数（数据类型的转换）
//*********Found********
		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );
    
    
 //用空字符串初始化结果变量（进行两个数字的大小比较判断)
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
				JOptionPane.INFORMATION_MESSAGE);
        
		System.exit( 0 );
	}

}
