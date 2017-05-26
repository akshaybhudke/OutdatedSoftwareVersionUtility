package com.main.calculator;

/**
 * Created by cts1 on 26/5/17.
 */
public class SoftwareVersion {
	
	private float majorVersion;
    private int minorVersion;

    public float getMajorVersion() {
        return majorVersion;
    }

    public float getMinorVersion() {
        return minorVersion;
    }

    public void setMajorMinorVersion(String softwareVersion){
    	
    	int lastIndexOfDelimeter = softwareVersion.lastIndexOf(".");

        majorVersion = Float.valueOf(softwareVersion.substring(0,lastIndexOfDelimeter));
        minorVersion = Integer.valueOf(softwareVersion.substring(lastIndexOfDelimeter+1));
        
        System.out.println("Major version: "+majorVersion+"  minor version: "+minorVersion);

    }
    
    public static void main(String [] args){
    	new SoftwareVersion().setMajorMinorVersion("1.6.10");
    	new SoftwareVersion().setMajorMinorVersion("14.1");
    }
}


