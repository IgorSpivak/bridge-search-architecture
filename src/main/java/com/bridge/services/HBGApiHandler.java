package com.bridge.services;

import com.bridge.entities.hbgrequests.HBGRequest;
import com.bridge.entities.hbgresponses.HBGResponse;

public interface HBGApiHandler {
    HBGResponse getHBGResponse(HBGRequest request, String apiKey);
}
