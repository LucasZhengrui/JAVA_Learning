// 本题的要求是∶ 
// 统计一个英文文本字符串中包含的英文元音字母的个数，使程序的运行结果如下∶ The text contained vowels:88 
// 【第一空】 参考答案; textLength 
// 【第二空】 参考答案∶ charAt（i） 
// 【第三空】 参考答案∶vowels++或者++vowels或者vowels=vowels+1或者vowels+=1

public class Java_3{
   public static void main(String[] args) {
      String text = "Beijing, the Capital City, is the political,"
                  + "cultural and diplomatic centre of China. It has"
                  + "become a modern international cosmopolitan city"
                  + "with more than 11 million people. The Capital"
                  + "International Airport, 23.5 km from the city centre,"
                  + "is China's largest and most advanced airport.";
      int vowels  = 0 ;
      //*********Found*********
      int _____________ = text.length();
      for(int i = 0; i < textLength; i++) {
         //*********Found*********
         char ch = Character.toLowerCase(text.__________);
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            //*********Found*********
            ____________;
         }
      }
      System.out.println("The text contained vowels: " + vowels + "\n" );
   }
}
