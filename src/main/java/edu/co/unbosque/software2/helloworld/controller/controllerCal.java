/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.unbosque.software2.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alejandro
 */
@Controller
public class controllerCal {

    @RequestMapping(value = "/calculo", method = RequestMethod.GET)
    public String index(@RequestParam("valA") int valA,@RequestParam("valB") int valB, ModelMap map) {
        int res = valA + valB;
        map.put("msg", res);
        return "index";
    }
    
}

 
