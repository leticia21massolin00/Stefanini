package Stap;

import java.io.IOException;

import Elements.elementos;
import Pages.metodos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class tests {
	elementos el = new elementos();
	metodos mt = new metodos();

	@Dado("que eu esteja no {string}")
	public void que_eu_esteja_no(String Site) throws IOException, InterruptedException {
		mt.abrirNavegador(Site, "CHROME", null);

	}

	@Quando("preencher o formulario sem colocar o  nome")
	public void preencher_o_formulario_sem_colocar_o_nome() throws IOException {
		mt.formulario("", "leticiamassolin@teste.com", "1020304050", null);
		mt.submit(el.getCadastrar(), null);
		mt.screnShoot("sem campo nome");
	}

	@Quando("informar que o campo eh obrigatorio")
	public void informar_que_o_campo_eh_obrigatorio() {

	}

	@Quando("preencher o formulario sem colocar o email")
	public void preencher_o_formulario_sem_colocar_o_email() throws IOException {
		mt.formulario("Leticia Massolin", "", "1020304050", null);
		mt.submit(el.getCadastrar(), null);
		mt.screnShoot("sem campo email");
	}

	@Quando("preencher o formulario sem colocar a senha")
	public void preencher_o_formulario_sem_colocar_a_senha() throws IOException {
		mt.formulario("Leticia Massolin", "leticiamassolin@teste.com", "", null);
		mt.submit(el.getCadastrar(), "");
		mt.screnShoot("sem campo senha ");

	}

	@Quando("nao colocar nenhuma informacao")
	public void nao_colocar_nenhuma_informacao() throws IOException {
		mt.formulario("", "", "", null);
		mt.submit(el.getCadastrar(), null);
		mt.screnShoot("sem nenhum campo preenchido");
	}

	@Quando("informar que os campos sao  obrigatorios")
	public void informar_que_os_campos_sao_obrigatorios() {

	}

	@Quando("preencher o formulario com nome invalido")
	public void preencher_o_formulario_com_nome_invalido() throws IOException {
		mt.formulario("leticia", "leticiamassolin@teste.com", "1020304050", null);
		mt.submit(el.getCadastrar(), null);
		mt.screnShoot("nome invalido");

	}

	@Quando("informar que o dado esta invalido")
	public void informar_que_o_dado_esta_invalido() {

	}

	@Quando("preencher o formulario com email invalido")
	public void preencher_o_formulario_com_email_invalido() throws IOException {
		mt.formulario("leticia Massolin", "leticiamassolin@teste", "1020304050", null);
		mt.submit(el.getCadastrar(), null);
		mt.screnShoot("email invalido");
	}

	@Quando("preencher o formulario colocando senha com menos de {int} caracteres")
	public void preencher_o_formulario_colocando_senha_com_menos_de_caracteres(Integer int1) throws IOException {
		mt.formulario("Leticia Massolin", "leticiamassolin@teste.com", "1234567", null);
		mt.submit(el.getCadastrar(), null);
		mt.screnShoot("senha invalida");
	}

	@Quando("informar que precisa de {int} ou mais caracteres")
	public void informar_que_precisa_de_ou_mais_caracteres(Integer int1) {

	}

	@Quando("preencher o formulario corretamente")
	public void preencher_o_formulario_corretamente() throws IOException {
		mt.formulario("leticia Massolin", "leticiamassolin@teste.com", "1020304050", null);
		mt.submit(el.getCadastrar(), null);
		mt.rolarParaBaixo(null);
		mt.screnShoot("cadastro feito");

	}

	@Quando("a conta for criada com sucesso")
	public void a_conta_for_criada_com_sucesso() throws IOException {

	}

	@Quando("aparecer as informacoes em tabela")
	public void aparecer_as_informacoes_em_tabela() throws IOException {
		mt.formulario("leticia Victoria Massolin", "leticiamassolin@teste.com", "1020304050", null);
		mt.submit(el.getCadastrar(), null);
		mt.formulario("leticia  Massolin", "leticiamassolin@teste.com", "12345678", null);
		mt.submit(el.getCadastrar(), null);

		mt.rolarParaBaixo(null);
		mt.screnShoot("tabela com dois cadastro");
	}

	@Quando("e tenha duas contas criada na tabela")
	public void e_tenha_duas_contas_criada_na_tabela() throws IOException {

	}

	@Quando("fizer a exclusao da primeira conta")
	public void fizer_a_exclusao_da_primeira_conta() throws IOException {
		mt.formulario("leticia Victoria Massolin", "leticiamassolin@teste.com", "1020304050", null);
		mt.submit(el.getCadastrar(), null);
		mt.screnShoot("teste 10 1 3");
		mt.formulario("leticia  Massolin", "leticiamassolin@teste.com", "12345678", null);
		mt.submit(el.getCadastrar(), null);
		mt.screnShoot("tela 10 2 3");
		mt.clicar(el.getExcluir(), null);

		mt.rolarParaBaixo(null);
		mt.screnShoot("exclusao do primeiro cadastro");
	}

	@Entao("finalizo o teste")
	public void finalizo_o_teste() throws IOException {
		mt.fecharBrowser("");
	}
}