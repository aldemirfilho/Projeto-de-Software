# Projeto-de-Software

Descrição Projeto Isoccer

⦁	Funcionalidades:
	-  Administração do sistema é realizada através de um login e senha, colocando-se como usuario: admin, e a senha é gerada aleatoriamente sendo 
  um numero de 3 a 4 digitos;
	-  Adição de membros ao sistema, incluindo funcionários de serviços gerais a funcionarios ligados diretamente à atuacão do time, 
  detalhando os dados vinculados a cada trabalhador. Foi feito criando as classes referentes a cada tipo atuante, sendo todas herdeiras
  da classe funcionario, a qual possui atributos em comum a todas as outras, atuando em conjunto tambem com a interface, predefinindo 
  funcoes em comum as classes, com o envolvimento de polimorfismo, importante tambem destacar, que caracteristicas além da classe funcionário 
  foram declaradas na classe referente ao funcionario em questão e "setadas", na função de preenchimento do funcionário;
	-  Adição de sócio-torcedores, assim como detalhes incluindo sua adimplencia ou inadimplencia, a edicao de tais dados sempre é baseada no tipo 
  de torcedor, verificando qual tipo de torcedeor e oq será mudado, atualizando depois todo este grupo, percorendo todo o array list.
  -  Possibilidade de gerenciamento dos recursos fisicos. Os mesmos podem ser criados e acumulados aos bens do clube, assim como detalhado
  seus atributos e estados de disponibilidade. Foi criado a classe de cada tipo de recurso, envolvendo nela as funcoes necessárias para execução 
  das necessidades surgidas, as quis atuam com a inserção dos dados e os mesmos saõ salvos e atribuidos ao recurso em questão;
  -  Relatórios acerca das atividades execultadas no clube, envolvendo os funcionarios, os torcedores e os recursos físicos. Foi feito uma varredura
  em todos os individouos, assim como recursos e torcedores, afim de apresentar todas as informacoes acerca do que foi desejado pelo usuario, as 
  informações de trabalhadores, recursos e torcedores ficavam todas armazenadas em array lists, bastando apenas verificar e exibir ao usuário..
 
  ⦁Classes:
  -  Funcionário:
      - Motivação: Foi de muita importancia a criação de tal classe pois trata-se de uma classe abstrata, além disso uma classe mãe de varias outras, 
      nesta são envolvidas todas as variáveis comum a todas as outras classes, às quais são herdeiras de todo esse conteudo em comum. Assim, facilitando
      o acesso e diminuindo a repetição de partes de código. Fazendo com que diminua uma quantidades significativa de trabalho;
      - Solução: Usar este tipo de classe me trouxe como solução evitar o conflito entre as varias variaveis que teria sido necesário caso não existisse
      a mesma, evitando a repetição de muitos trechos, os quais essa prática poderia levar a possiveis erros no futuro. Faz com que haja economia de memória,
      pois poupa o gasto que seria necessario para criar todas as outras variáveis. Esta classe ainda é responsavel pela exibição dos funcionarios gerais, a
      qual contem uma função que executa uma varredura e mostra ao usuário os detalhes de cada trabalhador.
      - Vantagens: Foi poupado tempo durante a criação do código, pois como dentre as soluçoões estão a herança, a criação dsta classe compartilha suas variáveis
      para com suas herdeiras. Outra vantagem seria poupar memória, pela não criação excessiva de variáveis, importante tambem por ela ser abstrata, garantindo 
      que minhas variáveis so sejam preenchidas quando solicitadas em suas classes.
      - Desvantagens: 
      
  -  Presidente:
      - Motivação: Trata-se de uma extensão da classe Funcionário, contendo apenas as variáveis ja existentes pela sua classe mãe, assim, sua criação
      foi necessária pela questao de armazenar os dados do presidente, para posteriormente lançar o conteudo estabelecido no array list de funcionários.
      - Solução: Armazenar as informacoes ligadas ao presidente da empresa, assim como contém uma função para criar o presidente, armazenar os dados e lançar o mesmo.
      - Vantagens: Conseguir armazenar e ultilizar a função da forma necessária e de forma breve, graças a herança de funcionario e sua simples funcao de criar o presidente,
      sendo de fácil uso, criação e manutenção.
      - Desvantagens:
      
  -  Médico:
      - Motivação: Trata-se de uma extensão da classe Funcionário, contendo as variáveis ja existentes pela sua classe mãe e acrescida apenas da variável crm, assim, sua criação
      foi necessária pela questao de armazenar os dados do médico, para posteriormente lançar o conteudo estabelecido no array list de funcionários.
      - Solução: Armazenar as informacoes ligadas ao médico da empresa, assim como contém uma função para criar o médico, armazenar os dados e lançar o mesmo.
      - Vantagens: Conseguir armazenar e ultilizar a função da forma necessária e de forma breve, graças a herança de funcionario e sua simples funcao de criar o medico,
      sendo de fácil uso, criação e manutenção.
      - Desvantagens:
      
  -  Tecnico:
      - Motivação: Trata-se de uma extensão da classe Funcionário, contendo apenas as variáveis ja existentes pela sua classe mãe, assim, sua criação
      foi necessária pela questao de armazenar os dados do tecnico, para posteriormente lançar o conteudo estabelecido no array list de funcionários.
      - Solução: Armazenar as informacoes ligadas ao tecnico da empresa, assim como contém uma função para criar o tecnico e mostrar ao usuário os atributos do mesmo, 
      armazenar os dados e lançar os dados.
      - Vantagens: Conseguir armazenar e ultilizar a função da forma necessária e de forma breve, graças a herança de funcionario e sua simples funcao de criar o tecnico,
      sendo de fácil uso, criação e manutenção.
      - Desvantagens:
      
  -  Preparador:
      - Motivação: Trata-se de uma extensão da classe Funcionário, contendo apenas as variáveis ja existentes pela sua classe mãe, assim, sua criação
      foi necessária pela questao de armazenar os dados do preparador, para posteriormente lançar o conteudo estabelecido no array list de funcionários.
      - Solução: Armazenar as informacoes ligadas ao preparador do time, assim como contém uma função para criar o preparador, armazenar os dados e lançar o mesmo.
      - Vantagens: Conseguir armazenar e ultilizar a função da forma necessária e de forma breve, graças a herança de funcionario e sua simples funcao de criar o funcionario,
      sendo de fácil uso, criação e manutenção.
      - Desvantagens:
      
   -  Motorista:
      - Motivação: Trata-se de uma extensão da classe Funcionário, contendo as variáveis ja existentes pela sua classe mãe acrescido do numero de habilitação, assim, sua criação
      foi necessária pela questao de armazenar os dados do motorista, para posteriormente lançar o conteudo estabelecido no array list de funcionários.
      - Solução: Armazenar as informacoes ligadas ao motorista do time, assim como contém uma função para criar o motorista, armazenar os dados e lançar o mesmo.
      - Vantagens: Conseguir armazenar e ultilizar a função da forma necessária e de forma breve, graças a herança de funcionario e sua simples funcao de criar o funcionario,
      sendo de fácil uso, criação e manutenção.
      - Desvantagens:   
      
   -  Cozinheiro:
      - Motivação: Trata-se de uma extensão da classe Funcionário, contendo as variáveis ja existentes pela sua classe mãe, assim, sua criação
      foi necessária pela questao de armazenar os dados do Cozinheiro, para posteriormente lançar o conteudo estabelecido no array list de funcionários.
      - Solução: Armazenar as informacoes ligadas ao Cozinheiro do time, assim como contém uma função para criar o Cozinheiro, armazenar os dados e lançar o mesmo.
      - Vantagens: Conseguir armazenar e ultilizar a função da forma necessária e de forma breve, graças a herança de funcionario e sua simples funcao de criar o funcionario,
      sendo de fácil uso, criação e manutenção.
      - Desvantagens:       
      
   -  Advogado:
      - Motivação: Trata-se de uma extensão da classe Funcionário, contendo as variáveis ja existentes pela sua classe mãe, assim, sua criação
      foi necessária pela questao de armazenar os dados do Advogado, para posteriormente lançar o conteudo estabelecido no array list de funcionários.
      - Solução: Armazenar as informacoes ligadas ao Advogado do time, assim como contém uma função para criar o Advogados, armazenar os dados e lançar o mesmo.
      - Vantagens: Conseguir armazenar e ultilizar a função da forma necessária e de forma breve, graças a herança de funcionario e sua simples funcao de criar o funcionario,
      sendo de fácil uso, criação e manutenção.
      - Desvantagens:   
      
  -  Seguraça:
      - Motivação: Trata-se de uma extensão da classe Funcionário, contendo as variáveis ja existentes pela sua classe mãe, assim, sua criação
      foi necessária pela questao de armazenar os dados do Seguraça, para posteriormente lançar o conteudo estabelecido no array list de funcionários.
      - Solução: Armazenar as informacoes ligadas ao Seguraça do time, assim como contém uma função para criar o Seguraça, armazenar os dados e lançar o mesmo.
      - Vantagens: Conseguir armazenar e ultilizar a função da forma necessária e de forma breve, graças a herança de funcionario e sua simples funcao de criar o funcionario,
      sendo de fácil uso, criação e manutenção.
      - Desvantagens:   
      
 -  Jogador:
      - Motivação: Trata-se de uma extensão da classe Funcionário, contendo as variáveis ja existentes pela sua classe mãe, a posição qual joga como tambem se está apto ou 
      inapto para jogar, assim, sua criação foi necessária pela questao de armazenar os dados do Jogador, para posteriormente lançar o conteudo estabelecido no array list de funcionários.
      - Solução: Armazenar as informacoes ligadas ao Jogador do time, assim como contém uma função para criar o Jogador, outra para exibir ao usuario os dados do jogador, e outra a qual 
      exibe os jogadores aptos e inaptos. E assim armazenar os dados e lançar o mesmo.
      - Vantagens: Conseguir armazenar e ultilizar a função da forma necessária e de forma breve, graças a herança de funcionario e sua simples funcao de criar o funcionario,
      sendo de fácil uso, criação e manutenção.
      - Desvantagens:   
      
 -  Torcedor:
      - Motivaçãoa: Deixar os torcedores separados de funcionarios, para trata-los e organizar seus atributos;
      - Soluçao: Organizou os torcedores em tipos, deixando bem mais facil a questao de editar as taxas, criar um torcedor e exibir os dados basicos e individuais;
      - Vantagens: Conseguir armazenar e ultilizar a classe da forma necessária e de forma breve, compactando as funcoes necessarias na classe e seus atributos;
      - Desvantagens:
      
-   CT:
      - Motivaçãoa: Deixar os recursos fisicos separados de funcionarios e torcedores, para trata-los e organizar seus atributos;
      - Soluçao: Organizou o ct de forma unica, deixando bem mais facil a questao de editar a disponibilidade, criar um ct, seu relatorio e editar disponibilidade, assim como
      como buscar um ct foram facilitados pelas funcoes;
      - Vantagens: Conseguir armazenar e ultilizar a classe da forma necessária e de forma breve, compactanto as funcoes necessarias na classe e seus atributos;
      - Desvantagens:
           
 -   Onibus:
      - Motivaçãoa: Deixar os recursos fisicos separados de funcionarios e torcedores, para trata-los e organizar seus atributos;
      - Soluçao: Organizou o onibus de forma unica, deixando bem mais facil a questao de editar a disponibilidade, criar um ct, seu relatorio e editar disponibilidade, assim como
      como buscar um onibus foram facilitados pelas funcoes;
      - Vantagens: Conseguir armazenar e ultilizar a classe da forma necessária e de forma breve, compactanto as funcoes necessarias na classe e seus atributos;
      - Desvantagens:
      
-    Estadio:
      - Motivaçãoa: Deixar os recursos fisicos separados de funcionarios e torcedores, para trata-los e organizar seus atributos;
      - Soluçao: Organizou o Estadio de forma unica, deixando bem mais facil a questao de editar a disponibilidade, criar um Estadio, seu relatorio e editar disponibilidade, assim como
      como buscar um Estadio foram facilitados pelas funcoes;
      - Vantagens: Conseguir armazenar e ultilizar a classe da forma necessária e de forma breve, compactanto as funcoes necessarias na classe e seus atributos;
      - Desvantagens:
       
⦁Distribuição dos métodos:
- Motivação: A principal motivação esteve intrincicamente relacionado a que obejeto tal metodo se refere ou atua sobre ele, cada metodo que tem como parametros objetos de determinadas classes,
foram organizados na sua determinada classe afim de facilitar a procura desses e sua aplicação.
- Solução: resolveu o problema do metodo ficar "perdido" e dificultar uma posterior procura, evitando que fique "baqgunçado"
- Vantagens: encontrar mais rapidamente o metodo, facilitando a manutençao entre outras atividades no mesmo.
- Desvantagens: 

⦁Herança:
- Motivação: separa bem os atributos de cada classe, deixando o que é em comum num classe genérica, evitando assim repetição de codigo e de variaveis.
- solucao: evitou que o código tivesse varias repeticoes, principalmente envolvendo as variaveis, ajudando na relacao e visualização do problema.
- vantagens: fez com que trechos do codigo que envolvesse heranca fossem feitos mais rápidos, poupando tempo no momento de criacao e manutencoes futuras do codigo,
deixando-o mais limpo e organizado.
- Desvantagens: 

⦁Abstrata:
- Motivação: criação da classe inicial da heranca, onde as variaveis so serviriam para estender paras suas classes herdeiras;
- Solucao: fez com que metodos e atribuicoes nao fossem criadas antes desnecessariamente, sendo criadas apenas na classe herdeira da classe abstarta, ,amtendo a organização na classe abstrata do que
não seria usado naquele momento.
- vantagens: criar as variaveis e declarar os metodos que serão usados posteriormentes nas outras classes, mantendo a organização no uso.
- desvantagens: caso surja necesseidade de aplicação nesta classe mãe abstrta, fica impossibilitado por ela ser uma classse abstrata;

⦁Interface:
- Motivação: declacao dos metodos em comuns usados em algumas determinadas classes;
- solucao: mantem a organizacao e facilita manuntencoes futuras, principalmente para quem pega seu projeto pela primeira vez;
- vantagens: organizacao e faclitade para encontar funcoes que atuam nas classes, quais os parametros e o que fazem.
- desvantagens: caso seja necessario, fica proibido uma declaracao previa do corpo da função.

⦁Polimorfismo:
- Motivação: definição de metodos com o mesmo nome mas parametros e aplicacoes possivelmente diferentes;
- solucao: mantem a organizacao e facilita manuntencoes futuras, principalmente para quem pega seu projeto pela primeira vez, minimizando informacoes
e oq aquilo esta responsavel;
- vantagens: organizacao e faclitade para saber o que tais funcoes fazem, principalmente na aplicacao do polimorfismo em metodos.
- desvantagens: pode causar confusao caso seje mal implementada.

⦁Tratamento de exceçoes:
- Motivação: evitar com que o programa pare inesperadamente, e dessa forma perca todas as entradas ja atribbuidas, assim como mostrar para um usuário leigo o erro que aconteceu;
- solucao: faz com que o programa nao pare em algumja excessao, sendo possivel corrigir e seguir em frente com o processo, nao havendo prejuizos;
- vantagens: organizacao e faclitade para lhe dasr com os possiveis problemas que podem acontecer, como por exemplo na entradas de simbolos diferentes do tipo especificado, mantendo seu programa ativo
e possivel de execução continua, nao perdendo tempo e dando ao usuario passos de comom proceder na situação.
- desvantagens:

⦁Extensibilidade:
- Motivação: Aplicação no uso de heranças, havendo organização e partição de conteudo entre os membros compositores;
- solucao: melhor distribuição do codigo, e organização das variaveis onde ela realemnte importa e é aplicada, fazendo com que o código tenha uma direcionamento;
- vantagens: evita sobreposicoes e melhora a visualização do problema, deixando aas coisa mais claras para o desenvolvedor;
- desvantagens:

⦁Reuso:
- Motivação: não criação de trechos repetidos de código, a exemplos de funcoes de busca e checagem de disponibilidade.
- solucao: criacao de funcoes por exemplo, fizeram com que o codigo não precisasse sempre ser reescrito para fazer certa operacao;
- vantagens: evitar linhas desnecessarias e fazer com que o codigo fique mais limpo, sendo assim facilitando manutencoes e melhorando a organização das classes;
- desvantagens: pode-se sobrepor alguma informacao;

