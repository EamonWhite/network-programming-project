package ie.gmit.dip;

import java.net.*;
import java.io.*;


public class GuessServer {
	
	public static int Port = 5000;
	
	public static void main(String[] args) throws IOException {
		
		// NumberGuessingGame game = new NumberGuessingGame();
		
		
		ServerSocket theServer;
		Socket theSocket;
		PrintStream p;
		BufferedReader info;
		
		theServer = new ServerSocket(Port);
		
		try {
			while (true) {
				theSocket = theServer.accept();
				p = new PrintStream(theSocket.getOutputStream());
				info = new BufferedReader(new InputStreamReader(theSocket.getInputStream()));
				p.println("#### Number Guessing Game ####");
				theSocket.close();
			}
		}
		catch (IOException e) {
			theServer.close();
			System.err.println(e);
		}
	}
}
