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
      int textLength = text.length();
      for(int i = 0; i < textLength; i++) {
         //*********Found*********
         char ch = Character.toLowerCase(text.charAt(i)); //填入charAt(i),找到text字符串的第i个字母，通过for循环一个一个的读取判断（toLowerCase函数，将字符串大写字母转换为小写，小写字母不动）
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            //*********Found*********
            vowels++; //如果ch是元音字母，代表元音字母的数目增加
         }
      }
      System.out.println("The text contained vowels: " + vowels + "\n" );
   }
}
