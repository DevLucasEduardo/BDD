import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Esta classe métodos relacionados a operações de conta.
 * Autor: Lucas Eduardo Pereira
 * Versão: 1.0
 * Desde: 2023-11-29
 */
public class Conta {
    
	
    /**
     * Construtor sem argumentos.
     */
    public Conta() {
    }
    
    /**
     * Configura um cliente especial com um saldo atual.
     *
     * @param saldoAtual O saldo atual do cliente especial.
     */
    @Given("^um cliente especial com saldo atual de -(\\d+) reais$")
    public void cliente_especial_com_saldo_negativo(int saldoAtual) {
        // Método ainda não implementado
    }
    
    /**
     * Solicita um saque com um valor em reais.
     *
     * @param valorSaque O valor a ser sacado.
     */
    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void foi_solicitado_um_saque_no_valor_de_reais(int valorSaque) {
        // Método ainda não implementado
    }

    /**
     * Verifica se o saque foi efetuado com sucesso e atualiza o saldo da conta para um valor em reais.
     *
     * @param saldoEsperado O saldo esperado após o saque.
     */
    @Then("^deve efetuar o saque e atualizar o saldo de conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais_negativos(int saldoEsperado) {
        // Método ainda não implementado
    }
    
    /**
     * Configura um cliente comum com um saldo atual.
     *
     * @param saldoAtual O saldo atual do cliente comum.
     */
    @Given("^um cliente comum com saldo atual de -(\\d+) reais$")
    public void cliente_comum_com_saldo_negativo(int saldoAtual) {
        // Método ainda não implementado
    }
    
    /**
     * Verifica se o saque não foi efetuado e se retorna a mensagem de Saldo Insuficiente.
     */
    @Then("^não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente$")
    public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_Saldo_Insuficiente() {
        // Método ainda não implementado
    }
    
    /**
     * Configura um cliente especial com um saldo atual.
     *
     * @param saldoAtual O saldo atual do cliente especial.
     */
    @Given("^um cliente especial com saldo atual de (\\d+) reais$")
    public void cliente_especial_com_saldo_positivo(int saldoAtual) {
        // Método ainda não implementado
    }
    
    /**
     * Verifica se o saque foi efetuado com sucesso e atualiza o saldo da conta para um valor em reais.
     *
     * @param saldoEsperado O saldo esperado após o saque.
     */
    @Then("^deve efetuar o saque e atualizar o saldo de conta para (\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais_positivos(int saldoEsperado) {
        // Método ainda não implementado
    }
    
    /**
     * Configura um cliente comum com um saldo atual.
     *
     * @param saldoAtual O saldo atual do cliente comum.
     */
    @Given("^um cliente comum com saldo atual de (\\d+) reais$")
    public void cliente_comum_com_saldo_positivo(int saldoAtual) {
        // Método ainda não implementado
    }
    
}





