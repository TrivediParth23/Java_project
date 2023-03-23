import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class MyFrameAdmin2 extends JFrame
{
	JLabel label_screen;
    JTextArea t1,t2,t3,t4,t5,t6,t7,t8;
	Font f1;
	MyActionListener ml = new MyActionListener(this);
	
	MyFrameAdmin2(String s)
	{
		
		super("PATIENT LIST");
		this.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		f1 = new Font("Arial",Font.BOLD,40);
		
		
	    ImageIcon screen = new ImageIcon("patient_page.jpg");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
		label_screen.setVisible(true);
		add(label_screen);
		t1 =new JTextArea();
		t1.setBounds(10,10,1000,50);
		t1.setFont(f1);
		label_screen.add(t1);
		
		t2 =new JTextArea();
		t2.setBounds(10,70,1000,50);
		t2.setFont(f1);
		label_screen.add(t2);
		
		t3 =new JTextArea();
		t3.setBounds(10,130,1000,50);
		t3.setFont(f1);
		label_screen.add(t3);
		
		t4 =new JTextArea();
		t4.setBounds(10,190,1000,50);
		t4.setFont(f1);
		label_screen.add(t4);
		
		t5 =new JTextArea();
		t5.setBounds(10,250,1000,50);
		t5.setFont(f1);
		label_screen.add(t5);
		
		t6 =new JTextArea();
		t6.setBounds(10,310,1000,50);
		t6.setFont(f1);
		label_screen.add(t6);
		
		t7 =new JTextArea();
		t7.setBounds(10,370,1000,50);
		t7.setFont(f1);
		label_screen.add(t7);
		
		t8 =new JTextArea();
		t8.setBounds(10,430,1000,50);
		t8.setFont(f1);
		label_screen.add(t8);
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE  );
	}
}