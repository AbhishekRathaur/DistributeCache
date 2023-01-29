package com.abhishek.controller;

import com.abhishek.model.request.GetRequest;
import com.abhishek.model.request.PostRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @GetMapping("/cache")
    String get(@RequestParam GetRequest request){
//        try {
//            return cacheService.getValue(request);
//        } catch (KeyNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        return null;
    }

    @PostMapping("/cache")
    void get(@RequestParam PostRequest request){
//         cacheService.putValue(request);
    }
}
