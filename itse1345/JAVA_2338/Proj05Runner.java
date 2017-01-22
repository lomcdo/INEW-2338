
// Project 5
// Oct 12, 2016

import java.net.*;
import java.io.*;
import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

class Proj05Runner {


	public Proj05Runner() {

  	}


	public String run(String str, Integer int1, Integer int2){
		

		String result = "";

		JSONObject obj = new JSONObject();

		obj.put("name",  str);
		obj.put("age", new Integer(int1));
		obj.put("studentId", new Integer(int2));
		obj.put("yourName",  "PUT YOUR NAME HERE");

		result = obj.toString();

		return result;
	}


}

