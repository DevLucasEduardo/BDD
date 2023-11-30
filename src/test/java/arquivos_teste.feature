@tag
Feature: Cliente faz saque de dinheiro como um cliente,
eu gostaria de sacar dinheiro em caixa eletrônico,
para que eu nao tenha que esperar em uma fila de banco. 

	@tag1 
	Scenario: cliente especial com saldo negativo
		Given um cliente especial com saldo atual de -200 reais
		When for solicitado um saque no valor de 100 reais
		Then deve efetuar o saque e atualizar o saldo de conta para -300 reais
		And verifique mais resultados
	
	@tag2
	Scenario Outline: cliente comum com saldo negativo
		Given um cliente comum com saldo atual de -200 reais
		When solicitar um saque no valor de 100 reais
		Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente
	
	


	