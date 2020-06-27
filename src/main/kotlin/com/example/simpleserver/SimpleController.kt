package com.example.simpleserver

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
    @RequestMapping("")
    fun getInfo():String{
        return "info"
    }
    @RequestMapping("next")
    fun getNextPage():String{
        return "nextPage"
    }
    @RequestMapping("linearEquation")
    fun getEquationValue(@RequestParam("x") x:Double):Double{
        //y=10*x+2
        return 10*x+2;
    }
}