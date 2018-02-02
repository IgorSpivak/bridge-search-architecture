package com.bridge.services.impl;

import com.bridge.entities.hbgrequests.HBGRequest;
import com.bridge.entities.hbgresponses.HBGResponse;
import com.bridge.entities.threquests.ThRequestHeader;
import com.bridge.entities.thresponses.ThArrayOfHotels;
import com.bridge.entities.thresponses.ThBodyInfo;
import com.bridge.entities.thresponses.ThSearchResponse;
import com.bridge.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class SearchRequestHandlerBase<T> implements SearchRequestHandler<T> {

    @Autowired
    private APIKeyResolver APIKeyResolver;

    @Autowired
    private BodyInfoBuilder bodyInfoBuilder;

    //@Autowired (can not be autowired!!!!! generics is not resolved! see work around below)
    //private HBGRequestCreator<T> HBGRequestCreator;

    @Autowired
    private HBGApiHandler HBGApiHandler;

    @Autowired
    private THResultBuilder THResultBuilder;


    @Override
    public ThSearchResponse create(ThRequestHeader requestHeader, T requestBody) {

        //resolving api key
        String apiKey = APIKeyResolver.create(requestHeader);

        //creating body info
        ThBodyInfo bodyInfo = bodyInfoBuilder.create(requestHeader);

        //creating HBG request
        //HBGRequest HBGRequest = HBGRequestCreator.create(requestBody);
        HBGRequest HBGRequest = createHBGRequest(requestBody); //because of generics failing autowiring, use work around to handle in concrete class!

        //receiving hbg response
        HBGResponse HBGResponse = HBGApiHandler.getHBGResponse(HBGRequest,apiKey);

        //creating th response
        ThArrayOfHotels ThArrayOfHotels = THResultBuilder.create(HBGResponse);

        //creatring final result
        ThSearchResponse result = new ThSearchResponse(bodyInfo,ThArrayOfHotels);

        return result;
    }


    protected abstract HBGRequest createHBGRequest(T requestBody);

}
