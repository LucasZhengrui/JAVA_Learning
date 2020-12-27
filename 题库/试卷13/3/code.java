     //*********Found********
import javax._________.*;

public class Java_3 {
   public static void main( String args[] )
   {
      String s1, s2, s3, s4, output;//声明5个字符串引用
      //初始化字符串
      s1 = new String( "您好！" );
      s2 = new String( "您好！" );
      // 判别字符串相同否
      if (s1 == s2 )
         output =
            "s1 和 s2 是内存中同一个对象";
      else
         output =
            "s1 和 s2 不是内存中同一个对象";
      //判别字符串内容相等否
     //*********Found********
      if ( ______________ )
         output += "\ns1 和 s2内容相等";
      else
         output += "\ns1 和s2 内容不相等are not equal";
      // 用intern()方法来获得与对象s1，s2内容都是"您好！"字符串的引用s3 和 s4.
     //*********Found********
      s3 = s1____________;
     //*********Found********
      s4 = s2_____________;
      //判别s3和s4是否是内存中相同的对象
      if ( s3 == s4 )
         output +=
            "\ns3 和s4 是内存中同一个对象";
      else
         output +=
            "\ns3 和 s4 不是内存中同一个对象";

      //判别s1和s3是否引用同一个对象
      if ( s1 == s3 )
         output +=
            "\ns1和s3是内存中同一个对象";
      else
         output +=
            "\ns1和s3不是内存中同一个对象";

      // 判别s2和s4是否是内存中相同的对象
      if ( s2 == s4 )
         output +=
            "\ns2和s4是内存中同一个对象";
      else
         output +=
            "\ns2和s4不是内存中同一个对象";
      //判别s1和s4是否是内存中同一个对象
      if ( s1 == s4 )
         output +=
            "\ns1和s4是内存中同一个对象";
      else
         output +=
            "\ns1和s4不是内存中同一个对象";

      JOptionPane.showMessageDialog( null, output,
     //*********Found********
         "___________________________",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }
}
