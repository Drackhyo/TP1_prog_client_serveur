import java.io.*;
import java.net.*;

public class Server {

	public static void main(String args[]) throws Exception {
	    Server monSv = new Server ();
	    monSv.run();
	   }
	   public void run () throws Exception {
		   ServerSocket maSS =new ServerSocket(8080);//maSS va savoir s'il y a quelque chose dans le port passŽ en paramtre
		   Socket Saccepte =maSS.accept();//Saccepte va accepter la requette dispatchŽe dans le serveur
		   BufferedReader monBR= new BufferedReader(new InputStreamReader(Saccepte.getInputStream()));//monBF va lire le contenu de la requette ˆ travers InputStream
	   
		   String temp= monBR.readLine();//Affichage de l'information
		   System.out.println(temp);
		   
		   if(temp!= null)
		   {
		   PrintStream maSSPS = new PrintStream(Saccepte.getOutputStream());//Affichage de la reception de l'information
		   }
	   }
}
