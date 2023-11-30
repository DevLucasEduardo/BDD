import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Esta classe contém definições de passos do Cucumber relacionados a operações de conta.
 * Autor: Lucas Eduardo Pereira
 * Versão: 1.0
 * Desde: 2023-11-29
 */
public class Conta {
    
    /**
     * Configura um cliente especial com um saldo atual específico.
     *
     * @param saldoAtual O saldo atual do cliente especial.
     * @throws Throwable Lança uma PendingException porque a implementação está pendente.
     */
    @Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
    public void um_cliente_especial_com_saldo_atual_de_reais(int saldoAtual) throws Throwable {
        throw new PendingException();
    }
    
    /**
     * Simula uma solicitação de saque de um valor específico.
     *
     * @param valorSaque O valor solicitado para ser sacado.
     * @throws Throwable Lança uma PendingException porque a implementação está pendente.
     */
    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void foi_solicitado_um_saque_no_valor_de_reais(int valorSaque) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Verifica se um saque deve ser executado e o saldo da conta atualizado conforme necessário.
     *
     * @param saldoEsperado O saldo esperado após o saque.
     * @throws Throwable Lança uma PendingException porque a implementação está pendente.
     */
    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int saldoEsperado) throws Throwable {
    	// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    /**
     * Verifica se um saque não deve ser executado devido a fundos insuficientes.
     *
     * @throws PendingException Lança uma PendingException porque a implementação está pendente.
     */
    @Then("^não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente$")
    public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_Saldo_Insuficiente() {
    	// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    /**
     * Realiza verificações ou checagens adicionais se necessário.
     *
     * @throws Throwable Lança uma PendingException porque a implementação está pendente.
     */
    @Then("^verificar mais resultados$")
    public void verificar_mais_resultados() throws Throwable {
    	// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}




