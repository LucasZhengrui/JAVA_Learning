package Java_code;

public class Java_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*********Found**********
	    int[] scores = {90,80,75,67,53}; 
	    int best = 0; 
	    char grade;
	    // 找出这组成绩中的最高分
	    //*********Found**********
	    for (int i=0;i<scores.length; i++){
	      //*********Found**********
	      if (scores[i] > scores[1])
	        best = scores[i];
	    }
	 
	    //求各分数的等级并显示
	    for (int i=0; i<scores.length; i++){
	      if (scores[i] >= best - 10)
	        grade = 'A';
	      //*********Found**********
	      else if (scores[i] >= best - 20)
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



// Student 0 score is 90 and grade is A
// Student 1 score is 80 and grade is A
// Student 2 score is 75 and grade is B
// Student 3 score is 67 and grade is C
// Student 4 score is 53 and grade is D
