package com.rboys.multi.controller;

import com.rboys.multi.api.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Raivo Lapins on 9/14/2023
 */
@RestController
public class Controller {

    private Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String message() {
        return service.serve("Raivo");
    }
}
