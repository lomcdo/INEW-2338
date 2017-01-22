
// Project 1
// Sept 9, 2016

import java.net.*;

public class Proj01Runner
{

	public Proj01Runner() {
  	}

	public void run(){

		try{
			System.out.println("PUT YOUR NMAE HERE");
			System.out.println(
			  "Get and display IP address of ACC website by name");
			InetAddress[] addresses = 
					InetAddress.getAllByName("www.austincc.edu");
			for(int cnt=0; cnt<addresses.length;cnt++){
			System.out.println(addresses[cnt]);
			}//end for loop


			System.out.println("Get and display current IP address of LocalHost");
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);


			System.out.println("Get and display current name of LocalHost");
			System.out.println(address.getHostName());


			System.out.println("Get and display current IP address of LocalHost");
			System.out.println(address.getHostAddress().replace("."," "));

		 
		}catch(UnknownHostException e){
			e.printStackTrace();
		}//end catch
    
  }//end run()


}


OUTPUT

Lori M. Domingue
Get and display IP address of ACC website by name
www.austincc.edu/206.77.150.222
Get and display current IP address of LocalHost
janus-linux/127.0.1.1
Get and display current name of LocalHost
janus-linux
Get and display current IP address of LocalHost
127 0 1 1
