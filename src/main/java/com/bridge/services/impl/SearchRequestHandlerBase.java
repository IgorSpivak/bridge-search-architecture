package com.bridge.services.impl;

import com.bridge.entities.hbgresponses.HBGResponse;
import com.bridge.dto.thresponses.ThArrayOfHotels;
import com.bridge.dto.thresponses.ThBodyInfo;
import com.bridge.dto.thresponses.ThSearchResponse;
import com.bridge.entities.SearchContext;
import com.bridge.entities.SearchRequest;
import com.bridge.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class SearchRequestHandlerBase<T> implements SearchRequestHandler<T> {

    @Autowired
    private APIKeyResolver APIKeyResolver;

    @Autowired
    private BodyInfoBuilder bodyInfoBuilder;

    @Autowired
    private HBGApiHandler HBGApiHandler;

    @Autowired
    private THResultBuilder THResultBuilder;

    @Override
    public ThSearchResponse doWork(SearchRequest<T> request) {

        //resolving api key
        String apiKey = APIKeyResolver.resolve(request.getHeader());

        //creating body info
        ThBodyInfo bodyInfo = bodyInfoBuilder.resolve(request.getHeader());

        //creating HBG request
        SearchContext searchContext = createHBGRequest(request.getBody(),apiKey); //because of generics failing autowiring, use work around to handle in concrete class!

        //receiving hbg response
        HBGResponse HBGResponse = HBGApiHandler.doWork(searchContext.getHbgRequest());

        //creating th response
        ThArrayOfHotels ThArrayOfHotels = THResultBuilder.create(HBGResponse,searchContext.getMappingContext());

        //creatring final result
        ThSearchResponse result = new ThSearchResponse(bodyInfo,ThArrayOfHotels);

        return result;
    }


    protected abstract SearchContext createHBGRequest(T requestBody, String apiKey);

}
