import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFramePatient19 extends JFrame
{
	//JCheckBox c1, c2, c3, c4,c5,c6,c7,c8,c9,c10;
	JButton c1, c2, c3, c4,c5,c6,c7,c8,c9,c10;
	Font f1;
	JLabel label_login;
	MyActionListener ml = new MyActionListener(this);
	MyFramePatient19(String s)
	{
		super("Specialities");
		setLayout(null);
		setBounds(0,0,1920,1080);
		
		ImageIcon screenL = new ImageIcon("doctor_page.png");
		label_login = new JLabel(screenL);
		label_login.setBounds(0,0,screenL.getIconWidth(),screenL.getIconHeight());
		label_login.setVisible(true);
		add(label_login);
		
		
		c1 = new JButton("Dentist");
		c2 = new JButton("Physian");
		c3 = new JButton("Dermetologist");
		c4 = new JButton("pediatrian");
		c5 = new JButton("ENT specialist");
		c6 = new JButton("Gynecologist");
		c7 = new JButton("Ayurveda");
		c8 = new JButton("Neurologist");
		c9 = new JButton("Homeopathic");
		c10 = new JButton("Dietian");
		
		label_login.add(c1);
		label_login.add(c2);
		label_login.add(c3);
		label_login.add(c4);
		label_login.add(c5);
		label_login.add(c6);
		label_login.add(c7);
		label_login.add(c8);
		label_login.add(c9);
		label_login.add(c10);
		
		c1.setBounds(200,50,500,100);
		c2.setBounds(200,250,500,100);
		c3.setBounds(200,450,500,100);
		c4.setBounds(200,650,500,100);
		c5.setBounds(200,850,500,100);
		c6.setBounds(800,50,500,100);
		c7.setBounds(800,250,500,100);
		c8.setBounds(800,450,500,100);
		c9.setBounds(800,650,500,100);
		c10.setBounds(800,850,500,100);
		
		
		f1 = new Font("Helvetica",Font.ITALIC,50);
		//f2 = new Font("Helvetica",Font.BOLD,60);
		
		c1.setFont(f1);
		c2.setFont(f1);
		c3.setFont(f1);
		c4.setFont(f1);
		c5.setFont(f1);
		c6.setFont(f1);
		c7.setFont(f1);
		c8.setFont(f1);
		c9.setFont(f1);
		c10.setFont(f1);
		
		c1.addActionListener(ml);
		c2.addActionListener(ml);
		c3.addActionListener(ml);
		c4.addActionListener(ml);
		c5.addActionListener(ml);
		c6.addActionListener(ml);
		c7.addActionListener(ml);
		c8.addActionListener(ml);
		c9.addActionListener(ml);
		c10.addActionListener(ml);
		
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	}
}