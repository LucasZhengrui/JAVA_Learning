import java.awt.Graphics;
import javax.swing.*;
//*********Found**********
public class Java_3 extends __________________{
   int choice;   
   public void init(){
      String input;
      input = JOptionPane.showInputDialog( 
                 "输入1去画直线\n" +
                 "输入2去画矩形\n" +
                 "输入3去画椭圆\n" );
//*********Found**********
      choice = Integer.______________________( input );
   }
//*********Found**********
   public void paint( _____________________ ){
      for ( int i = 0; i < 10; i++ ){ 
         switch( choice ) {
            case 1:
               g.drawLine( 10, 10, 250, 10 + i * 10 );
               break;
            case 2:
               g.drawRect( 10 + i * 10, 10 + i * 10,
                           50 + i * 10, 50 + i * 10 );
               break;
            case 3:
               g.drawOval( 10 + i * 10, 10 + i * 10,
                           50 + i * 10, 50 + i * 10 );
               break;
            default:
               JOptionPane.showMessageDialog(
                  null, "输入非法值" );
         }
      } 
   } 
} 
