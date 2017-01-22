
// Project 7
// Oct 22, 2016

import java.net.*;
import java.io.*;
import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

class Proj07Runner {


	public Proj07Runner() {

  	}


	public String run(String str1, String str2, String str3){
		
		ArrayList <String> students = new <String> ArrayList();
		students.add(str1);
		students.add(str2);
		students.add(str3);
		students.add("PUT YOUR NAME HERE");

		JSONArray jsonArray = new JSONArray();
		jsonArray.add(students.get(0));
		jsonArray.add(students.get(1));
		jsonArray.add(students.get(2));
		jsonArray.add(students.get(3));

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("names",jsonArray);

		return jsonObject.toString();

	}


}

