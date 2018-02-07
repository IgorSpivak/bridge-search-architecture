package com.bridge.ws;

import com.bridge.dto.threquests.ThRequestByDestBody;
import com.bridge.dto.threquests.ThRequestByIdBody;
import com.bridge.dto.threquests.ThRequestHeader;
import com.bridge.dto.thresponses.ThSearchResponse;
import com.bridge.services.SearchHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchController {

    @Autowired
    private SearchHandler searchHandler;

    @RequestMapping(value  = "/searchById", method = RequestMethod.POST)
    public ResponseEntity<ThSearchResponse> searchById(@RequestBody ThRequestByIdBody request){
        ThRequestHeader header = new ThRequestHeader("ByIdHeader");
        ThSearchResponse result = searchHandler.doWork(header,request);
        return new ResponseEntity<ThSearchResponse>(result, HttpStatus.OK);
    }

    @RequestMapping(value  = "/searchByDest", method = RequestMethod.POST)
    public ResponseEntity<ThSearchResponse> searchByDest(@RequestBody ThRequestByDestBody request){
        ThRequestHeader header = new ThRequestHeader("ByDestHeader");
        ThSearchResponse result = searchHandler.doWork(header,request);
        return new ResponseEntity<ThSearchResponse>(result, HttpStatus.OK);
    }
}
