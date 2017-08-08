package com.woowa.model;

/**
 * Created by woowabrothers on 2017. 8. 8..
 */
public class SearchRange {
    private String leftLatitude;
    private String rightLatitude;
    private String topLongitude;
    private String lowLongitude;

    public SearchRange(String leftLatitude,
                       String rightLatitude,
                       String topLongitude,
                       String lowLongitude){
        this.leftLatitude = leftLatitude;
        this.rightLatitude = rightLatitude;
        this.topLongitude = topLongitude;
        this.lowLongitude = lowLongitude;
    }

    public String getLeftLatitude() { return leftLatitude; }

    public void setLeftLatitude(String leftLatitude) { this.leftLatitude = leftLatitude; }

    public String getRightLatitude() { return rightLatitude; }

    public void setRightLatitude(String rightLatitude) { this.rightLatitude = rightLatitude; }

    public String getTopLongitude() { return topLongitude; }

    public void setTopLongitude(String topLongitude) { this.topLongitude = topLongitude; }

    public String getLowLongitude() { return lowLongitude; }

    public void setLowLongitude(String lowLongitude) { this.lowLongitude = lowLongitude; }
}
