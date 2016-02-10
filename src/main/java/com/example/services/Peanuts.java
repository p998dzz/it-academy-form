package com.example.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by p998snc on 2016.02.10.
 */
@RestController
public class Peanuts {

    @RequestMapping("/peanuts")
    public String getNuts() {
        return "Hello world";
    }
}
