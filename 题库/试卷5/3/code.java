//程序的功能是从1开始，每秒打印一个递增的整数。
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class Java_3{
   public static void main(String[] args){
      ActionListener listener = new TimePrinter();
     //*********Found********
      Timer t = new Timer(1000, _____________);
      t.start();
      JOptionPane.showMessageDialog(null, "退出程序?");
      System.exit(0);
   }
}

     //*********Found********
class TimePrinter implements ______________________{
     //*********Found********
   public void action________________(ActionEvent event){
      i++;
      System.out.println(i);
      Toolkit.getDefaultToolkit().beep();
   }
   int i = 0;
}
