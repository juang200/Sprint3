package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ConfiguracionEmpresa.feature",
        glue = "ConfiguracionEmpresaSteps",
        tags = "@CrearMarca",
        snippets = SnippetType.CAMELCASE
)

public class ConfiguracionEmpresaRunner {
}
