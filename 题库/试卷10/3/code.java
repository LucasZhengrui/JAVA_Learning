import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    //*********Found**********
public class Java_3 extends JApplet implements ___________________{
   JLabel prompt;
   JTextField input;
   public void init(){
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );
      //*********Found**********
      prompt = new __________________( "输入球半径: " );
      input = new JTextField( 10 );
      //*********Found**********
      _________________________________;
      c.add( prompt );
      c.add( input );
   }
   public void actionPerformed( ActionEvent e ){
      double radius =
         Double.parseDouble( e.getActionCommand() );
      showStatus( "体积 " + sphereVolume( radius ) );
   }
   public double sphereVolume( double radius ){
      double volume =
         ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
      return volume;
   }
}
