import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//*********Found**********
public class Java_3 extends JApplet implements ________________________ {
   //扔两个骰子的游戏开始状态
   final int WON = 0, LOST = 1, CONTINUE = 2;  
   //程序其他变量初始化
   boolean firstRoll = true;   //第1次旋转为true
   int sumOfDice = 0;          //骰子之和
   int myPoint = 0;   //第1次旋转时,如没有win/loss
   int gameStatus = CONTINUE;  //游戏还没有结束
   //图形用户界面构件 
   JLabel die1Label, die2Label, sumLabel, pointLabel;
   JTextField firstDie, secondDie, sum, point;
   JButton roll;
   //设置图形用户界面构件
   public void init(){
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      die1Label = new JLabel( "骰子1" );
      c.add( die1Label );
      firstDie = new JTextField( 10 );
      firstDie.setEditable( false );
      c.add( firstDie );

      die2Label = new JLabel( "骰子2" );
      c.add( die2Label );
      secondDie = new JTextField( 10 );
      secondDie.setEditable( false );
      c.add( secondDie );

      sumLabel = new JLabel( "两个骰子数之和是" );
      c.add( sumLabel );
      sum = new JTextField( 10 );
      sum.setEditable( false );
      c.add( sum );

      pointLabel = new JLabel( "点是" );
      c.add( pointLabel );
      point = new JTextField( 10 );
      point.setEditable( false );
      c.add( point );

      roll = new JButton( "旋转骰子" );
//*********Found**********
      roll.addActionListener( ______________________ );
      c.add( roll );
   }
   //按钮压下时,调用的方法
   public void actionPerformed( ActionEvent e ){
      play();
   }
   //处理一个骰子旋转
   public void play(){
      if ( firstRoll ) {             //骰子第1次旋转
         sumOfDice = rollDice();         
         switch ( sumOfDice ) {
            case 7: case 11:         //在第1次旋转时赢
               gameStatus = WON;
               point.setText( "" );  //清除点的原文域
               break;
            case 2: case 3: case 12: //旋转第1次时输
               gameStatus = LOST;
               point.setText( "" );  //清除点的原文域
               break;
            default:                 //存储点
               gameStatus = CONTINUE;
               myPoint = sumOfDice;
               point.setText( Integer.toString( myPoint ) );
               firstRoll = false;
               break;
         }
      }
      else {
         sumOfDice = rollDice();
         if ( sumOfDice == myPoint )    // win by making point
            gameStatus = WON;
         else
            if ( sumOfDice == 7 )       //旋转数之和为7是输
               gameStatus = LOST;
      }
      if ( gameStatus == CONTINUE )
         showStatus( "再旋转" );
      else {
         if ( gameStatus == WON )
            showStatus( "玩家赢" + "再旋转骰子继续玩" );
         else 
            showStatus( "玩家输 " + 
               "再旋转骰子继续玩" );      
         firstRoll = true;
      }
   }   
   //旋转骰子方法
   public int rollDice(){
      int die1, die2, workSum;   
      die1 = 1 + ( int ) ( Math.random() * 6 );
      die2 = 1 + ( int ) ( Math.random() * 6 );
      workSum = die1 + die2;

      firstDie.setText( Integer.toString( die1 ) );
      secondDie.setText( Integer.toString( die2 ) );
//*********Found**********
      sum.setText( Integer.toString( ____________________ ) );
      return workSum;
   }
}



// 【第一空】 参考答案∶ ActionListener 
// 【第二空】 参考答案;  this 
// 【第三空】 参考答案∶ workSum 
