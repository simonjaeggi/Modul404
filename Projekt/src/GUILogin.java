import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class GUILogin extends JFrame implements ActionListener {
	private JButton bWeiter, bHier;
	private JTextField txtFreitext, txtusername, txtpassword;
	private JLabel lusername, lpassword, lnochkeinlogin, ltitle;
	Login L = new Login(); //instance of Login class

//This part of my app is the gui part of loging yourself in
		public GUILogin(){//gui part
                //Frame style
				this.setSize(1000, 750);
				this.setLocation(250, 200);
				this.setLayout(null);
				this.setDefaultCloseOperation(EXIT_ON_CLOSE); //closes the window when "x"-Button is pressed

				//buttons
				bWeiter = new JButton("Weiter");
				bWeiter.setBounds(410, 380, 130, 30);

				bHier = new JButton("here");
				bHier.setBounds(490, 420, 60, 30);



				lusername = new JLabel("Username:");
				lusername.setBounds(400, 220, 150, 30);

				lpassword = new JLabel("Password:");
				lpassword.setBounds(400, 290, 150, 30);

				lnochkeinlogin = new JLabel("No login? Press ");
				lnochkeinlogin.setBounds(390, 420, 180, 30);

				ltitle = new JLabel("Windous");
				ltitle.setBounds(320, 20, 600, 200);
				ltitle.setFont(new Font("Arial", Font.BOLD, 80));
				ltitle.setForeground(Color.blue);

				txtFreitext = new JTextField("");
				txtFreitext.setBounds(170, 10, 800, 30);
				txtFreitext.setFont(new Font("Courier new", Font.BOLD, 24));
				txtFreitext.setForeground(Color.green);
				txtFreitext.setBackground(Color.black);

				txtusername = new JTextField("");
				txtusername.setBounds(400, 250, 150, 30);

				txtpassword = new JTextField("");
				txtpassword.setBounds(400, 320, 150, 30);


				this.add(txtpassword);
				this.add(txtusername);
				this.add(bWeiter);
				this.add(bHier);
				this.add(lusername);
				this.add(lpassword);
				this.add(lnochkeinlogin);
				this.add(ltitle);
				this.setVisible(true);

				bHier.addActionListener(this);
				bWeiter.addActionListener(this);
			}

			public void actionPerformed(ActionEvent event) {//action listener for the buttons and so on

				if (event.getSource() == bHier) {

					GUINewAcc GL = new GUINewAcc();
				}
				if (event.getSource() == bWeiter) {

					try {
						L.UserCheck(txtusername.getText(),txtpassword.getText());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}



				}
			}



	}
