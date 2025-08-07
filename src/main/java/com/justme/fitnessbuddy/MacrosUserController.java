package com.justme.fitnessbuddy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("data")
public class MacrosUserController {
        //All macrosUsers
    @GetMapping(value = "/allmacrosusers", produces = {"application/json"})
    public ResponseEntity<?> getAllMacrosUsers(){}
        //macrosUser/2
    @GetMapping(value = "/macrosuser/{id}", produces = {"application/json"})
    public ResponseEntity<?>
        //macrosUser/username
    @GetMapping(value = "/macrosuser/{username}", produces = {"application/json"})
    public ResponseEntity<?>
}
