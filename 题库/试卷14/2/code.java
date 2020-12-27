// 本题的要求是∶ 
// Java_2.java程序的功能是在一个整型数组中查找指定的数，找到后将该数 
// 字及其位置打印出来。完成后并运行，所得结果为：
// Found 12 at index 4 
// 【第一空】 参考答案∶arrayOfInts.length 
// 【第二空】 参考答案∶true 

public class Java_2 {
   public static void main(String[] args) {
      int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
      int searchfor = 12;
      int i = 0;
      boolean foundIt = false;
     //*********Found********
      for ( ; i < _______________________; i++) {
         if (arrayOfInts[i] == searchfor) {
     //*********Found********
            foundIt = __________;
            break;
         }
      }
      if (foundIt) {
         System.out.println("Found " + searchfor + " at index " + i);
      }
      else {
         System.out.println(searchfor + "not in the array");
      }
   }
}
