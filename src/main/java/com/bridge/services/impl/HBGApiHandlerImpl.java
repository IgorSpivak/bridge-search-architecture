package com.bridge.services.impl;

import com.bridge.entities.hbgrequests.HBGRequest;
import com.bridge.entities.hbgresponses.HBGResponse;
import com.bridge.services.HBGApiHandler;
import org.springframework.stereotype.Service;

@Service
public class HBGApiHandlerImpl implements HBGApiHandler {

    @Override
    public HBGResponse doWork(HBGRequest request) {
        HBGResponse response = new HBGResponse(request.getData() + " after hbg response");
        return response;
    }
}
