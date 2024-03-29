import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFramePatient16 extends JFrame
{
	
	Font f1,f2;
	JButton b1,b2,b3,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
	JLabel label_login,l1,l2,l3;
	
	MyActionListener mli = new MyActionListener(this);
	
	MyFramePatient16(String s)
	{
		super("APPOINTMENT");
		this.setBounds(0, 0, 1920, 1080);
		setLayout(null);
		
		setForeground(Color.black);
		
		b1 = new JButton("--TODAY--");
		b2 = new JButton("--TOMORROW--");	
		
		bt1 = new JButton("12:00");
		bt2 = new JButton("1:00");
		bt3 = new JButton("2:00");
		bt4 = new JButton("3:00");
		bt5 = new JButton("4:00");
		bt6 = new JButton("5:00");
		bt7 = new JButton("6:00");
		bt8 = new JButton("7:00");
		bt9 = new JButton("8:00");
		
		l1 = new JLabel("AFTERNOON");
		l2 = new JLabel("EVENING");
		l3 = new JLabel("----9 Slots Available----");
		
	    ImageIcon screenL = new ImageIcon("doctor_page.png");
		label_login = new JLabel(screenL);
		label_login.setBounds(0,0,screenL.getIconWidth(),screenL.getIconHeight());
		label_login.setVisible(true);
		add(label_login);
		
		b1.setBounds(100,100,500,100);
		b2.setBounds(700,100,500,100);
		
		bt1.setBounds(415,500,100,50);
		bt2.setBounds(530,500,100,50);
		bt3.setBounds(645,500,100,50);
		bt4.setBounds(760,500,100,50);
		bt5.setBounds(875,500,100,50);
		bt6.setBounds(990,500,100,50);
		bt7.setBounds(415,700,100,50);
		bt8.setBounds(530,700,100,50);
		bt9.setBounds(645,700,100,50);
		
		l1.setBounds(100,500,300,50);
		l2.setBounds(100,700,300,50);
		l3.setBounds(100,300,500,50);
		
		f1 = new Font("Arial",Font.BOLD,20);
		f2 = new Font("Arial",Font.ITALIC,45);
		
		b3 = new JButton("Confirm booking");
		b3.setBounds(1000,900,400,100);
		b3.setFont(f2);
		label_login.add(b3);
		b3.addActionListener(mli);
		
		b1.setFont(f2);
		b2.setFont(f2);
		
		bt1.setFont(f1);
		bt2.setFont(f1);
		bt3.setFont(f1);
		bt4.setFont(f1);
		bt5.setFont(f1);
		bt6.setFont(f1);
		bt7.setFont(f1);
		bt8.setFont(f1);
		bt9.setFont(f1);
		
		l1.setFont(f2);
		l2.setFont(f2);
		l3.setFont(f2);
		
		label_login.add(l1);
		label_login.add(l2);
		label_login.add(l3);
		
		label_login.add(b1);
		label_login.add(b2);
		
		label_login.add(bt1);
		label_login.add(bt2);
		label_login.add(bt3);
		label_login.add(bt4);
		label_login.add(bt5);
		label_login.add(bt6);
		label_login.add(bt7);
		label_login.add(bt8);
		label_login.add(bt9);
		
		b1.addActionListener(mli);
		b2.addActionListener(mli);
		
		bt1.addActionListener(mli);
		bt2.addActionListener(mli);
		bt3.addActionListener(mli);
		bt4.addActionListener(mli);
		bt5.addActionListener(mli);
		bt6.addActionListener(mli);
		bt7.addActionListener(mli);
		bt8.addActionListener(mli);
		bt9.addActionListener(mli);
		
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	}
}