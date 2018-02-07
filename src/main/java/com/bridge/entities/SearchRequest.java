package com.bridge.entities;

import com.bridge.dto.threquests.ThRequestHeader;

public class SearchRequest<T> {
    private ThRequestHeader header;
    private T body;

    public SearchRequest(ThRequestHeader header, T body) {
        this.header = header;
        this.body = body;
    }

    public ThRequestHeader getHeader() {
        return header;
    }

    public void setHeader(ThRequestHeader header) {
        this.header = header;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
