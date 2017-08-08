package com.woowa.searchRange;

import com.woowa.model.SearchRange;

/**
 * Created by woowabrothers on 2017. 8. 8..
 */
public class RangeCalculator {

    SearchRange searchRange;
    double latitudeRange;
    double longitudeRange;

    public RangeCalculator(double latitudeRange, double longitudeRange) {
        this.latitudeRange = latitudeRange;
        this.longitudeRange = longitudeRange;
    }

    public SearchRange getSearchRange(Float[] latlon) {
        String rightLatitude = String.valueOf(latlon[0] + latitudeRange);
        String leftLatitude = String.valueOf(latlon[0] - latitudeRange);
        String topLongitude = String.valueOf(latlon[1] + longitudeRange);
        String lowLongitude = String.valueOf(latlon[1] - longitudeRange);

        searchRange = new SearchRange(rightLatitude, leftLatitude, topLongitude, lowLongitude);

        return searchRange;
    }
}
