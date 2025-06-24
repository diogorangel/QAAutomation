package automacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement campoTXT_username;

    @FindBy(id = "password")
    public WebElement campoTXT_password;

    @FindBy(id = "login-button")    
    public WebElement BTN_Login;

    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement LBL_Erro;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Método para realizar o login
     * @param usuario
     * @param senha
     */
    public void realizarLogin(String usuario, String senha){
        campoTXT_username.sendKeys(usuario);
        campoTXT_password.sendKeys(senha);
        BTN_Login.click();
    }
    
}
