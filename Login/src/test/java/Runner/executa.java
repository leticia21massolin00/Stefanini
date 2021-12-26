package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
				// Mostrar o caminho das features
				features = "src/test/resources/features/",
				// Mostrar pacote est�o os steps para execu��o
				glue = "testes",
				// Tags para direcionar a execu��o dos testes
				tags = "@Executa",
				
				// Formata��o do console Cucumber | Report html
				plugin = {"pretty", "html:target/report.html"},
				// Monochrome deixa mais limpo o console, sem trazer caracteres especiais
				monochrome = true,
				// Deixa os m�todos com padr�o da linguagem Java ao inv�s de underline 
				snippets = SnippetType.CAMELCASE,
				// N�o executa o teste ele so valida o mapeamento se falta terminar alguma coisa, padr�o deixar false
				dryRun = false

				)
public class executa {

}
