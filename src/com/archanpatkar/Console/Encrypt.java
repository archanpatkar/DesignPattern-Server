package com.archanpatkar.Console;

public class Encrypt {

    public static void Put(String Encryptant) {
        Logic(Encryptant);
    }

    private static String Logic(String o) {
        
        System.out.println(o);
        return o;
    }
    
    public static String EncryptTheFollowing(String Encryptant)
    {
        return Logic(Encryptant);// will use this method for encrypting friends name for main purpose but also common security encryption
    }

}
