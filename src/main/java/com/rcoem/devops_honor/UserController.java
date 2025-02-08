package com.rcoem.devops_honor;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController{
    @GetMapping("/list")
    List<String> getAllUsers(){
        return List.of("Tanmay","Great");
    }

    @GetMapping("/html")
    public String getHtml() {
        return "Tanmay";  // Looks for Tanmay.html inside src/main/resources/templates/
    }

}

