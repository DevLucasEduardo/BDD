# BDD

## Descrição

Este projeto é uma aplicação de Desenvolvimento Dirigido por Comportamento (BDD) usando o Cucumber. Trata-se de uma classe `Conta` que implementa operações bancárias de saques para clientes comuns e especiais.

O projeto foi criado utilizando a linguagem Java e o framework Cucumber para escrever e executar testes BDD.

## Funcionalidades

É possível criar um cliente comum ou especial. A diferença entre os dois é que o cliente especial pode solicitar saques caso sua conta esteja negativa ou venha a ficar negativa, já o cliente comum não é permitido realizar transações deste tipo, a não ser que esteja positivo e permaneça desta forma.

A classe `Conta` possui métodos para:

- Criar um cliente especial com um determinado saldo.
- Criar um cliente comum com um determinado saldo.
- Solicitar saldo.
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

![image](https://github.com/DevLucasEduardo/BDD/assets/102432468/364c4821-b5b9-45a8-8af3-f4c5b373329d)

![image](https://github.com/DevLucasEduardo/BDD/assets/102432468/db930552-8235-400a-bd87-bee454414481)

![image](https://github.com/DevLucasEduardo/BDD/assets/102432468/c49ec815-80bb-4fe8-a607-bac2fed020ab)

Abaixo é possível visualizar que todos os cenários passaram nos testes.

![image](https://github.com/DevLucasEduardo/BDD/assets/102432468/25fb577d-e62a-420f-8816-4b2d70e729a4)

## Javadoc 

Há uma documentação da classe Conta, sendo possível verificar suas funcionalidades. [Link para o Javadoc](https://github.com/DevLucasEduardo/BDD/tree/main/doc). É possível ver o javadoc abrindo o arquivo allclasses-index.html

