package com.justme.fitnessbuddy.models;

import com.justme.fitnessbuddy.repositories.CheckMacrosUser;

import java.util.ArrayList;

public class MacrosUserList {

    public ArrayList<MacrosUser> macrosUserList =  new ArrayList<>();
    
    public MacrosUserList() {
        macrosUserList.add(new MacrosUser("admin", "mrayakubov@hotmail.com", "password111"));
        macrosUserList.add(new MacrosUser("admin2", "mrayakubov@hotmail.com", "password111"));

    }
    
    public MacrosUser findMacrosUserByUsername(CheckMacrosUser username) {
         for (MacrosUser mu : macrosUserList) {
             if(username.checkMacrosUser(mu)){
                 return mu;
             }
         }
         return null;
    }

    public ArrayList<MacrosUser> findAllMacrosUsersByUsername(String username) {

        ArrayList <MacrosUser> tempMacrosUserList = new ArrayList <>();

        for (MacrosUser mu : macrosUserList) {
            if(mu.getUsername().contains(username)){
                tempMacrosUserList.add(mu);

            }
        }
        return tempMacrosUserList;
    }
    public MacrosUser findMacrosUserById(CheckMacrosUser macrosUser) {
        for (MacrosUser mu : macrosUserList) {
            if(macrosUser.checkMacrosUser(mu)){
                return mu;
            }
        }
        return null;
    }

    public ArrayList<MacrosUser> getMacrosUserList() {
        ArrayList <MacrosUser> tempMacrosUserList = new ArrayList <>();
        for (MacrosUser macrosUser : macrosUserList) {
            tempMacrosUserList.add(macrosUser);
        }

        return tempMacrosUserList;
    }
}
