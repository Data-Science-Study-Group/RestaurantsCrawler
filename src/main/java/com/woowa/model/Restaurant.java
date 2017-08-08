package com.woowa.model;

import org.json.JSONArray;

/**
 * Created by woowabrothers on 2017. 8. 4..
 */
public class Restaurant {

    private String restaurantsName;
    private String restaurantsTel;
    private String restaurantsImgUrl;
    private String restaurantsDescription;
    private String restaurantsRunningTime;
    private LocationInfo restaurantsLocationInfo;
    private SearchRange searchRange;

    public Restaurant(String restaurantsName,
                      String restaurantsTel) {
        this.restaurantsName = restaurantsName;
        this.restaurantsTel = restaurantsTel;
    }

    public String getRestaurantsName() {
        return restaurantsName;
    }

    public void setRestaurantsName(String restaurantsName) {
        this.restaurantsName = restaurantsName;
    }

    public String getRestaurantsTel() {
        return restaurantsTel;
    }

    public void setRestaurantsTel(String restaurantsTel) {
        this.restaurantsTel = restaurantsTel;
    }

    public String getRestaurantsImgUrl() {
        return restaurantsImgUrl;
    }

    public void setRestaurantsImgUrl(String restaurantsImgUrl) {
        this.restaurantsImgUrl = restaurantsImgUrl;
    }

    public String getRestaurantsDescription() {
        return restaurantsDescription;
    }

    public void setRestaurantsDescription(String restaurantsDescription) { this.restaurantsDescription = restaurantsDescription; }

    public String getRestaurantsRunningTime() {
        return restaurantsRunningTime;
    }

    public void setRestaurantsRunningTime(String restaurantsRunningTime) { this.restaurantsRunningTime = restaurantsRunningTime; }

    public LocationInfo getRestaurantsLocationInfo() { return restaurantsLocationInfo; }

    public void setRestaurantsLocationInfo(LocationInfo restaurantsLocationInfo) { this.restaurantsLocationInfo = restaurantsLocationInfo; }

    public SearchRange getSearchRange() { return searchRange; }

    public void setSearchRange(SearchRange searchRange) { this.searchRange = searchRange; }

    public String[] toStringArray() {
        String[] strings = new String[]{restaurantsName, restaurantsTel, restaurantsImgUrl, restaurantsDescription, restaurantsRunningTime};
        return strings;
    }
}
