package com.alejandrorizzuto.cv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cvController {

    @RequestMapping(method= RequestMethod.GET, value={"/","/index"})
    public String welcome(){
        return "Bienvenido";
    }

    @RequestMapping(method = RequestMethod.GET, value="/contact")
    public String contactInfo(){
        return "Return contact info";
    }
}
