package ie.gmit.dip;

import java.net.*;
import java.io.*;

public class GuessClient {
	
	public static void main(String[] args) {
		
		Socket theSocket;
		String hostname;
		BufferedReader info;
		
		if (args.length > 0) {
			hostname = args[0];
		}
		else {
			hostname = "localhost";
		}
		try {
			theSocket = new Socket(hostname, 5000);
			new PrintStream(theSocket.getOutputStream());
			info = new BufferedReader(new InputStreamReader(theSocket.getInputStream()));
			String words = info.readLine();
			System.out.println(words);
		}
		catch (UnknownHostException e) {
			System.err.println(e);
		}
		catch (IOException e) {
			System.err.println(e);
		}
	}
}
