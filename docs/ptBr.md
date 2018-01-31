# Jogo da Velha em Java
Trabalho de Programação de Computadores II, da Universidade Federal de Ouro Preto
*Autor: Iago Nuvem*

## Telas
O jogo possui apenas duas telas, uma tela de "Login", onde os jogadores inserem seus nomes e a tela principal, onde ocorre o jogo própriamente dito

## Classes

O jogo é dividido em 3 classes:

* *JogoDaVelha* 

* *TelaInicio* 

* *main*

### Classe **JogoDaVelha**

É a classe mais simples e apenas instancia a classe [**TelaInicio**](https://github.com/iagonuvem/tictactoe-java/blob/master/docs/ptBr.md#classe-telainicio) e a exibe na tela, dando inicio ao jogo.

### Classe **TelaInicio**

É a classe da tela de inicio, nela existe apenas uma função, do tipo void, *no evento "clique" do botão "começar"*, que Instancia a [**classe principal**](https://github.com/iagonuvem/tictactoe-java/blob/master/docs/ptBr.md#classe-telainicio) do jogo, passando como parâmetros de construção as informações digitadas pelos jogadores.

### Classe **main** 

É a classe onde ocorre o jogo propriamente dito, ela recebe como parâmetro de construção:

* Nome do Jogador 1 *(NomeJogador1)* - **String**
* Nome do Jogador 2 *(NomeJogador2)* - **String**
