package automacao.runner;
import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/cucumber",
        "html:target/cucumber-report",
        "json:target/cucumber.json"},
        glue = {"src/test/java/automacao/test"},
        snippets = CAMELCASE,
        features = "src/test/java/automacao/resource/features",
        tags = "@001_RealizarCompras_Adicionarumproduto"
                                                    )

public class RunRealizarCompraTest {
}