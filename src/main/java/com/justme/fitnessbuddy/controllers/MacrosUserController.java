package com.justme.fitnessbuddy.controllers;


import com.justme.fitnessbuddy.models.MacrosUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.justme.fitnessbuddy.FitnessBuddyApplication;
import java.util.ArrayList;


@RestController
@RequestMapping("data")
public class MacrosUserController {
        //All macrosusers
    @GetMapping(value = "/allmacrosusers", produces = {"application/json"})
    public ResponseEntity<?> getAllMacrosUsers(){
        FitnessBuddyApplication.ourMacrosUserList.macrosUserList.sort((e1, e2) -> e1.getUsername().compareToIgnoreCase(e2.getUsername()));
        return new ResponseEntity<>(FitnessBuddyApplication.ourMacrosUserList, HttpStatus.OK);
    }
        //macrosuser/2
    @GetMapping(value = "/macrosuser/{id}",produces = {"application/json"})
    public ResponseEntity<?> getMacrosUserById(@PathVariable Integer id){
            MacrosUser rtnMacrosUser = FitnessBuddyApplication.ourMacrosUserList.findMacrosUserById(mu -> (mu.getId() == id));
            return new ResponseEntity<>(rtnMacrosUser, HttpStatus.OK);
    }
        //macrosuser/username
    @GetMapping(value = "/macrosuser/username/{username}",produces = {"application/json"})
    public ResponseEntity<?> getMacrosUserByUsername(@PathVariable String username){
            MacrosUser rtnMacrosUser = FitnessBuddyApplication.ourMacrosUserList.findMacrosUserByUsername(mu -> (mu.getUsername().equals(username)));
            return new ResponseEntity<>(rtnMacrosUser, HttpStatus.OK);
    }

    //macrosusers/username
    @GetMapping(value = "/macrosusers/username/{username}",produces = {"application/json"})
    public ResponseEntity<?> getAllMacrosUserByUsername(@PathVariable String username) {
        ArrayList<MacrosUser> rtnMacrosUser = FitnessBuddyApplication.ourMacrosUserList.findAllMacrosUsersByUsername(username);

        return new ResponseEntity<>(rtnMacrosUser, HttpStatus.OK);
    }
}
