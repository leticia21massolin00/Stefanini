package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
				// Mostrar o caminho das features
				features = "src/test/resources/features/",
				// Mostrar pacote estão os steps para execução
				glue = "testes",
				// Tags para direcionar a execução dos testes
				tags = "@Executa",
				
				// Formatação do console Cucumber | Report html
				plugin = {"pretty", "html:target/report.html"},
				// Monochrome deixa mais limpo o console, sem trazer caracteres especiais
				monochrome = true,
				// Deixa os métodos com padrão da linguagem Java ao invés de underline 
				snippets = SnippetType.CAMELCASE,
				// Não executa o teste ele so valida o mapeamento se falta terminar alguma coisa, padrão deixar false
				dryRun = false

				)
public class executa {

}
