import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//This part of my app is isn't important. Its just for representing or showing that my login itself did work

public class GUIDesktop extends JFrame implements ActionListener {
	private JLabel lsuccess;



	public GUIDesktop(){ //gui part
		this.setSize(1500, 1000);
		this.setLocation(250, 10);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);


		lsuccess = new JLabel("Successfully logged in!");
		lsuccess.setBounds(250, 20, 1000, 200);
		lsuccess.setFont(new Font("Arial", Font.BOLD, 80));
		lsuccess.setForeground(Color.blue);


		this.add(lsuccess);
		this.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent event) {//action listener for the buttons and so on



	}



}
