package com.yash.reallifedemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetUrlContent {

	public static void main(String[] args) {
		URL url;
		try {
			url=new URL("https://www.quora.com/What-are-some-real-life-examples-of-multi-threading-as-we-study-in-Java");
			URLConnection urlConnection=url.openConnection();
			BufferedReader br=new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			System.out.println(br);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
