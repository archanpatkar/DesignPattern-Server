package com.archanpatkar.UserManagment;

import java.util.HashMap;


public class FriendList 
{
    
    HashMap <Object,Object> CachedFriends = new HashMap<>();     
    
    public static String GetFriends()
    {
        //It'll contact the DAO layer and give you all the online friends and conversation will send it to Client and also cache it in the private local hashmap for fast usage and also will encrypt the friends name
        return "Module not ready";
    }
}
