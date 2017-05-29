package main.java.model;

public class ServerDetails {

	private String serverName;
    private String softwareType;
    private String softwareName;
    private SoftwareVersion softwareVersion;
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getSoftwareType() {
		return softwareType;
	}
	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public SoftwareVersion getSoftwareVersion() {
		return softwareVersion;
	}
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = new SoftwareVersion().setSoftwareVersion(softwareVersion);
	}
	@Override
	public String toString() {
		return "ServerDetails [serverName=" + serverName + ", softwareType=" + softwareType + ", softwareName="
				+ softwareName + ", softwareVersion=" + softwareVersion + "]";
	}

	
	
	
}
