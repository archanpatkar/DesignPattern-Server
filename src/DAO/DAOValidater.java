package DAO;

import Server.LoginData;


public class DAOValidater extends DAO {

    @Override
    public InformationAboutClient Validate(String Username, String Password) {
        InformationAboutClient SENDING_INFORMATION_ABOUT_CLIENT_TO_R = new InformationAboutClient();
        SENDING_INFORMATION_ABOUT_CLIENT_TO_R.bool = "false";//Default Value of Valid
        try {
            System.out.println("Checking if null");
            if (!Username.equals(null) && !Password.equals(null)) {
                System.out.println("it is not null");
                String TemPASS = LoginData.UP_LOGIN_DATA.get(Username);
                System.out.println("Checking if value of Username not equal to null");
                if (TemPASS.equals(null)) {
                    SENDING_INFORMATION_ABOUT_CLIENT_TO_R.Username = Username;
                    System.out.println("Value of Username is null");
                    System.out.println("Make an Account");
                    SENDING_INFORMATION_ABOUT_CLIENT_TO_R.bool="false";
                    return SENDING_INFORMATION_ABOUT_CLIENT_TO_R;
                }
                System.out.println("Checking if password is right");
                if (TemPASS.equals(Password)) {
                    System.out.println("Password is right");
                    SENDING_INFORMATION_ABOUT_CLIENT_TO_R.bool="true";
                    return SENDING_INFORMATION_ABOUT_CLIENT_TO_R;
                } else {
                    System.out.println("Password wrong");
                    SENDING_INFORMATION_ABOUT_CLIENT_TO_R.bool="false";
                    return SENDING_INFORMATION_ABOUT_CLIENT_TO_R;
                }
            }
            else{
                System.out.println("Parameters are null");
            }
        } catch (Exception e) {
            System.out.println("Validator Fails");
            return SENDING_INFORMATION_ABOUT_CLIENT_TO_R;
        }
        return SENDING_INFORMATION_ABOUT_CLIENT_TO_R;
    }
}
