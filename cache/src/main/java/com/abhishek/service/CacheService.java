package com.abhishek.service;

import com.abhishek.model.exception.KeyNotFoundException;
import com.abhishek.model.request.GetRequest;
import com.abhishek.model.request.PostRequest;

public interface CacheService {

    public String getValue(GetRequest request) throws KeyNotFoundException;

    public void putValue(PostRequest request);
}
