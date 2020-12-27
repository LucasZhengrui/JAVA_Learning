// 要求在命令行中使用java 
// Java_2进行调试，使程序输出结果形式如下（不一定完全相同）∶20! 
// =2432902008176640000 
// 【第一空】 参考答案：static 
// 【第二空】 参考答案∶random 
// 【第三空】 参考答案∶round 
// 【第四空】 参考答案∶k++ 

import java.util.Random;
public class Java_2{
    //*********Found**********
  public _______________________ void main(String args[]){
    Random random = new Random();
    //*********Found**********
    float x = _______________________.nextFloat();//产生0.0与1.0之间的一个浮点数
    //*********Found**********
    int n = Math._______________________(21*x);  //构造20以内的一个整数
    long f = 1 ;  //保存阶乘的结果
    int k = 1 ;  //循环变量
    do {
    //*********Found**********
       f*= _______________________;
    }while(k<=n);
    System.out.println(n+"!= "+f);
  }
}
