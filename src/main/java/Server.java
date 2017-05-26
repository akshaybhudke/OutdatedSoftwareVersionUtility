package com.main.calculator;

/**
 * Created by cts1 on 26/5/17.
 */
public class Server {

    private String serverName;
    private String softwareType;
    private String softwareName;
    private SoftwareVersion softwareVersion;


    public String getServerName() {
        return serverName;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public SoftwareVersion getSoftwareVersion() {
        return softwareVersion;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setSoftwareType(String softwareType) {
        this.softwareType = softwareType;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public void setSoftwareVersion(SoftwareVersion softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
