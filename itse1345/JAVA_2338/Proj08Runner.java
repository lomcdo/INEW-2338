
// Project 8
// Oct 31, 2016

import java.net.*;
import java.io.*;
import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

class Proj08Runner {


	public Proj08Runner() {

  	}

	public JSONObject run(JSONObject inObject){
	

 		ArrayList arrayList = (ArrayList) ( (HashMap)inObject ).get("names") ;
		
    	JSONArray jsonArray = new JSONArray();
   		jsonArray.add(arrayList.get(0));
		jsonArray.add(arrayList.get(1));
		jsonArray.add(arrayList.get(2));
		jsonArray.add("PUT YOUR NAME HERE");

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("names",jsonArray);

		return jsonObject;

	}


}

