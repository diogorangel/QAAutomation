package automacao.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Esta é a classe que faz o setup para nossos testes executarem
//Encontra o chromeDriver que esta na pasta resource
//Ela inicia o driver, abre o navegador
public abstract class BaseTest {

    protected static WebDriver driver;
    protected static String URL_BASE = "https://www.saucedemo.com/";
    protected static String CAMINHO_DRIVER = "src/test/java/automacao/resource/chromedriver.exe";

    //Inicia o drive e abre o navegador com a url antes de cada teste
    @Before
    public void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }
 
    //Finaliza o drive e encerra a sua tarefa após cada teste
    @After
    public void finalizar(){
        driver.quit();
    }
    
}
