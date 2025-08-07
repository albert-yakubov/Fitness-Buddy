package com.justme.fitnessbuddy;

import java.util.ArrayList;

public class MacrosUserList {

    public ArrayList<MacrosUser> macrosUserList =  new ArrayList<>();
    
    public MacrosUserList() {
        macrosUserList.add(new MacrosUser("admin", "mrayakubov@hotmail.com", "password111"));
        macrosUserList.add(new MacrosUser("admin2", "mrayakubov@hotmail.com", "password111"));

    }
    
    public String findMacrosUser(CheckMacrosUser username) {
         for (MacrosUser macrosUser : macrosUserList) {
             if(username.equals(macrosUser.getUsername())){
                 return macrosUser.getUsername();
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
