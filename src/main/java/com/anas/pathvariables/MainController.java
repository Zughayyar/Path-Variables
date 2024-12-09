package com.anas.pathvariables;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/daikichi")
public class MainController {
    @RequestMapping(value = "/travel/{city}", method=RequestMethod.GET)
    public String city(@PathVariable("city") String city) {
        return "Congratulations! you will soon travel to " + city;
    }
    @RequestMapping(value = "/lotto/{num}", method=RequestMethod.GET)
    public String lotto(@PathVariable("num") int num) {
        if (num % 2 == 0) {
            return "You will take a grand journey in the near future, but be wary of tempting offers";
        }
        else {
            return "You have enjoyed the fruits of your labor but noow is a great time to spend time with family and friends.";
        }
    }
}
    
    

