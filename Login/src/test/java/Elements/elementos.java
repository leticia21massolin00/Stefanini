package Elements;

import org.openqa.selenium.By;

public class elementos {
//campos do formulario
	private By nome = By.id("name");
	private By email = By.id("email");
	private By senha = By.id("password");
//cadastrar
	private By cadastrar = By.id("register");

// excluir
	private By excluir = By.id("removeUser1");

// modo publico

	public By getNome() {
		return nome;
	}

	public By getEmail() {
		return email;
	}

	public By getSenha() {
		return senha;
	}

	public By getCadastrar() {
		return cadastrar;
	}

	public By getExcluir() {
		return excluir;
	}
}
