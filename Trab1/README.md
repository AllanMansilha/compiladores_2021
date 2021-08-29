# Trabalho 1 

Este diretório corresponde ao Trabalho 1 da matéria de Construção de Compiladores, oferta 2021/01

## Membros do grupo
- Allan Mansilha Cidreira, RA: 760565
- Amanda Peixoto Manso,    RA: 759847
- Alisson Hayasi da Costa  RA: 726494

## Requerimentos

Para executar esse programa, é necessário que a máquina tenha:
- Java 1.8+
- Maven 3.6.2+

Este projeto foi realizado na plataforma NetBeans, requerindo os plugins:
- `antlr4-maven-plugin 4.7.2`
- `maven-assembly-plugin`
Além da dependência:
- `antlr4 4.7.2`

Para ver mais sobre os plugins e dependências, consulte o arquivo pom.xml na pasta principal.

## Compilação
### No terminal:
Na aba do projeto principal, a compilação (build) é realizado com o comando `mvn compile`.
### No NetBeans:
1. Abrir, no NetBeans, o projeto "Trab1"
2. Selecionar a opção build, clicando com o botão esquedo do mouse no nome do projeto
3. Aguarde o carregamento e o projeto será compilado

## Execução
1. Verificar o caminho completo para o arquivo `Trab1-1.0-SNAPSHOT-jar-with-dependencies.jar` - caminho1;
2. Verificar o caminho completo para o arquivo de entrada (código a ser compilado) - caminho2;
3. Verificar o caminho completo para o arquivo de saída (onde estarão os tokens ao final da compilação) - caminho3;
4. Com os caminhos verificados, executar no terminal o comando: `java -jar caminho1/Trab1-1.0-SNAPSHOT-jar-with-dependencies.jar caminho2/arquivo_de_entrada.txt caminho3/arquivo_de_saida.txt`
