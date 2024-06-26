package Pages;

public class Pagesmain {
    public static void main(String[] args) {

       // Page loginScreen = new Page("Login",1, "www.legionIT.com/login");
//        loginScreen.pageID = 1;
//        loginScreen.pageName = "Login";
//        loginScreen.URL = "www.legionIT.com/login";

//        loginScreen.openPage();
//        loginScreen.clickButton("Login");
//        loginScreen.closePage();
//
//
//        Page aboutScreen = new Page("pageName", 54, "www.legionIT.com/login");
//
//        System.out.println(aboutScreen.getPageID());
//        aboutScreen.setPageName("about");
//        aboutScreen.setURL("www.legionIT.com/about");
//
//        aboutScreen.openPage();
//        aboutScreen.clickButton("Exit");
//        aboutScreen.closePage();
//
//        LoginPage loginPage = new LoginPage();
//        loginPage.setPageName("LoginPage");
//        loginPage.setURL("http ...");
//
//
//        loginPage.openPage();
//
//        loginPage.setUserName("name");
//        loginPage.setPassword("12334");
//        loginPage.populateCredentials(loginPage.getUserName(), loginPage.getPassword());


//        Page page = new Page();
//        page.getDeveloperName();

        LoginPage loginPage = new LoginPage();

        loginPage.setPageName("login");
        loginPage.getDeveloperName();

        AboutPage aboutPage = new AboutPage();
        aboutPage.getDeveloperName();



    }
}
