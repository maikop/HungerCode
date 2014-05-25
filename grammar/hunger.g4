grammar hunger;

kood
    :   (lause ';')+ 
    ;
lause
	:   newRecipe
	| 	newFood
	|   omistamine
	|   defineerimine
	|	recipeName
	;

newRecipe
    :   'newRecipe' '(' recipeName (',' omistamine)+ (',' 'servings' '=' Number)? (',' 'star' '=' Number)? ')'
    ;
    
newFood
    :   'newFood' '(' String (',' String)* (',' ('False' | 'True'))? ')'
    ;

omistamine
	:   (String) '=' Number ('kg'|'g'|'mg')
	|   (String) '=' Number 'pc'
	|   (String) '=' Number ('l'|'dl'|'ml')
 	;
defineerimine
	:   kilogram '=' Number ('kg'|'g'|'mg')
	|   piece '=' Number 'pc'
	|   litre '=' Number ('l'|'dl'|'ml')
	;
kilogram
	:   'Kilogram' String
	|   'Gram' String
	|   'Milligram' String
	;

litre
    :   'Litre' String
    |   'Decilitre' String
    |   'Millilitre' String
    ;
piece
    :   'Piece' String
    ;
recipeName
    :   '"' String '"'
    ;
Number
    :   ('0'|[1-9][0-9]*)('.'[0-9]+)?
    ;

String
    :   [a-zA-Z][0-9a-zA-Z]+
    ;

Whitespace
    :   [ \t\r\n]+ -> skip
    ;
