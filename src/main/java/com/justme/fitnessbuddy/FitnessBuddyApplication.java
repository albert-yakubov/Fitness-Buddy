package com.justme.fitnessbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FitnessBuddyApplication {
    static MacrosUserList ourMacrosUserList;
    public static void main(String[] args) {

        ourMacrosUserList = new MacrosUserList();
        SpringApplication.run(FitnessBuddyApplication.class, args);
    }

}
