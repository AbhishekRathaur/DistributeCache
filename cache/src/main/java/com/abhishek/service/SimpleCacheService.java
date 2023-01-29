package com.abhishek.service;

import com.abhishek.model.exception.KeyNotFoundException;
import com.abhishek.model.request.GetRequest;
import com.abhishek.model.request.PostRequest;

import java.util.HashMap;
import java.util.Map;

public class SimpleCacheService implements CacheService {
    Map<String, String> storage ;
    public SimpleCacheService(){
        this.storage = new HashMap<>();
    }
    @Override
    public String getValue(GetRequest request) throws KeyNotFoundException {
        if(storage.containsKey(request.getKey())){
            return storage.get(request.getKey());
        }
        else {
          throw new KeyNotFoundException();
        }
    }

    @Override
    public void putValue(PostRequest request) {
        storage.put(request.getKey(), request.getValue());
    }
}
