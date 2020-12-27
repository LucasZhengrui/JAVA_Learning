// 程序的功能是计算一组学生成绩的等级，运行结果如图所示。 
// Student θ score is 90 and grade is A 
// Student 1 score is 80 and grade is A 
// Student 2 core is 75 and grade is B 
// Student 3 score is 67 and grade is C 
// Student 4 score is 53 and grade is D 
// 【第一空】 参考答案∶ int 
// 【第二空】 参考答案; i<scores.1ength 
// 【第三空】 参考答案∶ scores[i]>best 
// 【第四空】 参考答案∶else if 


public class Java_1{
  public static void main(String[] args){
    //*********Found**********
    ________[] scores = {90,80,75,67,53}; 
    int best = 0; 
    char grade; 

    // 找出这组成绩中的最高分
    //*********Found**********
    for (int i=0;_________________; i++){
      //*********Found**********
      if (_______________)
        best = scores[i];
    }
 
    //求各分数的等级并显示
    for (int i=0; i<scores.length; i++){
      if (scores[i] >= best - 10)
        grade = 'A';
      //*********Found**********
      __________ (scores[i] >= best - 20)
        grade = 'B';
      else if (scores[i] >= best - 30)
        grade = 'C';
      else if (scores[i] >= best - 40)
        grade = 'D';
      else
        grade = 'F';
      System.out.println("Student " + i + " score is " + scores[i] +
        " and grade is " + grade);
    }
  }
}
