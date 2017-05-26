package practice.asssignment.model;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import javax.sql.rowset.serial.SerialArray;

public class OutdatedVersions {

	static Set set = new HashSet();
	static List serversoftlist = new ArrayList<>();
	static List finalList = new ArrayList<>();

	public static void main(String args[]) {
			 Map< String, List> map = new LinkedHashMap();
	try {
		File file = new File("server.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		br.readLine();
		 String line;
		 Set setofvalues = new HashSet();
		 List<String> listofstringcontainvalues = new ArrayList<String>();
		 
	    try {
	    	
			while ((line = br.readLine()) != null) {
			  // process the line.
				setofvalues=  SetOfSoftName(line);
				listofstringcontainvalues.add(line);
			}
			
			
			 Iterator itr = setofvalues.iterator();
			    
			 while(itr.hasNext())
		        {
				 List<String> newlist = new ArrayList<>();
		        	String soft_name = (String) itr.next();
		        	
		            Iterator iterator =listofstringcontainvalues.iterator();
		             while(iterator.hasNext()){
		            	 
		            	 String serverdetails   = iterator.next().toString();
		            	 if(serverdetails.contains(soft_name))
		           // 		 newlist.add(serverdetails.substring(serverdetails.indexOf(',')));
		            		 newlist.add(serverdetails.substring(serverdetails.indexOf(',', serverdetails.indexOf(','))));
		             }
		             
		             Collections.sort(newlist);
		             map.put(soft_name, newlist);
		        }
		        
			 for (Map.Entry<String, List> entry : map.entrySet())
			 {
				 finalList.add( entry.getValue().get(0));
			     
			 }
			 
			
			 
			 Iterator iterate = listofstringcontainvalues.iterator();
			 
			 while (iterate.hasNext()){
				 
				 String checkelement = (String) iterate.next();
				 
				 Iterator iterator = finalList.iterator();
				 while (iterator.hasNext()){
				 
				 String checkfromfinallist = (String) iterator.next();
				 
				 if (checkelement.contains(checkfromfinallist)){
					 
					 System.out.println(checkelement);
				 }
				
				 }
				
			 } 
			 
			 
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
			
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}

}

	private static Set SetOfSoftName(String line) {
		// TODO Auto-generated method stub
		StringTokenizer stringTokenizer = null;
		stringTokenizer = new StringTokenizer(line, ",");
		String soft_Name = null;
		String server_Name = null;
		String soft_Type = null;
		String name_version = null;
		while (stringTokenizer.hasMoreTokens()) {
			server_Name = stringTokenizer.nextToken();
			soft_Type = stringTokenizer.nextToken();
			soft_Name = stringTokenizer.nextToken();
			name_version = stringTokenizer.nextToken();
		}

		set.add(soft_Name);

		return set;

	}

}
