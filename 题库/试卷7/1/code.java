// 本题的要求是∶ 
// 对Java_1.java文件进行完善并调试，使程序的输出结果如 
// 下∶ 
// 张民? 
// 王托? 
// 强强? 
// 【第一空】 参考答案∶ +"?"或者 +'?' 


public class Java_1 {
   public static void main(String args[]) {
      int x = 1;
      String [] names = { "张民", "王托", "强强" };
      for (int i = 0; i < names.length; i++) {
      //*********Found**********
         names[i] = names[i]_______________;
         System.out.println(names[i]);
      }
   }
}
