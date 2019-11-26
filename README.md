# Prova Trabalho - POO II
Você tem acompanhado a quantidade de queimadas que temos visto ultimamente? Com estes acontecimentos, alguns pesquisadores estão cada vez mais relatando dados sobre as queimadas. Nesta prova-trabalho você deverá ler os dados das queimadas disponível no Google Classroom. Um arquivo contém as informações do data set e outro arquivp contém o data set propriamente dito.

Você deverá criar um código OO que armazene as informações sobre cada queimada. Deverá portanto fazer a leitura do data set instanciando os objetos. As queimadas são classificadas de acordo com a área de acontecimento, veja o diagrama abaixo:

![image](https://github.com/guilhermeqbs/BSI-forest-fires/blob/master/Diagrama.png)

Para cada queimada, você deverá armazená-la em um Pilha do mês correspondente. Sendo portanto 12 pilhas existentes no seu código. Você se lembra do Tipo Abstrato de Dados Pilha? Pilha é uma estrutura de dados do tipo LIFO(Last-In-First-Out) em que o último elemento a entrar é o primeiro a sair. Por definição as operações básicas de uma pilha são empilhar e desempilhar. Nesta prova-trabalho você não poderá usar Queue existente de Java, implementando sua própria.

Quando tiver todos os objetos em memória separados pelas pilhas mensais, faça um relatório (pode ser um print) do resultado encontrado por mês. Observe se algo a mais pode ser classificado ou avaliado nos seus dados.

# Critérios de avaliação:

a) Uso de uma interface PilhaTAD que garanta as duas operações básicas de empilhar e desempilhar como comportamento da classe da letra 'b'.

b) Uso de uma classe Pilha para representar o TAD e que implemente a interface da letra 'a'.

c) Uso de exceções próprias que podem ocorrer na classe Pilha.

d) Uso correto de visibilidade dos atributos, métodos, de contrutores, interface, herança, polimorfismo e classe abstrata, se forem o caso.

e) Uso de alocação dinâmica.
