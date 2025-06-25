package automacao.Pages;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[contains(@class, \"title\") and contains (., \"Products\")]")
    public WebElement LBL_Products;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement BTNAdicionarLanterna;

    @FindBy(id = "shopping_cart_container")
    public WebElement BTN_Carrinho;

    /**
     * Produto adicionado no carrinho
     * Lista com todas as ocorrencias do elemento na tela
     */
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public List <WebElement> ICN_CarrinhoCarregado;

    @FindBy(id="remove-sauce-labs-bike-light")
    public WebElement BTN_RemoverProduto;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void waitInvisibility(By elemento) {
        int timeoutInSeconds = 30; // Your integer value
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    }

}
