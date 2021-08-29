lexer grammar LingA;

PALAVRA_CHAVE	:	'verdadeiro'| 'falso'| 'var'|'tipo'|'nao'|'e'|'ou'|'fim_funcao'|'funcao'| 'fim_procedimento'|'procedimento' | 'constante'| 'declare' | 'algoritmo' | 'inteiro' | 'literal' | 'real' | 'logico' | 'atribuir' | 'leia' | 'imprima' | 'se' | 'entao' | 'enquanto' | 'inicio' | 'fim_algoritmo' | 'fim_se' | 'registro' | 'escreva'| 'fim_registro' | 'caso' | 'fim_caso' | 'seja' | 'senao' | 'faca' | 'ate' | 'para' | 'fim_para' | 'fim_enquanto' | 'retorne' ;

NUM_INT	: ('0'..'9')+
	;
NUM_REAL	: ('0'..'9')+ ('.' ('0'..'9')+)?
	;
IDENT : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	 ;


CADEIA 	: '"' ( ESC_SEQ | ~('\''|'\\'|'\n'|'\r') )+? '"';
fragment
ESC_SEQ	: '\\\'';
	
COMENTARIO
    :   '{' ~('\n'|'\r')* '}' {skip();};

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '=' | '<-' | '&'
	;
OP_ARIT	:	'+' | '-' | '*' | '/' | '%' | '^'
	;
DELIM	:	':'
	;
ABREPAR :	'('
	;
FECHAPAR:	')'
	;
VIRGULA: ','
	;
INTERVALO: '..'
	;
PONTO: '.';

ABRE_CHAVE: '[';

FECHA_CHAVE: ']';

CADEIA_ERRADA: ('"') ~('"');

COMENTARIO_ERRADO:   '{' ~('}');

ERRO: .;