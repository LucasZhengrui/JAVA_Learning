import javax.swing.*;
import java.awt.*;

public class Java_3
{
    public static void main(String[] args)
    {
        WelcomFrame frame = new WelcomFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //*********Found********
        frame.setVisible(true);
    }
}

     //*********Found********
class WelcomFrame extends JFrame
{
    public WelcomFrame()
    {
        setTitle("Java等级考试");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        WelcomPanel panel = new WelcomPanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
    }
    public static final int DEFAULT_WIDTH = 250;
    public static final int DEFAULT_HEIGHT = 100;
}

     //*********Found********
class WelcomPanel extends JPanel       
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("欢迎参加Java等级考试！", MESSAGE_X, MESSAGE_Y);
        setBackground(Color.white);
    }
    public static final int MESSAGE_X = 60;
    public static final int MESSAGE_Y = 50;
}
