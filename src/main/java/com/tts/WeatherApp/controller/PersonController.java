package com.tts.WeatherApp.controller;

import com.tts.WeatherApp.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;


@RestController
public class PersonController {
    @GetMapping("/person/get")
    public Person getOnePerson(){
        return new Person("Aarnaa",
                "Deshmukh",
                30,
                Arrays.asList("passion fruit",
                        "seitan",
                        "tofu"));
    }
}



