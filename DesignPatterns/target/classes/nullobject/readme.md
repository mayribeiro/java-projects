Padrao comportamental

Resolução:

Ele irá ilustrar como com o uso da herança é possível "enganar” o
código que utiliza a classe, introduzindo um novo comportamento que irá eliminar
a necessidade do uso de condicionais.

Proposta:

O padrão Null Object [27] propõe a criação de uma classe para representar
objetos nulos em uma aplicação. Essa classe deve estender a classe original e implementar
seus métodos de forma a executar o comportamento esperado da aplicação
quando um valor nulo for recebido. Dessa forma, em vez de se retornar um valor
nulo, retorna-se uma instância dessa nova classe.

Objetivo:
Elimar nullpointers no codigo