@Saque
Feature: Cliente faz saque de dinheiro como um cliente,
eu gostaria de sacar dinheiro em caixa eletrônico,
para que eu não tenha que esperar em uma fila de banco. 

    @ClienteEspecialSaldoNegativo
    # Cenário de cliente especial com saldo negativo realizando um saque
    Scenario Outline: cliente especial com saldo negativo
        Given um cliente especial com saldo atual de <SaldoInicial> reais
        When for solicitado um saque no valor de <ValorSaque> reais
        Then deve efetuar o saque e atualizar o saldo de conta para <ValorFinal> reais
        
        Examples:
        | SaldoInicial | ValorSaque | ValorFinal |
        | -200         | 100        | -300       |
        | -150         | 200        | -350       |
        | -400         | 50         | -450       |

    @ClienteComumSaldoNegativo
    # Cenário de cliente comum com saldo negativo tentando realizar um saque (não permitido)
    Scenario Outline: cliente comum com saldo negativo
        Given um cliente comum com saldo atual de <SaldoInicial> reais
        When for solicitado um saque no valor de <ValorSaque> reais
        Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente
        
        Examples:
        | SaldoInicial | ValorSaque | 
        | -200         | 100        |
        | -150         | 200        |
        | -300         | 50         |
        
    @ClienteEspecialSaldoPositivo
    # Cenário de cliente especial com saldo positivo realizando um saque
    Scenario Outline: cliente especial com saldo positivo
        Given um cliente especial com saldo atual de <SaldoInicial> reais
        When for solicitado um saque no valor de <ValorSaque> reais
        Then deve efetuar o saque e atualizar o saldo de conta para <ValorFinal> reais
        
        Examples:
        | SaldoInicial | ValorSaque | ValorFinal |
        | -200         | 100        | -300       |
        | -150         | 200        | -350       |
        | -400         | 50         | -450       |
        
    @ClienteComumSaldoPositivo
    # Cenário de cliente comum com saldo positivo realizando um saque
    Scenario Outline: cliente comum com saldo positivo
        Given um cliente comum com saldo atual de <SaldoInicial> reais
        When for solicitado um saque no valor de <ValorSaque> reais
        Then deve efetuar o saque e atualizar o saldo de conta para <ValorFinal> reais
        
        Examples:
        | SaldoInicial | ValorSaque | ValorFinal |
        | 500          | 100        | 400        |
        | 150          | 100        | 50         |
        | 600          | 50         | 550        |
        
    @ClienteComumSaldoPositivoSaqueAcimaDoSaldo
    # Cenário de cliente comum com saldo positivo tentando realizar um saque (não permitido)
    Scenario Outline: cliente comum com saldo positivo e saque acima do saldo
        Given um cliente comum com saldo atual de <SaldoInicial> reais
        When for solicitado um saque no valor de <ValorSaque> reais
        Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente
        
        Examples:
        | SaldoInicial | ValorSaque | 
        | 200          | 500        |
        | 150          | 200        |
        | 300          | 650        |

		

		

	
	


	