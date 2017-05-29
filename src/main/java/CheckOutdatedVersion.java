package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.java.model.ServerDetails;
import main.java.model.SoftwareVersion;

public class CheckOutdatedVersion {

	
	
	public static void main(String args[]) {
	
	try {
		
		String line;
		File file = new File("server.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		SoftwareVersion softwareVersion = new SoftwareVersion();
		List<ServerDetails> detailslist;
		Map<String,List<ServerDetails>> map = new HashMap<String,List<ServerDetails>>();
		
		ServerDetails details;
		bufferedReader.readLine();
				    	
				while ((line = bufferedReader.readLine()) != null) {
				  // process the line.
					details = new ServerDetails();
					 String [] seperatelinebycomma = line.split(",");
					 
					 details.setServerName(seperatelinebycomma[0]);
					 details.setSoftwareType(seperatelinebycomma[1]);
					 details.setSoftwareName(seperatelinebycomma[2]);
					 details.setSoftwareVersion(seperatelinebycomma[3]);
					
				if(!map.keySet().contains(details.getSoftwareName())){
					 detailslist = new ArrayList<>();
					 detailslist.add(details);
					 map.put(details.getSoftwareName(), detailslist);
				}else{
					detailslist = map.get(details.getSoftwareName());
					detailslist.add(details);
					map.put(details.getSoftwareName(), detailslist);
				}
				
									 
				
	}
				
			for(String key : map.keySet()){
			
				List list1 = new ArrayList();
				list1=map.get(key);
				
				ServerDetails   s1 =(ServerDetails) list1.get(0);
				ServerDetails   s2 = (ServerDetails) list1.get(1);
				ServerDetails   s3 = new ServerDetails();
				
				 
				
				//System.out.println("s1 : "+ s1 +" s2 :"+ s2 );
		
				
				if(s1.getSoftwareVersion().getMajorVersion()>s2.getSoftwareVersion().getMajorVersion()){
					System.out.println(s2);
				}
				if(s1.getSoftwareVersion().getMajorVersion()<s2.getSoftwareVersion().getMajorVersion()){
					System.out.println(s1);
				}
				
				if(s1.getSoftwareVersion().getMajorVersion()==s2.getSoftwareVersion().getMajorVersion()){
					if(s1.getSoftwareVersion().getMinorVersion()==s2.getSoftwareVersion().getMinorVersion()){
						 s3=(s1.getSoftwareVersion().getPatchVersion()>s2.getSoftwareVersion().getPatchVersion()) ?s2 :s1;
							System.out.println(s3);
					}
				}
				if(s1.getSoftwareVersion().getMajorVersion()==s2.getSoftwareVersion().getMajorVersion()){
				if(s1.getSoftwareVersion().getMinorVersion()>s2.getSoftwareVersion().getMinorVersion()){
					System.out.println(s2);
				}
				}
				
				
				if(s1.getSoftwareVersion().getMajorVersion()==s2.getSoftwareVersion().getMajorVersion()){
					if(s1.getSoftwareVersion().getMinorVersion()<s2.getSoftwareVersion().getMinorVersion()){
						System.out.println(s1);
					}
					}
					
			}
			
			

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}
	
}
	

