grammar LingA;

NUM_INT	: ('+'|'-')?('0'..'9')+
	;
NUM_REAL	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;

CADEIA 	: '"' ( ESC_SEQ | ~('\''|'\\'|'\n'|'\r') )+? '"';
fragment
ESC_SEQ	: '\\\'';

COMENTARIO
    :   '{' ~('\n'|'\r'|'}')*  '}'?  {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;

IDENT : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	 ;


CADEIA_ERRADA: ('"') ~('"')* ('\n'|'\r');

COMENTARIO_ERRADO:   '{' ~('}')* '\n';

ERRO: .;

programa: declaracoes 'algoritmo' corpo 'fim_algoritmo'EOF;

declaracoes: (decl_local_global)*;

decl_local_global: declaracao_local | declaracao_global;

declaracao_local: 
	'declare' variavel 
	| 'constante' IDENT ':' tipo_basico '=' valor_constante 
	| 'tipo' IDENT ':' tipo;

variavel: identificador (',' identificador)* ':' tipo;

identificador: IDENT ('.' IDENT)* dimensao;

dimensao: ('[' exp_aritmetica ']')*;

tipo: registro | tipo_estendido;

tipo_basico: 'literal' | 'inteiro' | 'real' | 'logico';

tipo_basico_ident: tipo_basico | IDENT;

tipo_estendido: ('^')? tipo_basico_ident;

valor_constante: CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso';

registro: 'registro' (variavel)* 'fim_registro';

declaracao_global: 
	'procedimento' IDENT '(' (parametros)? ')' (declaracao_local)* (cmd)* 'fim_procedimento'
	| 'funcao' IDENT '(' (parametros)? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao'
	;

parametro: ('var')? identificador (',' identificador)* ':' tipo_estendido;

parametros: parametro (',' parametro)*;

corpo: (declaracao_local)* (cmd)*;

cmd: cmdleia | cmdescreva | cmdse | cmdcaso | cmdpara| cmdenquanto | cmdfaca | cmdatribuicao | cmdchamada | cmdretorne;

cmdleia: 'leia' '(' ('^')? identificador (',' ('^')? identificador)* ')';

cmdescreva: 'escreva' '(' expressao (',' expressao)* ')';

cmdse: 'se' expressao 'entao' (cmd)* ('senao' (cmd)*)? 'fim_se';

cmdcaso: 'caso'exp_aritmetica 'seja' selecao ('senao' (cmd)*)? 'fim_caso';

cmdpara: 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' (cmd)* 'fim_para';

cmdenquanto: 'enquanto' expressao 'faca' (cmd)* 'fim_enquanto';

cmdfaca: 'faca' (cmd)* 'ate' expressao;

cmdatribuicao: ('^')? identificador '<-' expressao;

cmdchamada: IDENT '(' expressao (',' expressao)* ')';

cmdretorne: 'retorne' expressao;

selecao: (item_selecao)*;

item_selecao: constantes ':' (cmd)*;

constantes: numero_intervalo (',' numero_intervalo)*;

numero_intervalo: (op_unario)? NUM_INT ('..' (op_unario)? NUM_INT)?;

op_unario: '-';

exp_aritmetica: termo (op1 termo)*;

termo: fator (op2 fator)*;

fator: parcela (op3 parcela)*;

op1: '+' | '-';

op2: '*'|'/';

op3: '%';

parcela: (op_unario)? parcela_unario | parcela_nao_unario;

parcela_unario: ('^')? identificador | IDENT '(' expressao (',' expressao)* ')'| NUM_INT | NUM_REAL | '(' expressao ')';

parcela_nao_unario: '&' identificador | CADEIA;

exp_relacional: exp_aritmetica (op_relacional exp_aritmetica)?;

op_relacional: '>' | '>=' | '<' | '<=' | '<>' | '=';

expressao: termo_logico (op_logico_1 termo_logico)*;

termo_logico: fator_logico (op_logico_2 fator_logico)*;

fator_logico: ('nao')? parcela_logica;

parcela_logica: ('verdadeiro' | 'falso') | exp_relacional;

op_logico_1: 'ou';

op_logico_2: 'e';