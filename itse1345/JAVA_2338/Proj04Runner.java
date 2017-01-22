
// Project 4
// Oct 7, 2016

import java.net.*;
import java.io.*;
import java.util.*;

class Proj04Runner {

  boolean closedFlag;
  SocketWrapper socketWrapper;
  //-----------------------------------------------------//
  


	public Proj04Runner() {
		System.out.println("PUT YOUR NAME HERE");
  	}


  
  void run(String server){
    //Get a socket, connected to the specified server on
    // port 80, the HTTP port.  Also get input and output
    // streams that can be used to communicate with the
    // server.
    socketWrapper = getSocket(server);

    socketWrapper.outputStream.println("GET / HTTP/1.1");

    socketWrapper.outputStream.println("Host: " + server);
    //Ask the server to close the connection following the
    // response.
    socketWrapper.outputStream.println(
                                      "Connection: close");
    //The following CRLF is required here.
    socketWrapper.outputStream.println();

    //Display fifteen lines of server response.  Get
    // information about closing of the connection in the
    // process.
    closedFlag = print(22,socketWrapper.inputStream);


  }//end run()
  //-----------------------------------------------------//
  
  //This class is used to wrap three objects used in
  // socket communications.
  class SocketWrapper{
    //This is a reference to the Socket object itself.
    Socket socket;
    //This is an eight-bit stream used to send commands to
    // the server.
    PrintStream outputStream;
    //This is a 16-bit stream used to receive the server
    // response lines.
    BufferedReader inputStream;
  }//end SocketWrapper
  //-----------------------------------------------------//
  
  //The purpose of this method is to get and display a
  // specified number of lines of the server response. In
  // the process, the method checks to determine if the
  // server closed the connection at the end of its
  // response. The method returns a boolean value
  // indicating whether or not the server closed the
  // connection.
  boolean print(int lineLimit,BufferedReader inputStream){
    int lineCnt = 0;
    String line = "dummy";
    boolean closedFlag = false;
    try{
      while(((line = inputStream.readLine()) != null) 
                               && (lineCnt++ < lineLimit)){
        System.out.println(lineCnt + ": " + line);

        if(line.contains("Connection: close")){
          //The server closed the connection at the end of
          // the response.
          closedFlag = true;
        }//end if
      }//end while
      if(lineCnt >= lineLimit){
        System.out.println(
                    "**Print terminated on line count.**");
      }//end if
    }catch(Exception e){
      e.printStackTrace();
    }//end catch
    
    return closedFlag;
    
  }//end local method named print
  //-----------------------------------------------------//
  
  //The purpose of this method is to get a new Socket
  // object connected to a server on port 80 along with
  // input and output stream objects that can be used to
  // communicate with the server.  References to the
  // Socket object and the two stream objects are
  // returned in a simple wrapper object of type 
  // SocketWrapper.
  SocketWrapper getSocket(String server){
    int port = 80;
    SocketWrapper socketWrapper = new SocketWrapper();
    try{
      //Get a socket, connected to the specified server
      // on the specified port.
      socketWrapper.socket = new Socket(server,port);
      
      //Get an input stream for reading the response sent
      // by the server.
      socketWrapper.inputStream = 
                  new BufferedReader(new InputStreamReader(
                   socketWrapper.socket.getInputStream()));

      //Get an 8-bit output stream to the socket that will
      // autoflush.  Note that a 16-bit Unicode output 
      // stream apparently won't work for the posted
      // content.
      socketWrapper.outputStream = new PrintStream(
              socketWrapper.socket.getOutputStream(),true);
    }catch(Exception e){
      e.printStackTrace();
    }//end catch
    
    return socketWrapper;
  }//end getSocket
  //-----------------------------------------------------//
}//end class Proj04Runner
//=======================================================//
