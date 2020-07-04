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
    fun getEquationValue(
            @RequestParam("a",defaultValue = "10") a:Double,
            @RequestParam("b",defaultValue = "2") b:Double,
            @RequestParam("x",defaultValue = "0") x:Double):Double{
        //y=10*x+2
        return a*x+b
    }
    @RequestMapping("add")
    fun add(x: Double, y: Double):Double{
        return x+y
    }
    @RequestMapping("squareEquation")
    fun getSquareEquationValue(
            @RequestParam("a",defaultValue = "10") a:Double,
            @RequestParam("b",defaultValue = "2") b:Double,
            @RequestParam("x",defaultValue = "0") x:Double):Double{
        //y=10*x+2
        return a*x+b
    }
    @RequestMapping("linearEquation1")
    fun getEquationData():IntArray{
        //y=10*x+2
        val data = intArrayOf(1,2,3,4,5,6,7,8,9,10)
        return data
    }
}
