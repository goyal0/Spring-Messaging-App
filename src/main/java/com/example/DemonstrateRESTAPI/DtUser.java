package com.example.DemonstrateRESTAPI;


public class DtUser {
    String firstName;
    String lastName;
    public DtUser(String f,String l){
        firstName=f;
        lastName=l;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

}