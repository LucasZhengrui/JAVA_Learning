// 本题的要求是∶
// 1.以行的方式读入每个用户名及其密码信息，例如∶userl 123456（用户名和密码之间用一个空格隔开）;
// 2.循环读入，直到用户输入"quit"或者"QUIT"结束;
// 3.程序结束前提示用户输入一个文件名来保存前面输入的所有用户名和密码。
// 试题解析∶
// 【第一空】参考答案∶io
// 【第二空】参考答案∶ System.in
// 【第三空】参考答案∶ quit
// 【第四空】参考答案∶ tmp

//*********Found**********
import java.__________________.*;
import java.util.Vector;

public class Java_2
{
   public static void main(String args[])
   {
      Vector v=new Vector();
      try
      {
         //*********Found**********
         BufferedReader in = new BufferedReader(new InputStreamReader(___________________));
         String str = "";
         System.out.println("请输入用户和密码信息，中间用空格隔开，输入quit退出:");
         //*********Found**********
         while (!(str.equals("_________________")||str.equals("QUIT")))
         {
            str = in.readLine();
            if(isValid(str))
               v.add(str);
            else 
            {
               if(!(str.equals("quit")||str.equals("QUIT")))
                  System.out.println("The string is NOT valid!");
            }
         }
        
         System.out.println("请输入保存到的文件名:");
         str=in.readLine();

         String curDir = System.getProperty("user.dir");
         File savedfile=new File(curDir+"\\"+   str   );
            
         BufferedWriter out = new BufferedWriter(new FileWriter(savedfile));
         for(int i=0; i<v.size(); i++)
         {
            String tmp=(String)v.elementAt(i);
         //*********Found**********
            out.write(__________________);
            out.write("\n");
         }
         out.close();
        
      }
      catch (Exception e)
      {
         System.out.print("ERROR:"+e.getMessage());	
      }
   }
	
   /**
   * 判定输入的字符串是否符合规范
   * @param  s  输入的待校验的字符串
   * @return    校验的结果，正确则返回为真
   */
   public static boolean isValid(String s)
   {
      if(s.indexOf(" ")>0)
         return true;
      else
         return false;
   }
}
