import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
//this part of my app is the gui part of creating a new account
public class GUINewAcc extends JFrame implements ActionListener {
	private JButton bSave, bHier;
	private JTextField txtusername, txtpassword, txtFullname;
	private JLabel lusername, lpassword, lbereitseinlogin, ltitle, lFullname;
	NewAcc NA = new NewAcc(); //instance of NewAcc

	private Scanner sc = new Scanner(System.in);


		public GUINewAcc(){//gui part
			this.setSize(450, 600);
			this.setLocation(500, 320);
			this.setLayout(null);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE); //closes the window when "x"-Button is pressed

            //Button to save User
			bSave = new JButton("Save User");
			bSave.setBounds(140, 380, 130, 30);

            //Button to get back to the login
            bHier = new JButton("here");
			bHier.setBounds(280, 420, 60, 30);



            //labels
			lFullname = new JLabel("Full Name:");
			lFullname.setBounds(130, 150, 150, 30);

			lusername = new JLabel("Username:");
			lusername.setBounds(130, 220, 150, 30);

			lpassword = new JLabel("Password:");
			lpassword.setBounds(130, 290, 150, 30);

			lbereitseinlogin = new JLabel("Already have a login? Press ");
			lbereitseinlogin.setBounds(100, 420, 180, 30);

            //title
			ltitle = new JLabel("New User");
			ltitle.setBounds(40, 0, 600, 150);
			ltitle.setFont(new Font("Arial", Font.BOLD, 80));
			ltitle.setForeground(Color.blue);

            //textfields for username, pw and full name
			txtFullname = new JTextField("");
			txtFullname.setBounds(130, 180, 150, 30);

			txtusername = new JTextField("");
			txtusername.setBounds(130, 250, 150, 30);


			txtpassword = new JTextField("");
			txtpassword.setBounds(130, 320, 150, 30);

            //adds the buttons,labels and textfields to the frame
			this.add(txtpassword);
			this.add(txtusername);
			this.add(bSave);
			this.add(bHier);
			this.add(lusername);
			this.add(lpassword);
			this.add(lbereitseinlogin);
			this.add(ltitle);
			this.add(lFullname);
			this.add(txtFullname);
			this.setVisible(true);

            //adds an action listener to these buttons
			bHier.addActionListener(this);
			bSave.addActionListener(this);

		}

        //action listener
		public void actionPerformed(ActionEvent event) {//action listener for the buttons and so on

			if (event.getSource() == bHier) {
				dispose(); //closes the newacc window to get back to the login window

			}
			if (event.getSource() == bSave) {
			    //saves content of Textfields in strings
				String username = txtusername.getText();
				String FullName = txtFullname.getText();
				String password = txtpassword.getText();

				//checks if strings are empty
				if (password.equals("") || FullName.equals("") || username.equals("")){
					System.out.println("Error: TextTFilelds mustn't be empty");

				}else{
					//sends typed in content of textfields to the "newAcc" class into "saveAccounts"
					try {
						NA.SaveAccounts(txtusername.getText(),txtFullname.getText(),txtpassword.getText());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				dispose(); //closes window after sending input
				}


			}

		}


}

