package com.xk.springcloudprovider.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping(value = "/person/{name}",method = RequestMethod.GET)
    public String findName(@PathVariable("name") String name){
        return name;
    }
}

