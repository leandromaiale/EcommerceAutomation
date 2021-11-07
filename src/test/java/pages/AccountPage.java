package pages;

public class AccountPage extends BasePage{

    private String signInButton = "//a[contains(text(),'Sign in')]";
    private String emailField = "//input[@id='email']";
    private String passwordField = "//input[@id='passwd']";
    private String loginButton = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]";
    private String singOutOption = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]";
    private String passwordRequired = "//li[contains(text(),'Password is required.')]";
    private String emailRequired = "//li[contains(text(),'An email address required.')]";
    private String wrongEmail = "//li[contains(text(),'Authentication failed.')]";

    public AccountPage() {
        super(driver);
    }

    public void navigateToStore(){
        navigateTo("http://automationpractice.com/index.php");
    }

    public void clickLoginAccount(){
        clickElement(signInButton);
    }

    public void enterEmail(String email){
        write(emailField, email);

    }

    public void enterPassword(String password){
        write(passwordField, password);

    }

    public void clickLoginButton(){
        clickElement(loginButton);
    }

    public String validateMyAccount(){
        return textFromElement(singOutOption);
    }

    public void clickSignOut(){

        clickElement(singOutOption);
    }

    public boolean loginStatus(){
        return elementIsDeplayed(signInButton);
    }

    public boolean errorPasswordDisplayed(){
        return elementIsDeplayed(passwordRequired);
    }

    public boolean errorEmailDisplayed(){
        return elementIsDeplayed(emailRequired);
    }

    public boolean emailErrorAutentification(){
        return elementIsDeplayed(wrongEmail);
    }




}
