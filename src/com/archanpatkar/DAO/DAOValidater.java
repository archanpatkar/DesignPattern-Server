package com.archanpatkar.DAO;

import com.archanpatkar.Console.Encrypt;
import com.archanpatkar.Console.Log;
import com.archanpatkar.Login.LoginAffil;


public class DAOValidater extends DAO {

    @Override
    public InformationAboutClient Validate(String Username, String Password) {
        InformationAboutClient SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER = new InformationAboutClient();
        SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER.bool = "false";//Default Value of Valid
        try {
            //Encrypt.Put("Checking if null");
            Log.Put("Checking if null");
            if (!Username.equals(null) && !Password.equals(null)) {
                //Encrypt.Put("it is not null");
                Log.Put("it is not null");
                String TemPASS = LoginAffil.CURRENT_SESSION_LOGIN_CACHE.get(Username);
                //Encrypt.Put("Checking if value of Username not equal to null");
                Log.Put("Checking if value of Username not equal to null");
                if (TemPASS.equals(null)) {
                    SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER.Username = TemPASS;
                    //Encrypt.Put("Value of Username is null");
                    Log.Put("Value of Username is null");
                    //Encrypt.Put("Make an Account");
                    Log.Put("Make an Account");
                    SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER.bool="false";
                    return SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER;
                }
                System.out.println("Checking if password is right");
                if (TemPASS.equals(Password)) {
                    //Encrypt.Put("Password is right");
                    Log.Put("Password is right");
                    SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER.bool="true";
                    return SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER;
                } else {
                    //Encrypt.Put("Password wrong");
                    Log.Put("Password wrong");
                    SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER.bool="false";
                    return SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER;
                }
            }
            else{
                //Encrypt.Put("Parameters are null");
                Log.Put("Parameters are null");
            }
        } catch (Exception e) {
            //Encrypt.Put("Validator Fails");
            Log.Put("Validator Fails");
            return SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER;
        }
        return SENDING_INFORMATION_ABOUT_CLIENT_TO_CONVERSER;
    }
}
