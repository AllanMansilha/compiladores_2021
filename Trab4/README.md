# Trabalho 4

Este diretório corresponde ao Trabalho 4 da matéria de Construção de Compiladores, oferta 2021/01

# Membros do grupo

- Allan Mansilha Cidreira, RA: 760565
- Amanda Peixoto Manso, RA: 759847
- Alisson Hayasi da Costa, RA: 726494

#### Descrição da linguagem

A linguagem Batalhas é um modelo simplifificado de uma batalha Pokemon. Nela podem ser acrecentados os Pokemon do seu time com o nome, o tipo e a vida deles; o pokemon adversário, com os mesmos atributos, e o comando que representa a ação do que voce deve fazer nessa batalha( lutar, trocar de pokemon ou fugir ). As principais regras semânticas são: O primeiro pokemon da equipe precisa ter vida para atacar, precisa ter um pokemon na equipe para trocar e precisa de um pokemon na equipe para enfrentar um selvagem. 

![image](https://user-images.githubusercontent.com/40667726/143663194-f61e1d46-b0bb-4c80-aa51-593931359b83.png)


#### Como utilizar a linguagem

Exemplo de como implementar sua batalha:
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
# Como instalar

No compilador, escrever o comando:
```
java -j /caminho/completo/do/compilador/Trab4/target/Trab4-1.0-SNAPSHOT-jar-with-dependencies.jar /caminho/do/codigo/codigo.txt /caminho/para/saida/saida.html
```

Exemplo:

```
java -j /home/fulano/Downloads/Trab4/target/Trab4-1.0-SNAPSHOT-jar-with-dependencies.jar /home/fulano/Desktop/codigo.txt /home/fulano/Desktop/saida.html
```


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

