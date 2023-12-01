# BDD

## Descrição

Este projeto é uma aplicação de Desenvolvimento Dirigido por Comportamento (BDD) usando o Cucumber. Trata-se de uma classe `Conta` que implementa operações bancárias de saques para clientes comuns e especiais.

O projeto foi criado utilizando a linguagem Java e o framework Cucumber para escrever e executar testes BDD.

## Funcionalidades

É possível criar um cliente comum ou especial. A diferença entre os dois é que o cliente especial pode solicitar saques caso sua conta esteja negativa ou venha a ficar negativa, já o cliente comum não é permitido realizar transações deste tipo, a não ser que esteja positivo e permaneça desta forma.

A classe `Conta` possui métodos para:

- Criar um cliente especial com um determinado saldo.
- Criar um cliente comum com um determinado saldo.
- Solicitar saque.
- Efetuar ou não o saque de acordo com a situação do cliente.

## .feature 

O arquivo .feature é utilizado para informar de forma textual o que deve acontecer em dados cenários.
Por exemplo, na imagem abaixo, dada uma situação (Given), quando uma ação ocorrer (When), então (Then) algo deverá acontecer.

Neste caso foram usados três cenários indicados pelos valores na tabela da imagem. As variáveis em laranja são substituídos pelos valroes da tabela.

![image](https://github.com/DevLucasEduardo/BDD/assets/102432468/cfacfaef-d59e-40dc-9aba-8148ac211de1)



## Resultados obtidos

Nas imagens a seguir é possível visualizar os cenários obtidos e quais métodos foram chamados para cada caso criado.
Isto é, em cada situação, um método específico deve ser chamado, caso contrário o cenário não passará no teste.
A esquerda estão os cenários do arquivo .feature e a direita quais métodos foram chamados.

![image](https://github.com/DevLucasEduardo/BDD/assets/102432468/96e9aff1-5182-4197-8dcd-a265e9c875a2)

![image](https://github.com/DevLucasEduardo/BDD/assets/102432468/fe7bde84-9dd1-4524-a036-9168b6655335)

![image](https://github.com/DevLucasEduardo/BDD/assets/102432468/204b4e22-4358-40c7-8280-5975195c2dde)

Abaixo é possível visualizar que todos os cenários passaram nos testes.

![image](https://github.com/DevLucasEduardo/BDD/assets/102432468/25fb577d-e62a-420f-8816-4b2d70e729a4)

## Javadoc 

Há uma documentação da classe Conta, sendo possível verificar suas funcionalidades. [Link para o Javadoc](https://github.com/DevLucasEduardo/BDD/tree/main/doc). É possível ver o javadoc abrindo o arquivo allclasses-index.html

