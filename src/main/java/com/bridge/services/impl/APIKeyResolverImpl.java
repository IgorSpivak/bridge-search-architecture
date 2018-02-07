package com.bridge.services.impl;

import com.bridge.dto.threquests.ThRequestHeader;
import com.bridge.services.APIKeyResolver;
import org.springframework.stereotype.Service;

@Service
public class APIKeyResolverImpl implements APIKeyResolver {
    @Override
    public String resolve(ThRequestHeader header) {
        return header.getData() + " apiKey";
    }
}
