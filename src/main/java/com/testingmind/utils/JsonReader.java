package com.testingmind.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonParser;

public class JsonReader {
	
	public static String getJsonObjectData(String filePath, String key) {	
		String value = null;
		JSONObject jObj = getJsonObjectData(new File(filePath));
		if(jObj != null) {
			value = (String)jObj.get(key);
		}
		return value;
		
	}
	
	private static JSONObject getJsonObjectData(File file) {
		JSONObject jsonObject = null;
		try {
			String inputJson = FileUtils.readFileToString(file, "utf-8");
			Object obj = new JSONParser().parse(inputJson);
			jsonObject = (JSONObject)obj;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObject;
	}
	
	public static JSONArray getJsonArray(File file, String key) {
		JSONArray jsonArray = null;
		try {
			JSONObject jsonObject = getJsonObjectData(file);
			jsonArray = (JSONArray)jsonObject.get(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray;
	}
	
	public static String getJsonArrayData(File file, String key, int index) {
		String jsonArrayData = null;
		try {
			JSONArray jsonArray = getJsonArray(file, key);
			jsonArrayData = (String)jsonArray.get(index);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArrayData;
	}

}
