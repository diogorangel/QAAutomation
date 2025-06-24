package automacao.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import automacao.Pages.HomePage;
import automacao.Pages.LoginPage;

public class RealizarCompra extends BaseTest {

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
    public void T001_AdicionarProdutoNocarrinho() throws InterruptedException{
        loginPage.realizarLogin("standard_user", "secret_sauce");
        assertTrue(homePage.LBL_Products.isDisplayed());

        homePage.BTNAdicionarLanterna.click();

        assertTrue(homePage.ICN_CarrinhoCarregado.get(0).isDisplayed());
        Thread.sleep(6000);
    }

    @Test
    public void T002_RemoverProdutoDocarrinhoComSucesso() throws InterruptedException{
        loginPage.realizarLogin("standard_user", "secret_sauce");
        assertTrue(homePage.LBL_Products.isDisplayed());

        homePage.BTNAdicionarLanterna.click();

        // Elemento na tela       1, 2, 3, 4
        //Lista começa da posição 0, 1, 2, 3
        assertTrue(homePage.ICN_CarrinhoCarregado.get(0).isDisplayed());
        assertEquals("Remove",homePage.BTN_RemoverProduto.getText());

        homePage.BTN_RemoverProduto.click();

        //Validar se a bolinha vermelha não é mais apresentada na tela
        assertEquals(0, homePage.ICN_CarrinhoCarregado.size());

        //Criação de um elemento do tipo BY
        By LBL_CARRINHOCOMPRODUTOS = By.xpath("//span[@class='shopping_cart_badge']");
        homePage.waitInvisibility(LBL_CARRINHOCOMPRODUTOS);
    }

    
}
