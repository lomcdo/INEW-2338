
// Project 6
// Oct 19, 2016

import java.net.*;
import java.io.*;
import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

class Proj06Runner {


	public Proj06Runner() {

  	}


	public HashMap run(String jsonStr){
		

		JSONObject jsonObject = (JSONObject)(JSONValue.parse(jsonStr));

		jsonObject.put("yourName", "PUT YOUR NAME HERE");

		return (HashMap)jsonObject;
	}


}

