package com.bridge.dto.thresponses;

public class ThSearchResponse {

    private ThBodyInfo bodyInfo;
    private ThArrayOfHotels arrayOfHotels;

    public ThSearchResponse() {
    }

    public ThSearchResponse(ThBodyInfo bodyInfo, ThArrayOfHotels arrayOfHotels) {
        this.bodyInfo = bodyInfo;
        this.arrayOfHotels = arrayOfHotels;
    }

    public ThBodyInfo getBodyInfo() {
        return bodyInfo;
    }

    public void setBodyInfo(ThBodyInfo bodyInfo) {
        this.bodyInfo = bodyInfo;
    }

    public ThArrayOfHotels getArrayOfHotels() {
        return arrayOfHotels;
    }

    public void setArrayOfHotels(ThArrayOfHotels arrayOfHotels) {
        this.arrayOfHotels = arrayOfHotels;
    }
}
