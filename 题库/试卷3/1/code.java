// 在考生文件夹下存有文件名为Java_1.java文件，要求在命令行中使用java Java_1进 
// 行调试， 使程序输出结果如下∶ 
// false 
// 【第一空】 参考答案∶ String
// 【第二空】 参考答案∶ String 
// 【第三空】 参考答案∶ Java_1 


public class Java_1{
  void equalsMethod1(){
    //*********Found**********
    String s1=new _____________("how are you");
    //*********Found**********
    String s2=new _____________("how are you");
    System.out.println(s1==s2);
  }
  public static void main(String args[]){
    //*********Found**********
    Java_1 OperAndExp=new _______________();
    //用于复合类型数据的“＝＝”运算符
    OperAndExp.equalsMethod1();
  }
}
