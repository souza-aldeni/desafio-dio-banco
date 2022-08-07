# Desafio Banco Digital

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte 
cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência 
(entre contas da própria instituição).

Obs.: Parte do desafio foi desenvolvido com o intrutor da DIO, porem adicionei algumas funcionalidades que não tinham, como:
 - Imprimir o Extrato da conta;
 - Listar as contas abertas no Banco;
 - Alem de formatar as impressões na tela;

Diante do desafio proposto a solução adotada está resumida abaixo:
 - Criamos uma interface para contas que seriam criadas;
 - Implementamos a interface atraves da classe abstrata Conta;
 - Criamos as classes Conta corrente e Conta poupanca como instancias herdeiras de Contas;
 - Implementamos os metodos sacar, depositar, transferir, imprimir saldo, imprimir extrato, imprimir lista de contas;

Para viabilizar também foram criadas as entidades que julgamos importante para o modelo proposto:
 - Clientes: com o atributo nome;
 - Banco: com um ArrayList das contas criadas;
 - Transacao: com data, valor e nome da transacao feita na conta;
