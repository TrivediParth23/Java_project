import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.AWTEvent.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import java.util.Properties;  
//import javax.mail.*;  
//import javax.mail.internet.*; 

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	MyFramePatient mf1;
	MyFramePatient1 mf4;
	MyFramePatient2 mf5;
	MyFramePatient3 mf6;
	MyFramePatient4 mf7;
	MyFramePatient5 mf8;
	MyFramePatient6 mf9;
	MyFramePatient7 mf10;
	MyFramePatient8 mf11;
	MyFramePatient9 mf12;
	MyFramePatient10 mf13;
	MyFramePatient11 mf14;
	MyFramePatient12 mf15;
	MyFramePatient13 mf16;
	MyFramePatient14 mf17;
	MyFramePatient15 mf18;
	MyFramePatient16 mf19;
	MyFramePatient17 mf20;
	MyFramePatient18 mf21;
	MyFramePatient19 mf22;
	MyFramePatient20 mf23;
	MyFramePatient21 mf24;
	MyFramePatient22 mf25;
	MyFramePatient23 mf26;
	MyFramePatient24 mf27;
	MyFramePatient25 mf28;
	MyFramePatient26 mf29;
	MyFramePatient27 mf30;
	MyFramePatient28 mf31;
	MyFramePatient29 mf32;
	
	MyFrameDoctor mfd;
	MyFrameDoctor1 mfd1;
	MyFrameDoctor2 mfd2;
	MyFrameDoctor3 mfd3;
	
	MyFrameAdmin mf3;
	MyFrameAdmin1 mfa1;
	MyFrameAdmin2 mfa2;
	MyFrameAdmin3 mfa3;
	MyFrameAdmin4 mfa4;
	
	MyActionListener(MyFrame m)
	{
		this.mf = m;
	}
	MyActionListener(MyFramePatient m)
	{
		this.mf1 = m;
	}
	MyActionListener(MyFrameDoctor m)
	{
		this.mfd = m;
	}
	MyActionListener(MyFrameAdmin m)
	{
		this.mf3 = m;
	}
	MyActionListener(MyFramePatient1 m)
	{
		this.mf4 = m;
	}
	MyActionListener(MyFramePatient2 m)
	{
		this.mf5 = m;
	}
	MyActionListener(MyFramePatient3 m)
	{
		this.mf6 = m;
	}
	MyActionListener(MyFramePatient4 m)
	{
		this.mf7 = m;
	}
	MyActionListener(MyFramePatient5 m)
	{
		this.mf8 = m;
	}
	MyActionListener(MyFramePatient6 m)
	{
		this.mf9 = m;
	}
	MyActionListener(MyFramePatient7 m)
	{
		this.mf10 = m;
	}
	MyActionListener(MyFramePatient8 m)
	{
		this.mf11 = m;
	}
	MyActionListener(MyFramePatient9 m)
	{
		this.mf12 = m;
	}
	MyActionListener(MyFramePatient10 m)
	{
		this.mf13 = m;
	}
	MyActionListener(MyFramePatient11 m)
	{
		this.mf14 = m;
	}
	MyActionListener(MyFramePatient12 m)
	{
		this.mf15 = m;
	}
	MyActionListener(MyFramePatient13 m)
	{
		this.mf16 = m;
	}
	MyActionListener(MyFramePatient14 m)
	{
		this.mf17 = m;
	}
	MyActionListener(MyFramePatient15 m)
	{
		this.mf18 = m;
	}
	MyActionListener(MyFramePatient16 m)
	{
		this.mf19 = m;
	}
	MyActionListener(MyFramePatient17 m)
	{
		this.mf20 = m;
	}
	MyActionListener(MyFramePatient18 m)
	{
		this.mf21 = m;
	}
	MyActionListener(MyFramePatient19 m)
	{
		this.mf22 = m;
	}
	MyActionListener(MyFramePatient20 m)
	{
		this.mf23 = m;
	}
	MyActionListener(MyFramePatient21 m)
	{
		this.mf24 = m;
	}
	MyActionListener(MyFramePatient22 m)
	{
		this.mf25 = m;
	}
	MyActionListener(MyFramePatient23 m)
	{
		this.mf26 = m;
	}
	MyActionListener(MyFramePatient24 m)
	{
		this.mf27 = m;
	}
	MyActionListener(MyFramePatient25 m)
	{
		this.mf28 = m;
	}
	MyActionListener(MyFramePatient26 m)
	{
		this.mf29 = m;
	}
	MyActionListener(MyFramePatient27 m)
	{
		this.mf30 = m;
	}
	MyActionListener(MyFramePatient28 m)
	{
		this.mf31 = m;
	}
	MyActionListener(MyFramePatient29 m)
	{
		this.mf32 = m;
	}
	
	MyActionListener(MyFrameDoctor1 m)
	{
		this.mfd1 = m;
	}
	MyActionListener(MyFrameDoctor2 m)
	{
		this.mfd2 = m;
	}
	MyActionListener(MyFrameDoctor3 m)
	{
		this.mfd3 = m;
	}
	
	MyActionListener(MyFrameAdmin1 m)
	{
		this.mfa1 = m;
	}
	MyActionListener(MyFrameAdmin2 m)
	{
		this.mfa2 = m;
	}
	MyActionListener(MyFrameAdmin3 m)
	{
		this.mfa3 = m;
	}
	MyActionListener(MyFrameAdmin4 m)
	{
		this.mfa4 = m;
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand().equals("Patient"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf1 = new MyFramePatient("PATIENT LOGIN");
			this.mf1.setVisible(true);
		}
		else if(e.getActionCommand().equals("Doctor"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
		    mfd = new MyFrameDoctor("DOCTOR LOGIN");
			this.mfd.setVisible(true);
		}
		else if(e.getActionCommand().equals("DOCTOR LOGIN"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
		    mfd1 = new MyFrameDoctor1("PATIENT LIST");
			this.mfd1.setVisible(true);
			this.mfd.setVisible(false);
			String userText = mfd.t1.getText();
			String pass = mfd.t2.getText();
			String doctorfield = mfd.t3.getText();
			String pswdText = String.valueOf(pass);
            
            if (userText.equalsIgnoreCase("dr.ABC") && pswdText.equalsIgnoreCase("#12345") && doctorfield.equalsIgnoreCase("dentist"))
            {
                JOptionPane.showMessageDialog(this.mfd, "Login Successful","Status",JOptionPane.INFORMATION_MESSAGE);
                mfd.t1.setText("");
                mfd.t2.setText("");
				mfd.t3.setText("");
                mfd.t1.setEditable(false);
                mfd.t2.setEditable(false);
				mfd.t3.setEditable(false);
              
            }else if (userText.equalsIgnoreCase("dr.XYZ") && pswdText.equalsIgnoreCase("#67890") && doctorfield.equalsIgnoreCase("pediatrician"))
            {
                JOptionPane.showMessageDialog(this.mfd, "Login Successful","Status",JOptionPane.INFORMATION_MESSAGE);
                mfd.t1.setText("");
                mfd.t2.setText("");
				mfd.t3.setText("");
                mfd.t1.setEditable(false);
                mfd.t2.setEditable(false);
                mfd.t3.setEditable(false);
              
            }else if (userText.equalsIgnoreCase("dr.EFG") && pswdText.equalsIgnoreCase("#12121") && doctorfield.equalsIgnoreCase("Cardiologist"))
            {
                JOptionPane.showMessageDialog(this.mfd, "Login Successful","Status",JOptionPane.INFORMATION_MESSAGE);
                mfd.t1.setText("");
                mfd.t2.setText("");
				mfd.t3.setText("");
                mfd.t1.setEditable(false);
                mfd.t2.setEditable(false);
				mfd.t3.setEditable(false);
              
            }else if (userText.equalsIgnoreCase("dr.RST") && pswdText.equalsIgnoreCase("#23232") && doctorfield.equalsIgnoreCase("Homeopath"))
            {
                JOptionPane.showMessageDialog(this.mfd, "Login Successful","Status",JOptionPane.INFORMATION_MESSAGE);
                mfd.t1.setText("");
                mfd.t2.setText("");
				mfd.t3.setText("");
                mfd.t1.setEditable(false);
                mfd.t2.setEditable(false);
				mfd.t3.setEditable(false);
              
            }else if (userText.equalsIgnoreCase("dr.abc") && pswdText.equalsIgnoreCase("@1212") && doctorfield.equalsIgnoreCase("dentist"))
            {
                JOptionPane.showMessageDialog(this.mfd, "Login Successful","Status",JOptionPane.INFORMATION_MESSAGE);
                mfd.t1.setText("");
                mfd.t2.setText("");
				mfd.t3.setText("");
                mfd.t1.setEditable(false);
                mfd.t2.setEditable(false);
				mfd.t3.setEditable(false);
              
            }else if (userText.equalsIgnoreCase("dr.bcd") && pswdText.equalsIgnoreCase("@2323") && doctorfield.equalsIgnoreCase("ENT"))
            {
                JOptionPane.showMessageDialog(this.mfd, "Login Successful","Status",JOptionPane.INFORMATION_MESSAGE);
                mfd.t1.setText("");
                mfd.t2.setText("");
				mfd.t3.setText("");
                mfd.t1.setEditable(false);
                mfd.t2.setEditable(false);
				mfd.t3.setEditable(false);
              
            }else if (userText.equalsIgnoreCase("dr.cde") && pswdText.equalsIgnoreCase("@3434") && doctorfield.equalsIgnoreCase("Cardiologist"))
            {
                JOptionPane.showMessageDialog(this.mfd, "Login Successful","Status",JOptionPane.INFORMATION_MESSAGE);
                mfd.t1.setText("");
                mfd.t2.setText("");
				mfd.t3.setText("");
                mfd.t1.setEditable(false);
                mfd.t2.setEditable(false);
				mfd.t3.setEditable(false);
              
            }          
            else 
            {
				this.mfd.setVisible(true);
				this.mfd1.setVisible(false);
                JOptionPane.showMessageDialog(this.mfd, "Invalid Username or Password","Status",JOptionPane.ERROR_MESSAGE);
                mfd.t1.setText("");
                mfd.t2.setText("");
				mfd.t3.setText("");
            }
		}
		else if(e.getActionCommand().equals("Admin"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf3 = new MyFrameAdmin("ADMIN LOGIN");
			this.mf3.setVisible(true);
		}
		else if(e.getActionCommand().equals("ADMIN LOGIN"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
				mfa1 = new MyFrameAdmin1("PATIENT LIST");
				this.mfa1.setVisible(true);
				this.mf3.setVisible(false);
				String userText = mf3.t1.getText();
				String pass = mf3.t2.getText();
				String pswdText = String.valueOf(pass);
            
            if (userText.equalsIgnoreCase("Admin") && pswdText.equalsIgnoreCase("12345"))
            {
                JOptionPane.showMessageDialog(this.mf3, "Login Successful","Status",JOptionPane.INFORMATION_MESSAGE);
                mf3.t1.setText("");
                mf3.t2.setText("");
                mf3.t1.setEditable(false);
                mf3.t2.setEditable(false);
              
            } 
            else 
            {
				this.mf3.setVisible(true);
				this.mfa1.setVisible(false);
                JOptionPane.showMessageDialog(this.mf3, "Invalid Username or Password","Status",JOptionPane.ERROR_MESSAGE);
                mf3.t1.setText("");
                mf3.t2.setText("");
            }
		}
		
		else if(e.getActionCommand().equals("See List of Doctors"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mfa3 = new MyFrameAdmin3("DOCTOR LIST");
			this.mfa3.setVisible(true);
			mfa3.bpage1.setEnabled(false);
			this.mfa1.setVisible(false);
		}
		else if(e.getActionCommand().equals("NEXT"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mfa4 = new MyFrameAdmin4("DOCTOR LIST");
			this.mfa4.setVisible(true);
			mfa4.bpage2.setEnabled(false);
			this.mfa3.setVisible(false);
		}
		else if(e.getActionCommand().equals("PREVIOUS"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mfa3 = new MyFrameAdmin3("DOCTOR LIST");
			this.mfa3.setVisible(true);
			mfa3.bpage1.setEnabled(false);
			this.mfa4.setVisible(false);
		}
		
		else if(e.getActionCommand().equals("PATIENT LOGIN"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf4 = new MyFramePatient1("CHOICE BY REQUIREMENT");
			this.mf4.setVisible(true);
			this.mf1.setVisible(false);
			String s1 = this.mf1.t1.getText();
			String s2 = this.mf1.t2.getText();
			String s3 = this.mf1.t3.getText();
			try
			{
				FileWriter fw = new FileWriter("Patient_data.txt",true);
				
				fw.write("Name:- "+s1+" "+"Mo. no.:- "+s2+" "+"City:- "+s3+",");
				fw.close();
			}
			catch(Exception exe){}
		}
		
		else if(e.getActionCommand().equals("Select doctor"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf5 = new MyFramePatient2("APPOINTMENT");
			this.mf5.setVisible(true);
			mf5.bpage1.setEnabled(false);
			this.mf4.setVisible(false);
		}
		else if(e.getActionCommand().equals("Select specialities"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf22 = new MyFramePatient19("Specialities");
			this.mf22.setVisible(true);
			this.mf4.setVisible(false);
		}
		else if(e.getActionCommand().equals("Dentist"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf23 = new MyFramePatient20("APPOINTMENT");
			this.mf23.setVisible(true);
			this.mf22.setVisible(false);
		}
		else if(e.getActionCommand().equals("Physian"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf24 = new MyFramePatient21("APPOINTMENT");
			this.mf24.setVisible(true);
			this.mf22.setVisible(false);
		}
		else if(e.getActionCommand().equals("Dermetologist"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf25 = new MyFramePatient22("APPOINTMENT");
			this.mf25.setVisible(true);
			this.mf22.setVisible(false);
		}
		else if(e.getActionCommand().equals("pediatrian"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf26 = new MyFramePatient23("APPOINTMENT");
			this.mf26.setVisible(true);
			this.mf22.setVisible(false);
		}
		else if(e.getActionCommand().equals("ENT specialist"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf27 = new MyFramePatient24("APPOINTMENT");
			this.mf27.setVisible(true);
			this.mf22.setVisible(false);
		}
		else if(e.getActionCommand().equals("Gynecologist"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf28 = new MyFramePatient25("APPOINTMENT");
			this.mf28.setVisible(true);
			this.mf22.setVisible(false);
		}
		else if(e.getActionCommand().equals("Ayurveda"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf29 = new MyFramePatient26("APPOINTMENT");
			this.mf29.setVisible(true);
			this.mf22.setVisible(false);
		}
		else if(e.getActionCommand().equals("Neurologist"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf30 = new MyFramePatient27("APPOINTMENT");
			this.mf30.setVisible(true);
			this.mf22.setVisible(false);
		}
		else if(e.getActionCommand().equals("Homeopathic"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf31 = new MyFramePatient28("APPOINTMENT");
			this.mf31.setVisible(true);
			this.mf22.setVisible(false);
		}
		else if(e.getActionCommand().equals("Dietian"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf32 = new MyFramePatient29("APPOINTMENT");
			this.mf32.setVisible(true);
			this.mf22.setVisible(false);
		}
		
		
		else if(e.getActionCommand().equals("Next"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf14 = new MyFramePatient11("APPOINTMENT");
			this.mf14.setVisible(true);
			mf14.bpage2.setEnabled(false);
			this.mf5.setVisible(false);
		}
		else if(e.getActionCommand().equals("Previous"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf5 = new MyFramePatient2("APPOINTMENT");
			this.mf5.setVisible(true);
			mf5.bpage1.setEnabled(false);
			this.mf14.setVisible(false);
		}
		else if(e.getActionCommand().equals("Book your appointment for dr.ABC"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf6 = new MyFramePatient3("APPOINTMENT");
			this.mf6.setVisible(true);
			mf6.b1.setEnabled(false);
			this.mf5.setVisible(false);
		}
		else if(e.getActionCommand().equals("TOMORROW"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf7 = new MyFramePatient4("APPOINTMENT");
			this.mf7.setVisible(true);
			mf7.b2.setEnabled(false);
			this.mf6.setVisible(false);
		}
		else if(e.getActionCommand().equals("TODAY"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf6 = new MyFramePatient3("APPOINTMENT");
			this.mf6.setVisible(true);
			mf6.b1.setEnabled(false);
			this.mf7.setVisible(false);
		}
		else if(e.getActionCommand().equals("Book your appointment for dr.XYZ"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf8 = new MyFramePatient5("APPOINTMENT");
			this.mf8.setVisible(true);
			mf8.b1.setEnabled(false);
			this.mf5.setVisible(false);
		}
		else if(e.getActionCommand().equals("Tomorrow"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf9 = new MyFramePatient6("APPOINTMENT");
			this.mf9.setVisible(true);
			mf9.b2.setEnabled(false);
			this.mf8.setVisible(false);
		}
		else if(e.getActionCommand().equals("Today"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf8 = new MyFramePatient5("APPOINTMENT");
			this.mf8.setVisible(true);
			mf8.b1.setEnabled(false);
			this.mf9.setVisible(false);
		}
		else if(e.getActionCommand().equals("Book your appointment for dr.EFG"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf10 = new MyFramePatient7("APPOINTMENT");
			this.mf10.setVisible(true);
			mf10.b1.setEnabled(false);
			this.mf5.setVisible(false);
		}
		else if(e.getActionCommand().equals("tomorrow"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf11 = new MyFramePatient8("APPOINTMENT");
			this.mf11.setVisible(true);
			mf11.b2.setEnabled(false);
			this.mf10.setVisible(false);
		}
		else if(e.getActionCommand().equals("today"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf10 = new MyFramePatient7("APPOINTMENT");
			this.mf10.setVisible(true);
			mf10.b1.setEnabled(false);
			this.mf11.setVisible(false);
		}
		else if(e.getActionCommand().equals("Book your appointment for dr.RST"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf12 = new MyFramePatient9("APPOINTMENT");
			this.mf12.setVisible(true);
			mf12.b1.setEnabled(false);
			this.mf5.setVisible(false);
		}
		else if(e.getActionCommand().equals("-Tomorrow-"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf13 = new MyFramePatient10("APPOINTMENT");
			this.mf13.setVisible(true);
			mf13.b2.setEnabled(false);
			this.mf12.setVisible(false);
		}
		else if(e.getActionCommand().equals("-Today-"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf12 = new MyFramePatient9("APPOINTMENT");
			this.mf12.setVisible(true);
			mf12.b1.setEnabled(false);
			this.mf13.setVisible(false);
		}
		else if(e.getActionCommand().equals("Book your appointment for dr.abc"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf15 = new MyFramePatient12("APPOINTMENT");
			this.mf15.setVisible(true);
			mf15.b1.setEnabled(false);
			this.mf14.setVisible(false);
		}
		else if(e.getActionCommand().equals("-TOMORROW-"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf16 = new MyFramePatient13("APPOINTMENT");
			this.mf16.setVisible(true);
			mf16.b2.setEnabled(false);
			this.mf15.setVisible(false);
		}
		else if(e.getActionCommand().equals("-TODAY-"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf15 = new MyFramePatient12("APPOINTMENT");
			this.mf15.setVisible(true);
			mf15.b1.setEnabled(false);
			this.mf16.setVisible(false);
		}
		else if(e.getActionCommand().equals("Book your appointment for dr.bcd"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf17 = new MyFramePatient14("APPOINTMENT");
			this.mf17.setVisible(true);
			mf17.b1.setEnabled(false);
			this.mf14.setVisible(false);
		}
		else if(e.getActionCommand().equals("-tomorrow-"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf18 = new MyFramePatient15("APPOINTMENT");
			this.mf18.setVisible(true);
			mf18.b2.setEnabled(false);
			this.mf17.setVisible(false);
		}
		else if(e.getActionCommand().equals("-today-"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf17 = new MyFramePatient14("APPOINTMENT");
			this.mf17.setVisible(true);
			mf17.b1.setEnabled(false);
			this.mf18.setVisible(false);
		}
		else if(e.getActionCommand().equals("Book your appointment for dr.cde"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf19 = new MyFramePatient16("APPOINTMENT");
			this.mf19.setVisible(true);
			mf19.b1.setEnabled(false);
			this.mf14.setVisible(false);
		}
		else if(e.getActionCommand().equals("--TOMORROW--"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf20 = new MyFramePatient17("APPOINTMENT");
			this.mf20.setVisible(true);
			mf20.b2.setEnabled(false);
			this.mf19.setVisible(false);
		}
		else if(e.getActionCommand().equals("--TODAY--"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf19 = new MyFramePatient16("APPOINTMENT");
			this.mf19.setVisible(true);
			mf19.b1.setEnabled(false);
			this.mf20.setVisible(false);
		}
		
		else if(e.getActionCommand().equals("Confirm booking"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
		    mf21 = new MyFramePatient18("Confirm Booking");
			this.mf21.setVisible(true);
			}  
		else if(e.getActionCommand().equals("See List of Patient"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
		    mfd2 = new MyFrameDoctor2("PATIENT LIST"); 
			this.mfd2.setVisible(true);
			this.mfd1.setVisible(false);
				try
				{
					FileReader fr = new FileReader("Patient_data.txt");
					BufferedReader br = new BufferedReader(fr);  
					ArrayList<String> records = new ArrayList<String>();

					String line;
					while((line = br.readLine()) != null)
					{
					   records.add(line);
					}

					//Goes through each line in arraylist and removes empty lines
					for(int j = 0; j < records.size(); j++)
					{
					   if(records.get(j).trim().length() == 0)
					   {
						 records.remove(j);
					   }
					}
					//Splits each record after a comma and stores each piece in separate indexes
					for(int i = 0; i < records.size(); i++)
					{
					   String[] array = records.get(i).split(",");
					   String patient1 = array[0].trim();
					   /*String patient2 = array[1].trim();
					   String patient3 = array[2].trim();
					   String patient4 = array[3].trim();*/

					   //Display each record piece in its designated textfield
					   this.mfd2.t1.setText(patient1); //temporary
					  /* this.mfd2.t2.setText(patient2); //temporary
					   this.mfd2.t3.setText(patient3); //temporary
					   this.mfd2.t4.setText(patient4); //temporary*/
					   System.out.println(patient1);
					  // System.out.println(patient2);
					  // System.out.println(patient3);
					  // System.out.println(patient4);
					}
				 }
				 catch (IOException ioe)
				 {
					System.out.println("Something went wrong");//temporary
				 } 
		}
		else if(e.getActionCommand().equals("cancellation of appointment"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
		    mfd3 = new MyFrameDoctor3("PATIENT LIST");
			this.mfd3.setVisible(true);
			this.mfd1.setVisible(false);
			try
				{
					FileReader fr1 = new FileReader("Patient_data.txt");
					BufferedReader br1 = new BufferedReader(fr1);  
					ArrayList<String> records1 = new ArrayList<String>();

					String line1;
					while((line1 = br1.readLine()) != null)
					{
					   records1.add(line1);
					}

					//Goes through each line in arraylist and removes empty lines
					for(int j1 = 0; j1 < records1.size(); j1++)
					{
					   if(records1.get(j1).trim().length() == 0)
					   {
						 records1.remove(j1);
					   }
					}
					//Splits each record after a comma and stores each piece in separate indexes
					for(int i1 = 0; i1 < records1.size(); i1++)
					{
					   String[] array1 = records1.get(i1).split(",");
					   String patient11 = array1[0].trim();
					   //String patient12 = array1[1].trim();
					  // String patient13 = array1[2].trim();
					  // String patient14 = array1[3].trim();

					   //Display each record piece in its designated textfield
					   this.mfd3.t1.setText(patient11); //temporary
					  // this.mfd3.t2.setText(patient12); //temporary
					  // this.mfd3.t3.setText(patient13); //temporary
					  // this.mfd3.t4.setText(patient14); //temporary
					   System.out.println(patient11);
					  // System.out.println(patient12);
					  // System.out.println(patient13);
					   //System.out.println(patient14);
					}
				 }
				 catch (IOException ioe)
				 {
					System.out.println("Something went wrong");//temporary
				 } 
		}
		else if(e.getActionCommand().equals("See List of Patients"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mfa2 = new MyFrameAdmin2("PATIENT LIST");
			this.mfa2.setVisible(true);
			this.mfa1.setVisible(false);
			try
				{
					FileReader fr2 = new FileReader("Patient_data.txt");
					BufferedReader br2 = new BufferedReader(fr2);  
					ArrayList<String> records2 = new ArrayList<String>();

					String line2;
					while((line2 = br2.readLine()) != null)
					{
					   records2.add(line2);
					}

					//Goes through each line in arraylist and removes empty lines
					for(int j2 = 0; j2 < records2.size(); j2++)
					{
					   if(records2.get(j2).trim().length() == 0)
					   {
						 records2.remove(j2);
					   }
					}
					//Splits each record after a comma and stores each piece in separate indexes
					for(int i2 = 0; i2 < records2.size(); i2++)
					{
					   String[] array2 = records2.get(i2).split(",");
					   String patient21 = array2[0].trim();
					   //String patient22 = array2[1].trim();
					  // String patient23 = array2[2].trim();
					  // String patient24 = array2[3].trim();

					   //Display each record piece in its designated textfield
					   this.mfa2.t1.setText(patient21); //temporary
					  // this.mfa2.t2.setText(patient22); //temporary
					  //this.mfa2.t3.setText(patient23); //temporary
					  // this.mfa2.t4.setText(patient24); //temporary
					 /*  System.out.println(patient21);
					   System.out.println(patient22);
					   System.out.println(patient23);
					   System.out.println(patient24);*/
					}
				 }
				 catch (IOException ioe)
				 {
					System.out.println("Something went wrong");//temporary
				 } 
		}
		else if(e.getActionCommand().equals("12:00"))
		{
		   System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf6.bt1.setEnabled(false);
		   this.mf6.bt2.setEnabled(false);
		   this.mf6.bt3.setEnabled(false);
		   this.mf6.bt4.setEnabled(false);
		   this.mf6.bt5.setEnabled(false);
		   this.mf6.bt6.setEnabled(false);
		   this.mf6.bt7.setEnabled(false);
		   this.mf6.bt8.setEnabled(false);
		   this.mf6.bt9.setEnabled(false);
		  
		}
		else if(e.getActionCommand().equals("1:00"))
		{
		System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf6.bt1.setEnabled(false);
		   this.mf6.bt2.setEnabled(false);
		   this.mf6.bt3.setEnabled(false);
		   this.mf6.bt4.setEnabled(false);
		   this.mf6.bt5.setEnabled(false);
		   this.mf6.bt6.setEnabled(false);
		   this.mf6.bt7.setEnabled(false);
		   this.mf6.bt8.setEnabled(false);
		   this.mf6.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals("2:00"))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		    this.mf6.bt1.setEnabled(false);
		   this.mf6.bt2.setEnabled(false);
		   this.mf6.bt3.setEnabled(false);
		   this.mf6.bt4.setEnabled(false);
		   this.mf6.bt5.setEnabled(false);
		   this.mf6.bt6.setEnabled(false);
		   this.mf6.bt7.setEnabled(false);
		   this.mf6.bt8.setEnabled(false);
		   this.mf6.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals("3:00"))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf6.bt1.setEnabled(false);
		   this.mf6.bt2.setEnabled(false);
		   this.mf6.bt3.setEnabled(false);
		   this.mf6.bt4.setEnabled(false);
		   this.mf6.bt5.setEnabled(false);
		   this.mf6.bt6.setEnabled(false);
		   this.mf6.bt7.setEnabled(false);
		   this.mf6.bt8.setEnabled(false);
		   this.mf6.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals("4:00"))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf6.bt1.setEnabled(false);
		   this.mf6.bt2.setEnabled(false);
		   this.mf6.bt3.setEnabled(false);
		   this.mf6.bt4.setEnabled(false);
		   this.mf6.bt5.setEnabled(false);
		   this.mf6.bt6.setEnabled(false);
		   this.mf6.bt7.setEnabled(false);
		   this.mf6.bt8.setEnabled(false);
		   this.mf6.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals("5:00"))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf6.bt1.setEnabled(false);
		   this.mf6.bt2.setEnabled(false);
		   this.mf6.bt3.setEnabled(false);
		   this.mf6.bt4.setEnabled(false);
		   this.mf6.bt5.setEnabled(false);
		   this.mf6.bt6.setEnabled(false);
		   this.mf6.bt7.setEnabled(false);
		   this.mf6.bt8.setEnabled(false);
		   this.mf6.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals("6:00"))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf6.bt1.setEnabled(false);
		   this.mf6.bt2.setEnabled(false);
		   this.mf6.bt3.setEnabled(false);
		   this.mf6.bt4.setEnabled(false);
		   this.mf6.bt5.setEnabled(false);
		   this.mf6.bt6.setEnabled(false);
		   this.mf6.bt7.setEnabled(false);
		   this.mf6.bt8.setEnabled(false);
		   this.mf6.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals("7:00"))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf6.bt1.setEnabled(false);
		   this.mf6.bt2.setEnabled(false);
		   this.mf6.bt3.setEnabled(false);
		   this.mf6.bt4.setEnabled(false);
		   this.mf6.bt5.setEnabled(false);
		   this.mf6.bt6.setEnabled(false);
		   this.mf6.bt7.setEnabled(false);
		   this.mf6.bt8.setEnabled(false);
		   this.mf6.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals("8:00"))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf6.bt1.setEnabled(false);
		   this.mf6.bt2.setEnabled(false);
		   this.mf6.bt3.setEnabled(false);
		   this.mf6.bt4.setEnabled(false);
		   this.mf6.bt5.setEnabled(false);
		   this.mf6.bt6.setEnabled(false);
		   this.mf6.bt7.setEnabled(false);
		   this.mf6.bt8.setEnabled(false);
		   this.mf6.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals(" 12:00 "))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf7.bt1.setEnabled(false);
		   this.mf7.bt2.setEnabled(false);
		   this.mf7.bt3.setEnabled(false);
		   this.mf7.bt4.setEnabled(false);
		   this.mf7.bt5.setEnabled(false);
		   this.mf7.bt6.setEnabled(false);
		   this.mf7.bt7.setEnabled(false);
		   this.mf7.bt8.setEnabled(false);
		   this.mf7.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals(" 1:00 "))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf7.bt1.setEnabled(false);
		   this.mf7.bt2.setEnabled(false);
		   this.mf7.bt3.setEnabled(false);
		   this.mf7.bt4.setEnabled(false);
		   this.mf7.bt5.setEnabled(false);
		   this.mf7.bt6.setEnabled(false);
		   this.mf7.bt7.setEnabled(false);
		   this.mf7.bt8.setEnabled(false);
		   this.mf7.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals(" 2:00 "))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf7.bt1.setEnabled(false);
		   this.mf7.bt2.setEnabled(false);
		   this.mf7.bt3.setEnabled(false);
		   this.mf7.bt4.setEnabled(false);
		   this.mf7.bt5.setEnabled(false);
		   this.mf7.bt6.setEnabled(false);
		   this.mf7.bt7.setEnabled(false);
		   this.mf7.bt8.setEnabled(false);
		   this.mf7.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals(" 3:00 "))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf7.bt1.setEnabled(false);
		   this.mf7.bt2.setEnabled(false);
		   this.mf7.bt3.setEnabled(false);
		   this.mf7.bt4.setEnabled(false);
		   this.mf7.bt5.setEnabled(false);
		   this.mf7.bt6.setEnabled(false);
		   this.mf7.bt7.setEnabled(false);
		   this.mf7.bt8.setEnabled(false);
		   this.mf7.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals(" 4:00 "))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf7.bt1.setEnabled(false);
		   this.mf7.bt2.setEnabled(false);
		   this.mf7.bt3.setEnabled(false);
		   this.mf7.bt4.setEnabled(false);
		   this.mf7.bt5.setEnabled(false);
		   this.mf7.bt6.setEnabled(false);
		   this.mf7.bt7.setEnabled(false);
		   this.mf7.bt8.setEnabled(false);
		   this.mf7.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals(" 5:00 "))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf7.bt1.setEnabled(false);
		   this.mf7.bt2.setEnabled(false);
		   this.mf7.bt3.setEnabled(false);
		   this.mf7.bt4.setEnabled(false);
		   this.mf7.bt5.setEnabled(false);
		   this.mf7.bt6.setEnabled(false);
		   this.mf7.bt7.setEnabled(false);
		   this.mf7.bt8.setEnabled(false);
		   this.mf7.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals(" 6:00 "))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf7.bt1.setEnabled(false);
		   this.mf7.bt2.setEnabled(false);
		   this.mf7.bt3.setEnabled(false);
		   this.mf7.bt4.setEnabled(false);
		   this.mf7.bt5.setEnabled(false);
		   this.mf7.bt6.setEnabled(false);
		   this.mf7.bt7.setEnabled(false);
		   this.mf7.bt8.setEnabled(false);
		   this.mf7.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals(" 7:00 "))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf7.bt1.setEnabled(false);
		   this.mf7.bt2.setEnabled(false);
		   this.mf7.bt3.setEnabled(false);
		   this.mf7.bt4.setEnabled(false);
		   this.mf7.bt5.setEnabled(false);
		   this.mf7.bt6.setEnabled(false);
		   this.mf7.bt7.setEnabled(false);
		   this.mf7.bt8.setEnabled(false);
		   this.mf7.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals(" 8:00 "))
		{
			System.out.println("Your "+e.getActionCommand() + "pm Appointment has been booked");
		   this.mf7.bt1.setEnabled(false);
		   this.mf7.bt2.setEnabled(false);
		   this.mf7.bt3.setEnabled(false);
		   this.mf7.bt4.setEnabled(false);
		   this.mf7.bt5.setEnabled(false);
		   this.mf7.bt6.setEnabled(false);
		   this.mf7.bt7.setEnabled(false);
		   this.mf7.bt8.setEnabled(false);
		   this.mf7.bt9.setEnabled(false);
		}
		else if(e.getActionCommand().equals("Previous"))
		{
			System.out.println(e.getActionCommand() + " is SELECTED");
			mf5 = new MyFramePatient2("APPOINTMENT");
			this.mf5.setVisible(true);
			mf5.bpage1.setEnabled(false);
			this.mf14.setVisible(false);
		}
	}
} 