package com.abhishek.controller;

import com.abhishek.model.exception.KeyNotFoundException;
import com.abhishek.model.request.GetRequest;
import com.abhishek.model.request.PostRequest;
import com.abhishek.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @Autowired
    CacheService cacheService;
    @GetMapping("/cache")
    String get(@RequestParam GetRequest request){
        try {
            return cacheService.getValue(request);
        } catch (KeyNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/cache")
    void get(@RequestParam PostRequest request){
         cacheService.putValue(request);
    }
}
