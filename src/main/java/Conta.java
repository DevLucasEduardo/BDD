import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Esta classe contém métodos relacionados a operações de conta.
 * Autor: Lucas Eduardo Pereira
 * Versão: 1.0
 * Desde: 2023-11-29
 */
public class Conta {
    
    /**
     * Tipo de cliente, podendo ser "especial" ou "comum".
     */
    String tipoCliente = "";
    
    /**
     * Saldo atual da conta.
     */
    int saldoAtual = 0;

    /**
     * Construtor sem argumentos.
     */
    public Conta() {
    }
    
    /**
     * Configura um cliente especial com um saldo atual negativo.
     *
     * @param tipoCliente Define o tipo de cliente (especial ou comum).
     */
    @Given("^um cliente especial com saldo atual de -(\\d+) reais$")
    public void cliente_especial_com_saldo_negativo(String tipoCliente) {
		this.tipoCliente = tipoCliente;
    }
    
    /**
     * Solicita um saque com um valor em reais para um cliente.
     *
     * @param saque Valor do saque a ser realizado.
     * @return Uma mensagem indicando se o saque foi autorizado ou negado.
     */
    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public String foi_solicitado_um_saque_no_valor_de_reais(int saque) {
    	if (this.tipoCliente.equals("especial")) {
    		return "OK";
    	}
    	return "Negado";
    }

    /**
     * Verifica se o saque foi efetuado com sucesso e atualiza o saldo da conta para um valor negativo.
     *
     * @param saque Valor do saque a ser realizado.
     * @return O novo saldo da conta após o saque.
     */
    @Then("^deve efetuar o saque e atualizar o saldo de conta para -(\\d+) reais$")
    public int deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais_negativos(int saque) {
    	if (tipoCliente.equals("especial")) {
    		saldoAtual -= saque;
    		return saldoAtual;
    	}
    	return saldoAtual;
    }
    
    
    /**
     * Configura um cliente comum com um saldo atual negativo.
     *
     * @param tipoCliente Define o tipo de cliente (especial ou comum).
     */
    @Given("^um cliente comum com saldo atual de -(\\d+) reais$")
    public void cliente_comum_com_saldo_negativo(String tipoCliente) {
    	this.tipoCliente = tipoCliente;   
    }
    
    /**
     * Verifica se o saque não foi efetuado e retorna a mensagem de Saldo Insuficiente para o cliente comum.
     *
     * @return Mensagem indicando que o saque foi negado devido ao saldo insuficiente do cliente comum.
     */
    @Then("^não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente$")
    public String nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_Saldo_Insuficiente() {
    	return "Negado. Cliente comum está com saldo abaixo do permitido para efetuar saques.";
    }
    
    /**
     * Configura um cliente especial com um saldo atual positivo.
     *
     * @param tipoCliente Define o tipo de cliente (especial ou comum).
     */
    @Given("^um cliente especial com saldo atual de (\\d+) reais$")
    public void cliente_especial_com_saldo_positivo(String tipoCliente) {
    	this.tipoCliente = tipoCliente; 
    }
    
    /**
     * Configura um cliente comum com um saldo atual positivo.
     *
     * @param tipoCliente Define o tipo de cliente (especial ou comum).
     */
    @Given("^um cliente comum com saldo atual de (\\d+) reais$")
    public void cliente_comum_com_saldo_positivo(String tipoCliente) {
    	this.tipoCliente = tipoCliente;   
    }
}






