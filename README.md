# RefatoramentoComPadroes-P3

### Ao todo, fiz quatro mudanças:
##### Remoção de Smell com uso do Inline Method - alguns conjuntos de if e else que foram substituidos por um ternário, aplicando assim o Inline Method.
No arquivo Veiculos(SMELL) temos os métodos Cima(), Baixo(), Esquerda() e Direita(), cada um desses métodos tem um if e um else, que foram substituidos por um ternário nos arquivos do Command(CLEAR), aplicando assim o Inline Method.
###### Extract Method - O Método construtor da classe Mundo(SMELL) ´é muito grande, e alguns métodos foram extraídos para facilitar o entendimento.
Em particular os métodos addVehic() e showMap() (CLEAR) foram extraidos e estão disponíveis no projeto (CLEAR).
###### Uso do Strategy, para gerar uma matriz de cores - que ficará responsável por printar o mapa que será mostrado na tela.
Na Construtor Mundo() (SMELL) temos um for para desenhar o mapa, e para cada valor de uma matriz, seria printado uma cor no console - Apliquei então o Strategy para gerar uma matriz de cores e portanto, removendo todo o condicional por meio do strategy e polimorfismo(CLEAR), o Strategy está no pacote Strategy.
###### Uso do Command, para movimentar os diversos tipos de veículos que estão dispostos no mapa.
Na Classe Veiculos (SMELL), temos vários métodos que representam o movimento dos veículos, oportunidade perfeita para usar o Command e remover os métodos desnecessários - implementando assim no (CLEAR) as classes para movimentar o veiculo, reduzindo também condicionais no método Move() presente na classe Veiculos(SMELL) para atribuir o movimento correto ao veiculo - o Command(CLEAR) está no pacote Command.
