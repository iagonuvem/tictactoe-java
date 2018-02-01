# Jogo da Velha em Java
Trabalho de Programação de Computadores II, da Universidade Federal de Ouro Preto

**Autor: Iago Nuvem**

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

É a classe onde ocorre o jogo propriamente dito, ela tem como atributos:

*	Nome do Jogador 1 (NomeJogador1) – String

*	Nome do Jogador 2 (NomeJogador2) – String

*	Condição do Jogador 1, realizador da jogada atual ou não (jog1Ativ) – Boolean

*	Condição do Jogador 2, realizador da jogada atual ou não (jog2Ativ) - Boolean

E tem como métodos:

*	Métodos Construtores (get)

*	Métodos Modificadores (set)

*	*zeraTabuleiro()* – Limpa o Tabuleiro do jogo, chamado após acabar uma partida.

*	*JogadorVencedor(String Jogador)*- Verifica Linhas, Colunas e Diagonais para saber se há algum ganhador na partida, caso haja algum ganhador, chama a função Vencedor(int JogadorVencedor) para exibir uma mensagem e reiniciar o jogo.

*	*JogadorAtivo()* – Seta o jogador que realizara a jogada atual, e após isso chama a função JogadorVencedor() para verificar se há algum vencedor, antes de prosseguir para a próxima rodada.

*	*Vencedor(int JogadorVencedor)* – Exibe uma mensagem de acordo com o caso e reinicia o tabuleiro, sendo que são 3 possíveis casos: 
	*	0 : empate
	*	1 : Jogador 1 venceu
	*	2 : Jogador 2 venceu 

