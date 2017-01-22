
// Project 2
// Sept 24, 2016

import java.net.*;
import java.io.*;

class  Proj02Runner{
    


	public Proj02Runner() {

  	}



	public void run(String myUrl){
		
		System.out.println("PUT YOUR NAME HERE");

		try{

			URL url = new URL(myUrl);
		
			BufferedReader htmlPage = new BufferedReader(new InputStreamReader(url.openStream()));


			int lineNum = 1;

			String dataLine;

			while((dataLine = htmlPage.readLine()) != null  && lineNum<11){

				System.out.println( lineNum + " " + dataLine );
				lineNum++;

			}//end while loop


		}
		catch(Exception e){
			System.out.println("Caught exception: " + e.toString());
		}

	} //end run()
	
              	
}
