# Trabalho 4

Este diretório corresponde ao Trabalho 4 da matéria de Construção de Compiladores, oferta 2021/01

# Membros do grupo

- Allan Mansilha Cidreira, RA: 760565
- Amanda Peixoto Manso, RA: 759847
- Alisson Hayasi da Costa, RA: 726494

#### Descrição da linguagem

A linguagem Batalhas é um modelo simplifificado de uma batalha Pokemon. Nela podem ser acrecentados os Pokemon do seu time com o nome, o tipo e a vida deles; o pokemon adversário, com os mesmos atributos, e o comando que representa a ação do que voce deve fazer nessa batalha( lutar, trocar de pokemon ou fugir ). As principais regras semânticas são: O primeiro pokemon da equipe precisa ter vida para batalhar, apenas o primeiro pokemon da equipe pode atacar, precisa ter pelo menos dois pokemon na equipe para trocar e o pokemon a ser escolhido na troca precisa ter mais que 0 de vida. 

![image](https://user-images.githubusercontent.com/40667726/143663194-f61e1d46-b0bb-4c80-aa51-593931359b83.png)


#### Como utilizar a linguagem
Exemplo de como declarar os pokemons da sua equipe e selvagens:

```
pokemon equipe
    nome: <nome do pokemon>,    
    tipo: <tipo do pokemon>,
    vida: <vida do pokemon>,
fim equipe

pokemon equipe
    nome: <nome do pokemon>,
    tipo: <tipo do pokemon>,
    vida: <vida do pokemon>,
fim equipe

pokemon selvagem
    nome: <nome do pokemon>,
    tipo: <tipo do pokemon>,
    vida: <vida do pokemon>,
fim selvagem
```

Existem 3 ações que o pokémon pode realizar **Lutar**, **Trocar**, **Fugir**. 
Para lutar, você deve escolher o comando lutar e o nome do primeiro pokemon da equipe.

```
Lutar(<nome do pokemon>)
```
Para trocar, você deve escolher o comando trocar e o nome do pokemon da equipe que entrará em campo.
```
Trocar(<nome do pokemon>)
```
Para fugir, basta escrever fugir.
```
Fugir
```

#### Exemplo de como implementar sua batalha completa:
```
pokemon equipe
    nome: piplup,    
    tipo: agua,
    vida: 8,
fim equipe

pokemon equipe
    nome: charmander,
    tipo: fogo,
    vida: 15,
fim equipe

pokemon selvagem
    nome: ninjask,    
    tipo: grama,
    vida: 15,
fim selvagem

Lutar(piplup)
```
 
# Como executar

No compilador, escrever o comando:
```
java -j /caminho/completo/do/compilador/Trab4/target/Trab4-1.0-SNAPSHOT-jar-with-dependencies.jar /caminho/do/codigo/codigo.txt /caminho/para/saida/saida.html
```

Exemplo:

```
java -j /home/fulano/Downloads/Trab4/target/Trab4-1.0-SNAPSHOT-jar-with-dependencies.jar /home/fulano/Desktop/codigo.txt /home/fulano/Desktop/saida.html
```

# Video explicativo

https://youtu.be/18d_YKUH0M8

# Requerimentos

Para executar esse programa, é necessário que a máquina tenha:

- Java 1.8+
- Maven 3.6.2+

Este projeto foi realizado na plataforma NetBeans, requerindo os plugins:

`antlr4-maven-plugin 4.7.2`
`maven-assembly-plugin` 

Além da dependência:
`antlr4 4.7.2`

Para ver mais sobre os plugins e dependências, consulte o arquivo pom.xml na pasta principal.

© 2021 Pokémon. © 1995–2021 Nintendo/Creatures Inc./GAME FREAK inc. Pokémon, os nomes dos personagens Pokémon, Nintendo Switch, Nintendo 3DS, Nintendo DS, Wii, Wii U e WiiWare são marcas da Nintendo.
