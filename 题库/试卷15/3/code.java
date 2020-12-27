// 本题的要求是∶ 
// Java_3.java程序是一个二分法检索算法程序，完成程序，然后运行并所 
// 得结果为∶ 
// 对ArrayList分类∶【白，粉红，紫，红，茶色，蓝，黄，黑】 
// 检索关键字∶黑 
// 找到下标7 
// 检索关键字∶红 
// 找到下标3 
// 检索关键字∶粉红 
// 找到下标1 
// 检索关键字∶绿 
// 没有找到<-5> 
// 检索关键字∶灰 
// 没有找到<-1> 
// 检索关键字∶橙色 
// 没有找到<-1> 
// 【第一空】 参考答案∶橙色 
// 【第二空】 参考答案∶printSearchResults（） 

//Java_3.java:二分法检索算法
import java.util.*;

public class Java_3 {
   private String colors[] = { "红", "白", "蓝",
                               "黑", "黄", 
                               "紫", "茶色", "粉红" };
   private ArrayList aList; // ArrayList 引用
   public Java_3(){
      aList = new ArrayList( Arrays.asList( colors ) );             
      Collections.sort( aList );   //ArrayList分类
      System.out.println( "对ArrayList分类: " + aList );
   }

   public void printSearchResults(){
      printSearchResultsHelper( colors[ 3 ] ); //首项
      printSearchResultsHelper( colors[ 0 ] ); //中间项
      printSearchResultsHelper( colors[ 7 ] ); //最后项
      printSearchResultsHelper( "绿" );        //最低
      printSearchResultsHelper( "灰" );        //不存在
     //*********Found********
      printSearchResultsHelper( "____________" );      //不存在
   }

   private void printSearchResultsHelper( String key ){
      int result = 0;
      System.out.println( "\n检索关键字: " + key );
      result = Collections.binarySearch( aList, key );
      System.out.println( ( result >= 0 ? "找到下标"
                         + result
                         : "没有找到 (" + result + ")" ) );
   }

   public static void main( String args[] ){
     //*********Found********
      new Java_3().____________________________;
   }                                           
}
