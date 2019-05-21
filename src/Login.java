import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//this part of my app does check is the login itself. It checks if the File (the User) exists and if the pw is correct.

public class Login{

	public void UserCheck(String username, String password) throws IOException{ //checks if user and pw are correct and if user does exist
		//Path to Users
		Path path = Paths.get("src/");

		//Instance of User-File
		File f = new File("src/Users/" + username + ".txt");




		if(!f.exists()){
			System.out.println("Error: No User with this Name found");



			//Checks if User exists and is not a directory
		}else if(f.exists() && !f.isDirectory()) {
			System.out.println("User found");

			//Gets correct PW and writes it to string linepw
			String linepw = Files.readAllLines(Paths.get("src\\Users\\" +username+".txt")).get(2);


				//checks if password is correct
				if (password.equals(linepw)){

					//"logs in" (new link to konstruktor of the GUIDesktop)
					GUIDesktop GD = new GUIDesktop();
					System.out.println("Succsessfully logged in");

					// if login failes
				}else if(!password.equals(linepw)) {
					System.out.println("Login failed, invalid password");
				}
				//if user doesn't exist

			}
		}
}
