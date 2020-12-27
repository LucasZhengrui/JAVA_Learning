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
