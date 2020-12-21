package Java_code;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Menu extends Frame {

	static JMenuBar mb;
	
	static JMenu x,x1,x2;
	
	static JMenuItem m1,m2,m3,m4;
	
	static JFrame f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f = new JFrame("Menu");
		
		mb = new JMenuBar();
		
		x = new JMenu("File");
		x1 = new JMenu("Edit");
		x2 = new JMenu("Help");
	
		m1 = new JMenuItem("New");
		m2 = new JMenuItem("Save");
		m3 = new JMenuItem("Load");
		m4 = new JMenuItem("Quit");
		
		x.add(m1);
		x.add(m2);
		x.add(m3);
		x.add(m4);
		
		mb.add(x);
		mb.add(x1);
		mb.add(x2);
		
		f.setJMenuBar(mb);
		
		f.setSize(500, 500);
		f.setVisible(true);
		
		
	}

}
