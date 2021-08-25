lexer grammar LingA;

PALAVRA_CHAVE	:	'declare' | 'algoritmo' | 'inteiro' | 'literal' | 'real' | 'logico' | 'atribuir' | 'leia' | 'imprimir' | 'se' | 'entao' 
	| 'enquanto' | 'inicio' | 'fim_algoritmo' | 'fim_se' | 'registro' | 'fim_registro';

NUMINT	: ('+'|'-')?('0'..'9')+
	;
NUMREAL	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;
IDENT : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	 ;

CADEIA 	: '"' ( '""' | ~["] )* '"';
	
COMENTARIO
    :   '{' ~('\n'|'\r')* '\r'? '\n' {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '=' | 'ou' | 'e'
	;
OP_ARIT	:	'+' | '-' | '*' | '/'
	;
DELIM	:	':'
	;
ABREPAR :	'('
	;
FECHAPAR:	')'
	;
VIRGULA: ','
	;

