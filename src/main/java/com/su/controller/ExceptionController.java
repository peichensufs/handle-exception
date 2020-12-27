package com.su.controller;


import com.su.common.ResourceNotFoundException;
import com.su.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class ExceptionController {

    @GetMapping("/resourceNotFound")
    public void throwException() {
        Person p=new Person(1L,"SnailClimb");
        HashMap<String,Object> data = new HashMap<>();
        data.put("person id:",p.getId());
        throw new ResourceNotFoundException(data);
    }

}

