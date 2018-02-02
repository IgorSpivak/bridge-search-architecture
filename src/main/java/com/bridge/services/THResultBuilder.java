package com.bridge.services;

import com.bridge.entities.hbgresponses.HBGResponse;
import com.bridge.entities.thresponses.ThArrayOfHotels;

public interface THResultBuilder {

    ThArrayOfHotels create(HBGResponse hbgResponse);
}
