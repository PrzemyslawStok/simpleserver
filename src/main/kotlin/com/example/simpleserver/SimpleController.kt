package com.example.simpleserver

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Controller
class SimpleController {
    @RequestMapping("")
    @ResponseBody
    fun getInfo():String{
        return "info"
    }
}