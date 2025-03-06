package com.example.DemonstrateRESTAPI;

import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @GetMapping(value = {"/uc1", "/hello"})
    public String sayHello() {
        return "Hello, World!";
    }

    //UC2 Request parameter
    @GetMapping("/input")
    public String sayHello(@RequestParam(defaultValue = "Mark") String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    //UC3 Parameter using path variable
    @GetMapping("/query/{name}")
    public String display(@PathVariable String name){
        return "Hello "+ name+ " from BridgeLabz";
    }

    // uc4 getting first and last name using post request
    @PostMapping("/getfullname")
    public String sayHello(@RequestBody DtUser user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}