package practice.asssignment.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListOutdatedServers {

	static StringTokenizer stringTokenizer = null;
	static ArrayList<String> linelist = new ArrayList<String>();
	static Map<String, List> map = new HashMap<String, List >();
	static List listofvaluescontainsoft_name = new ArrayList<String>();
	
	public static void main(String args[]){		
	
			try {
				File file = new File("server.txt");
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			    String line;
			    try {
					while ((line = br.readLine()) != null) {
					  // process the line.
						String name = CreateMap(line);
						System.out.println(name);
						 listofvaluescontainsoft_name = CreateListOfStrings(line, name);
						 System.out.println(listofvaluescontainsoft_name);
						createMapWithlistofvalues(name, listofvaluescontainsoft_name);
						
						
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void createMapWithlistofvalues(String name, List listofvaluescontainsoft_name) {
		
		map.put(name, listofvaluescontainsoft_name);		
	}

	private static String  CreateMap(String text) {
		
		stringTokenizer = new StringTokenizer(text, "," );
		String soft_Name = null;
		while (stringTokenizer.hasMoreTokens()){
		String server_Name = stringTokenizer.nextToken();		
		String soft_Type = stringTokenizer.nextToken();		
		 soft_Name= stringTokenizer.nextToken();		
		String name_version = stringTokenizer.nextToken();
		
		}
		return soft_Name;
	
	}

	private static List CreateListOfStrings(String text, String name) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		if(text.contains(name)){
			list = new ArrayList<>();			
			list.add(text);			
		}
		return list;
		
		
	}
}
