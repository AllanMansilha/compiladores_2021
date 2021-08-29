# Trabalho 1 

Este diretório corresponde ao Trabalho 1 da matéria de Construção de Compiladores

## Grupo
- Allan Mansilha Cidreira, RA: 760565
- Amanda Peixoto Manso,    RA: 759847
- Alisson Hayasi da Costa  RA: 726494

## Dependencias
Este projeto foi feito com Java utilizando Maven, para isso é necessário:
- Java 1.8 ou mais recente
- Maven 3.6.2 ou mais recente

Para executar esse programa é necessário as seguintes dependencias:
- antlr4 4.7.2

e os seguintes Plugins:
- antlr4-maven-plugin 4.7.2
- maven-assembly-plugin

# Roteiro
## Compilação
Tendo o projeto configurado, basta executar o comando `mvn compile` na pasta do projeto

## Execução
Localizar os arquivo:
	`Trab1-1.0-SNAPSHOT-jar-with-dependencies.jar`
	E o arquivo de entrada com um código em linguagem LA 

Para executar o programa use o seguinte comando:\
`java -jar caminho/Trab1-1.0-SNAPSHOT-jar-with-dependencies.jar caminho/arquivo_de_entrada.txt caminho/arquivo_de_saida.txt`

A saida será um arquivo localizado no diretório alvo com o nome fornecido
