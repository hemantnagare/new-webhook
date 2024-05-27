package com.akshara.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AksharaSchoolController
{
    @GetMapping(path="/webhook/studentAdded/{name}")
    public @ResponseBody String studentAdded(@PathVariable String name)
    {
        System.out.println("Student Name==>"+name);
        return "webhook recieverd";
    }
}
