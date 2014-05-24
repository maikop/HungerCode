grammar hunger;

kood
    :   lause 
    ;
lause
	:   newRecipe
	| 	newFood
	|   omistamine
	|   defineerimine
	|	recipeName
	;

newRecipe
    :   'newRecipe' '(' recipeName (',' String)+ (',' 'servings' '=' Number)? (',' 'star' '=' Number)? ')'
    ;
    
newFood
    :   'newFood' '(' String (',' String)* ('False' | 'True')? ')'
    ;

omistamine
	:   (String|kilogram) '=' Number ('kg'|'g'|'mg')
	|   (String|piece) '=' Number 'pc'
	|   (String|litre) '=' Number ('l'|'dl'|'ml')
 	;
defineerimine
	:   kilogram
	|   litre
	|   piece
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