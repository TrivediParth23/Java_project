import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class MyFrameDoctor3 extends JFrame
{
	JLabel label_screen;
    JTextArea t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JButton b11,b12,b13,b14,b15,b16,b17,b18;
	Font f1,f2;
	MyActionListener ml = new MyActionListener(this);
	
	MyFrameDoctor3(String s)
	{
		
		super("PATIENT LIST");
		this.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		f1 = new Font("Arial",Font.BOLD,40);
		f2 = new Font("Arial",Font.PLAIN,20);
		
		
	    ImageIcon screen = new ImageIcon("patient_page.jpg");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
		label_screen.setVisible(true);
		add(label_screen);
		
		t1 =new JTextArea();
		t1.setBounds(10,10,1000,50);
		t1.setFont(f1);
		label_screen.add(t1);
		
		b1 = new JButton("Cancel 1st");
		b1.setBounds(10,65,500,40);
		label_screen.add(b1);
		b1.addActionListener(ml);
		b1.setFont(f2);
		
		b11 = new JButton("Details for 1st");
		b11.setBounds(510,65,500,40);
		label_screen.add(b11);
		b11.addActionListener(ml);
		b11.setFont(f2);
		
		t2 =new JTextArea();
		t2.setBounds(10,110,1000,50);
		t2.setFont(f1);
		label_screen.add(t2);
		
		b2 = new JButton("Cancel 2nd");
		b2.setBounds(10,165,500,40);
		label_screen.add(b2);
		b2.addActionListener(ml);
		b2.setFont(f2);
		
		b12 = new JButton("Details for 2nd");
		b12.setBounds(510,165,500,40);
		label_screen.add(b12);
		b12.addActionListener(ml);
		b12.setFont(f2);
		
		t3 =new JTextArea();
		t3.setBounds(10,210,1000,50);
		t3.setFont(f1);
		label_screen.add(t3);
		
		b3 = new JButton("Cancel 3rd");
		b3.setBounds(10,265,500,40);
		label_screen.add(b3);
		b3.addActionListener(ml);
		b3.setFont(f2);
		
		b13 = new JButton("Details for 3rd");
		b13.setBounds(510,265,500,40);
		label_screen.add(b13);
		b13.addActionListener(ml);
		b13.setFont(f2);
		
		t4 =new JTextArea();
		t4.setBounds(10,310,1000,50);
		t4.setFont(f1);
		label_screen.add(t4);
		
		b4 = new JButton("Cancel 4th");
		b4.setBounds(10,365,500,40);
		label_screen.add(b4);
		b4.addActionListener(ml);
		b4.setFont(f2);
		
		b14 = new JButton("Details for 4th");
		b14.setBounds(510,365,500,40);
		label_screen.add(b14);
		b14.addActionListener(ml);
		b14.setFont(f2);
		
		t5 =new JTextArea();
		t5.setBounds(10,410,1000,50);
		t5.setFont(f1);
		label_screen.add(t5);
		
		b5 = new JButton("Cancel 5th");
		b5.setBounds(10,465,500,40);
		label_screen.add(b5);
		b5.addActionListener(ml);
		b5.setFont(f2);
		
		b15 = new JButton("Details for 5th");
		b15.setBounds(510,465,500,40);
		label_screen.add(b15);
		b15.addActionListener(ml);
		b15.setFont(f2);
		
		t6 =new JTextArea();
		t6.setBounds(10,510,1000,50);
		t6.setFont(f1);
		label_screen.add(t6);
		
		b6 = new JButton("Cancel 6th");
		b6.setBounds(10,565,500,40);
		label_screen.add(b6);
		b6.addActionListener(ml);
		b6.setFont(f2);
		
		b16 = new JButton("Details for 6th");
		b16.setBounds(510,565,500,40);
		label_screen.add(b16);
		b16.addActionListener(ml);
		b16.setFont(f2);
		
		t7 =new JTextArea();
		t7.setBounds(10,610,1000,50);
		t7.setFont(f1);
		label_screen.add(t7);
		
		b7 = new JButton("Cancel 7th");
		b7.setBounds(10,665,500,40);
		label_screen.add(b7);
		b7.addActionListener(ml);
		b7.setFont(f2);
		
		b17 = new JButton("Details for 7th");
		b17.setBounds(510,665,500,40);
		label_screen.add(b17);
		b17.addActionListener(ml);
		b17.setFont(f2);
		
		t8 =new JTextArea();
		t8.setBounds(10,710,1000,50);
		t8.setFont(f1);
		label_screen.add(t8);
		
		b8 = new JButton("Cancel 8th");
		b8.setBounds(10,765,500,40);
		label_screen.add(b8);
		b8.addActionListener(ml);
		b8.setFont(f2);
		
		b18 = new JButton("Details for 8th");
		b18.setBounds(510,765,500,40);
		label_screen.add(b18);
		b18.addActionListener(ml);
		b18.setFont(f2);
		
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE  );
	}
}