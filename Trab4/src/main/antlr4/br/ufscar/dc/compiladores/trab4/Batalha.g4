grammar Batalha;

// Inicio do programa
BATALHA: 'batalha';

// Categoria da classe de açoes
POKEMON: 'pokemon';
SELVAGEM: 'selvagem';
MENSAGEM: 'mensagem';

// Números inteiros indicam valores de nível e vida
NUM_INT	: ('0'..'9')+;

// Nomes dos pokemons formados por cadeias de caracteres
CADEIA : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z' | ' ')*;

fragment
ESC_SEQ	: '\\\'';
COMENTARIO : '{' ~('\n'|'\r'|'}')* '}' {skip();};
WS : ( ' ' | '\t' | '\r' | '\n') {skip();};

// Separação entre itens e classes
VIRGULA: ',';
DOISPONTOS: ':';

// Verificação de erros
ERRO: .;

lista_batalha: 'batalha' lista_pokemon lista_selvagem mensagem_final <EOF>;
lista_pokemon: 'pokemon' item+;
lista_selvagem: 'selvagem' item+;
mensagem_final: 'mensagem' acao;

item: tipo nome ',' nivel ',' vida;
tipo: ('fogo' | 'agua' | 'grama');
acao: ('lutar' | 'fugir' | 'trocar para' nome);
nome: CADEIA;
nivel: NUM_INT;
vida: NUM_INT;