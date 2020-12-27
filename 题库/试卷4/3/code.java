// 在考生文件夹下存有文件名为Java_3.java和Java3.html文件，该程序的功能是计算学生的考生分数的平均分的Applet。程序运行结果如下∶  
// 数组是∶ [0][1][2][3] 
// grades[0] 77 68 86 73 
// grades[1] 96 87 89 81 
// gradest2] 70 90 86 81 
// 最低分∶68 
// 最高分∶96 
// 学生的平均分0组是76.0 
// 学生的平均分1组是88.25 
// 学生的平均分2组是81.75 
// 小程序已启动。 
// 【第一空】 参考答案∶JTextArea 
// 【第二空】 参考答案; lowGrade 
// 【第三空】 参考答案;setOfGrades.1ength


//DoubleArray.java
import java.awt.*;
import javax.swing.*;

public class Java_3 extends JApplet {
   int grades[][] = { { 77, 68, 86, 73 }, 
                      { 96, 87, 89, 81 },
                      { 70, 90, 86, 81 } };
   int students, exams;
   String output;
   JTextArea outputArea;
   //对实例变量初始化
   public void init(){
      students = grades.length;
      exams = grades[ 0 ].length;
      //*********Found**********
      outputArea = new ___________________();
      Container c = getContentPane();
      c.add( outputArea );
      //输出
      output = "数组是:";
      buildString();
      output += "\n\n最低分: " + minimum() +
                "\n最高分: " + maximum() + "\n";
      for ( int i = 0; i < students; i++ ) 
         output += "\n学生的平均分" + i + " 组是 " +
                   average( grades[ i ] );
      outputArea.setFont(
         new Font( "Courier", Font.PLAIN, 12 ) );
      outputArea.setText( output );
   }
   //找最底分
   public int minimum(){ 
      int lowGrade = 100;
      for ( int i = 0; i < students; i++ ) 
         for ( int j = 0; j < exams; j++ ) 
            if ( grades[ i ][ j ] < lowGrade )
               lowGrade = grades[ i ][ j ];
      //*********Found**********
      return __________________;
   }
   //找最高分
   public int maximum(){ 
      int highGrade = 0;
      for ( int i = 0; i < students; i++ ) 
         for ( int j = 0; j < exams; j++ ) 
            if ( grades[ i ][ j ] > highGrade )
               highGrade = grades[ i ][ j ];
      return highGrade;
   }
   //对各组学生确定平均分
   public double average( int setOfGrades[] ){
      int total = 0;
      for ( int i = 0; i < setOfGrades.length; i++ )
         total += setOfGrades[ i ];
      //*********Found**********
      return ( double ) total / ________________________;
   }
   //输出格式
   public void buildString(){
      output += "           ";  
      for ( int i = 0; i < exams; i++ ) 
         output += "[" + i + "]  ";
      for ( int i = 0; i < students; i++ ) {
         output += "\ngrades[" + i + "]   ";
         for ( int j = 0; j < exams; j++ ) 
            output += grades[ i ][ j ] + "   ";
      }
   }
}
