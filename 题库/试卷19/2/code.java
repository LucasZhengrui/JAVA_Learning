import javax.swing.*;
public class Java_2{
   public static void main( String args[] ){
      StringBuffer buf = new StringBuffer( "你好!祝你成功!" );
      String output = "buf = " + buf.toString() +
                      "\nCharacter at 0: " + buf.charAt( 0 ) +
                      "\nCharacter at 4: " + buf.charAt( 4 );
//*********Found**********
      char charArray[] = _____________________ char[ buf.length() ];
//*********Found**********
      buf.____________________( 0, buf.length(), charArray, 0 );
      output += "\n\n在字符串缓存中的字符是: ";
//*********Found**********
      for ( int i = 0; i < ______________________; ++i )
         output += charArray[ i ];
      buf.setCharAt( 0, '您' );
      buf.setCharAt( 6, '材' );
      output += "\n\nbuf = " + buf.toString();
//*********Found**********
      buf.______________________;
      output += "\n\nbuf = " + buf.toString();
      JOptionPane.showMessageDialog( null, output,
         "字符串缓存的字符相关方法示范",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
