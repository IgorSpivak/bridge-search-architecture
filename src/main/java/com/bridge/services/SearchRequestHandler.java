package com.bridge.services;

import com.bridge.dto.threquests.ThRequestHeader;
import com.bridge.dto.thresponses.ThSearchResponse;
import com.bridge.entities.SearchRequest;

public interface SearchRequestHandler<T> extends RequestHandler<SearchRequest<T>,ThSearchResponse> {

}
