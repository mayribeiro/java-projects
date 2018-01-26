Nao foi colocado no Gof


Resolução:

Essa prática é muito utilizada em frameworks para permitir que as aplicações
possam especializar seu comportamento para seus requisitos. Nesse caso, o framework
provê algumas classes com hook methods que precisam ser especializadas
pela aplicação. Sendo assim, a aplicação deve estender essa classe e implementar o
hook method de forma a inserir o comportamento específico de seu domínio.

Muitas pessoas nesse ponto podem estar achando que Hook Methods
e o padrão Template Method são a mesma coisa. A grande diferença
é que osHookMethods são uma técnica para permitir a extensão de comportamento
e o Template Method, como um padrão, é uma solução
para um problema mais específico. Seria correto dizer que o Template
Method utiliza Hook Methods em sua solução. O que é importante perceber
é que o conceito deHookMethod émais geral e inclusive é utilizado
por outros padrões que serão vistos mais à frente nesse livro.