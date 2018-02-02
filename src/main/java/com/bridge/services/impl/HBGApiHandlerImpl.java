package com.bridge.services.impl;

import com.bridge.entities.hbgrequests.HBGRequest;
import com.bridge.entities.hbgresponses.HBGResponse;
import com.bridge.services.HBGApiHandler;
import org.springframework.stereotype.Service;

@Service
public class HBGApiHandlerImpl implements HBGApiHandler {

    @Override
    public HBGResponse getHBGResponse(HBGRequest request, String apiKey) {
        HBGResponse response = new HBGResponse(request.getData() + " api key " + apiKey + " after hbg response");
        return response;
    }
}
