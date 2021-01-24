grammar Nginx;

nginx: stat* ;



stat: upstreamDirective  # UpstreamBlock
    | contextDirective   # ContextBlock
    | serverDirective   # ServerBlock
    | ifDirective      #ifBlock
    | includeDirective # IncludeBlock
    | locationDirective # LocationBlock
    | value block # ValueBlock
    | value value+ block  # ValuesBlock
    | value+ ';'     # Values
    ;
    
ifDirective: 'if' .*?  block;
locationDirective: 'location' '=' value block    #EqualLocation
                 |  'location' '^~' value block  #HeadRegexLocation 
                 |  'location' '~*' value block  #ICaseRegexLocation
                 |  'location' '~' value block   #RegexLocation
                 | 'location' value block        #NormalLocation
                      ;
upstreamDirective: 'upstream' ID block ;
contextDirective: context=('server'|'http') block ;
includeDirective: 'include' value ';' ;
serverDirective: 'server' value+ ';' ;
//typesDirective: 'types' block ;


value: ID;


block: '{' stat* '}' ;

ID: (~[ \t\n\r;{}])+;
fragment LETTER : [a-zA-Z] ;
WS  :   [ \t\n\r]+ -> skip ;


COMMENT: '#' .*? '\n' -> skip ;

