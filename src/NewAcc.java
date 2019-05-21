import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

//this part of my app is responsible for saving the new User into a file
public class NewAcc {
	public void SaveAccounts(String username, String FullName, String password) throws Exception { //saves new Accounts


		Scanner sc = new Scanner(System.in);
        //Used path of the User-Files
		String path = "src/";
		//Users Folder
		String dirName = "Users";

        //Generates new Folder if it doesn't exist
		File dir = new File(path + dirName);
		dir.mkdir();
		
		//Generates new User-File
		File file = new File(path + dirName + username + ".txt");
		
		//Writes Username, Fullname and Password into User-File
		RandomAccessFile f = new RandomAccessFile(new File(path + dirName + "/" + username + ".txt"), "rw");
		f.seek(0); // to the beginning
		f.write(username.getBytes());
		f.write("\r\n".getBytes()); // New Line
		f.write(FullName.getBytes());
		f.write("\r\n".getBytes()); // New Line
		f.write(password.getBytes());
		f.close();


	}

}