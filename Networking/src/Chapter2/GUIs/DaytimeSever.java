/**
 *  Program makes use of the Date Package java.util -
 *   creates a date object that holds current day, date and time on server
 *   use localhost as server name 
 */


package Chapter2.GUIs;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class DaytimeSever 
{
	public static void main(String[] args)
	{
		ServerSocket server;
		final int DAYTIME_PORT = 13;
		Socket socket;
		try
		{
			server = new ServerSocket(DAYTIME_PORT);
			
			do
			{
				//wait for an object join
				socket = server.accept();
				PrintWriter output = new PrintWriter (socket.getOutputStream(), true);
				
				Date date = new Date();
				output.println(date);
				//Method toString executed in line above.
				
				socket.close();
				
			}while(true);
		}
		catch(IOException ioEx)
		{
			System.out.println(ioEx);
		}
		
		
	}
}
