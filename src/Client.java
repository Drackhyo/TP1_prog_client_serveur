import java.io.*;
import java.net.*;

public class Client {

	public static void main(String args[]) throws Exception {
		  Client monCl =new Client();
		  monCl.run();
		   }
	public void run () throws Exception {
		   Socket maSkt =new Socket("172.0.0.1",8080);//Connexion au serveur local
		
	}
}
