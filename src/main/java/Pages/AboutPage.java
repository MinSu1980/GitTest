package Pages;

import java.security.PublicKey;

public class AboutPage extends Page implements PageInterface{

    String Disclaimer;

    public String getDisclaimer(){
        return Disclaimer;
    }

    public void setDisclaimer(String disclaimer){

        Disclaimer = disclaimer;
    }

    public  void  getDeveloperName(){
        System.out.println(" Marry Johns ");
    }


}
