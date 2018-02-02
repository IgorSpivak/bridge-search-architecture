package com.bridge.services.impl;

import com.bridge.entities.threquests.ThRequestHeader;
import com.bridge.services.APIKeyResolver;
import org.springframework.stereotype.Service;

@Service
public class APIKeyResolverImpl implements APIKeyResolver {
    @Override
    public String create(ThRequestHeader header) {
        return header.getData() + " apiKey";
    }
}
