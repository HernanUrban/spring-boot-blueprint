package com.urban.api.controller;

import com.urban.api.service.BlueprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hurban on 11/05/17.
 */
@RestController
public class HelloController {

    @Autowired
    BlueprintService blueprintService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String getMessage(){
        blueprintService.dummyMethod();
        return "hello";
    }
}
