grammar Batalha;

PalavrasChave:
    'nome' | 'tipo' | 'nivel' | 'vida' | 'lutar' | 'trocar' | 'fugir' |  
    'pokemon equipe' | 'fim equipe' | 'pokemon selvagem' | 'fim selvagem';

// Separação entre itens e classes
VIRGULA: ',';
DOISPONTOS: ':';

Abre: 
    '(';

Fecha: 
    ')';

Tipo: ('fogo' | 'agua' | 'grama');

// Nomes dos pokemons formados por cadeias de caracteres
Nome : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z' | ' ')*;


// Números inteiros indicam valores de nível e vida
Vida : ('0'..'9')+;

fragment
ESC_SEQ	: '\\\'';
COMENTARIO : '{' ~('\n'|'\r'|'}')* '}' {skip();};
WS : ( ' ' | '\t' | '\r' | '\n') {skip();};


// Verificação de erros
ERRO: .;

// Inicio do programa
programa: corpo <EOF>;

corpo: declaracao_equipe+ declaracao_selvagem acao+;

declaracao_equipe:
    'pokemon equipe'
        'nome' ':' Nome ','
        'tipo' ':' Tipo ','
        'vida' ':' Vida ','
    'fim equipe';

declaracao_selvagem:
    'pokemon selvagem'
        'nome' ':' Nome ','
        'tipo' ':' Tipo ','
        'vida' ':' Vida ','
    'fim selvagem';

acao:
    cmdLutar | cmdTrocar | cmdFugir;
    
cmdLutar:
    'Lutar' '(' Nome ')';
    
cmdTrocar:
    'Trocar' '(' Nome ')';
    
cmdFugir:
    'Fugir';


