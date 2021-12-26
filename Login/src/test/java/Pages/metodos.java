package Pages;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Elements.elementos;

public class metodos {
	public static WebDriver driver;

	/**
	 * escolher o navegador e escolher site
	 * 
	 * @author Leticia Massolin
	 * @param abrir navegador
	 * @throws IOException
	 */

	public void abrirNavegador(String site, String navegador, String descricaoPasso) throws IOException {

		try {
			if (navegador == "CHROME" || navegador == "FIREFOX") {
				if (navegador == "CHROME") {

					System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
					driver = new ChromeDriver();
					driver.get(site);
					driver.manage().window().maximize();
				} else if (navegador == "FIREFOX") {
					System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
					driver = new FirefoxDriver();
					driver.get(site);
					driver.manage().window().maximize();

				}

			} else {
				System.out.println("Opcao invalida escolha CHROME ou FIREFOX");
			}

		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}

	}

	/**
	 * fechar browser
	 * 
	 * @author Leticia Massolin
	 * @param fechar
	 * @throws IOException
	 */

	public void fecharBrowser(String descricaoPasso) throws IOException {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}
	}

	/**
	 * tirar foto
	 * 
	 * @author Leticia Massolin
	 * @param screenshot
	 */
	public void screnShoot(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/prints/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

	/**
	 * esperarPreencher elemento presente na tela
	 * 
	 * @author Leticia Massolin
	 * 
	 * @param element
	 * @param descricaoPasso
	 */

	public void esperarPreencher(By element, String descricaoPasso) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			boolean elemento = wait.until(ExpectedConditions.elementToBeSelected(element));
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}
	}

	/**
	 * Pausa
	 * 
	 * @author Leticia Massolin
	 * 
	 * @param element
	 * @param descricaoPasso
	 */
	public void pausa(int tempo, String descricaoPasso) throws InterruptedException {

		try {
			Thread.sleep(tempo);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}

	}

	/**
	 * submit
	 * 
	 * @author Leticia Massolin
	 * @param submit no elemento
	 * @throws IOException
	 */
	public void submit(By elemento, String descricaoPasso) throws IOException {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot("erros/" + descricaoPasso);
		}
	}

	/**
	 * preencher
	 * 
	 * @author Leticia Massolin
	 * @param preecher elemento
	 * @throws IOException
	 * 
	 */
	public void preencher(By elemento, String texto, String descricaoPasso) throws IOException {
		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " -- erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}
	}

	elementos el = new elementos();

	/**
	 * preencher formulario
	 * 
	 * @author Leticia Massolin
	 * @param clicar no elemento
	 * @throws IOException
	 */
	public void formulario(String nome, String email, String senha, String descricaoPasso) throws IOException {
		try {
			preencher(el.getNome(), nome, null);
			preencher(el.getEmail(), email, "");
			preencher(el.getSenha(), senha, "");
			submit(el.getCadastrar(), null);
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);
		}
	}

	/**
	 * clicar
	 * 
	 * @author Leticia Massolin
	 * @param clicar no elemento
	 * @throws IOException
	 */
	public void clicar(By elemento, String descricaoPasso) throws IOException {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}
	}

	/**
	 * clicar
	 * 
	 * @author Leticia Massolin
	 * @param elemento
	 * @throws IOException
	 */
	public void rolarParaBaixo(String descricaoPasso) throws IOException {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0, 250);");
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}
	}
}
