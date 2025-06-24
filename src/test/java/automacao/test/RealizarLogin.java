package automacao.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import automacao.Pages.HomePage;
import automacao.Pages.LoginPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RealizarLogin extends BaseTest{

    // 1° - Criando objetos das classes Pages
    protected static LoginPage loginPage;
    protected static HomePage homePage;

    //2° - Instanciando nossos objetos
    @Before
    public void instanciarPages(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void T001_RealizarLoginComSucesso() throws InterruptedException{
        //Ações
       /* WebElement campoTXT_username = driver.findElement(By.id("user-name"));
        campoTXT_username.sendKeys("standard_user");

        WebElement campoTXT_password = driver.findElement(By.id("password"));
        campoTXT_password.sendKeys("secret_sauce");

        WebElement BTN_Login = driver.findElement(By.id("login-button"));
        BTN_Login.click();

        WebElement LBL_Products = driver.findElement(By.xpath("//span[contains(@class, \"title\") and contains (., \"Products\")]"));

        //Validação
        assertTrue(LBL_Products.isDisplayed());

        Thread.sleep(5000);*/

        //Após Refatoração

        /*loginPage.campoTXT_username.sendKeys("standard_user");
        loginPage.campoTXT_password.sendKeys("secret_sauce");
        loginPage.BTN_Login.click();*/

        loginPage.realizarLogin("standard_user", "secret_sauce");
        //Verificar se realizou o login corretamente validando se o nome Produtos é exibido
        assertTrue(homePage.LBL_Products.isDisplayed());
    }

    @Test
    public void T002_RealizarLoginInvalido(){
         //Ações
         /*WebElement campoTXT_username = driver.findElement(By.id("user-name"));
         campoTXT_username.sendKeys("standard");
 
         WebElement campoTXT_password = driver.findElement(By.id("password"));
         campoTXT_password.sendKeys("secret_sauce");
 
         WebElement BTN_Login = driver.findElement(By.id("login-button"));
         BTN_Login.click();

         String LBL_ErroCredenciaisInvalidas = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
         System.out.println(LBL_ErroCredenciaisInvalidas);

         assertEquals("Epic sadface: Username and password do not match any user in this service",LBL_ErroCredenciaisInvalidas);*/
         /*loginPage.campoTXT_username.sendKeys("standard");
         loginPage.campoTXT_password.sendKeys("secret_sauce");
         loginPage.BTN_Login.click();*/

         loginPage.realizarLogin("standard", "secret_sauce");
         assertEquals("Epic sadface: Username and password do not match any user in this service", loginPage.LBL_Erro.getText());
    }

}
