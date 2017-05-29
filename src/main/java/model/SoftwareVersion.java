package main.java.model;

public class SoftwareVersion {
	
	private int majorVersion;
    private int minorVersion;
    private int patchVersion;
    
	public int getMajorVersion() {
		return majorVersion;
	}
	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}
	public int getMinorVersion() {
		return minorVersion;
	}
	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
	public int getPatchVersion() {
		return patchVersion;
	}
	public void setPatchVersion(int patchVersion) {
		this.patchVersion = patchVersion;
	}
	@Override
	public String toString() {
		return "SoftwareVersion [majorVersion=" + majorVersion + ", minorVersion=" + minorVersion + ", patchVersion="
				+ patchVersion + "]";
	}
	
	public SoftwareVersion setSoftwareVersion(String softVersion){
		
		 String [] arguments = softVersion.split("\\.");	
		 		if(arguments.length==3){					 
				 this.setMajorVersion(Integer.parseInt(arguments[0]));
				 this.setMinorVersion(Integer.parseInt(arguments[1]));
				 this.setPatchVersion(Integer.parseInt(arguments[2]));
				 }
			 	 if(arguments.length==2){
					 this.setMajorVersion(Integer.parseInt(arguments[0]));
					 this.setMinorVersion(Integer.parseInt(arguments[1]));
					 this.setPatchVersion(0);
				 }
				if(arguments.length==1){
					 this.setMajorVersion(Integer.parseInt(arguments[0]));
					 this.setMinorVersion(0);
					 this.setPatchVersion(0);
				 }
		return this;
	}
	
}
