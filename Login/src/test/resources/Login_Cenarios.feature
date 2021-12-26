#language:pt
#Author: Leticia Massolin


Funcionalidade: realizar login de usuario deixando de preencher alguns campos,colocando dados invalidos e cadastrando usuario 

Contexto: 
Dado que eu esteja no "http://prova.stefanini-jgr.com.br/teste/qa/"

Cenario: login sem o campo nome preenchido

Quando preencher o formulario sem colocar o  nome  
E informar que o campo eh obrigatorio 
Entao finalizo o teste 


Cenario: login sem o campo email preenchido

Quando preencher o formulario sem colocar o email 
E informar que o campo eh obrigatorio  
Entao finalizo o teste


Cenario: login sem o campo senha preenchido
Quando preencher o formulario sem colocar a senha
E informar que o campo eh obrigatorio 
Entao finalizo o teste 

Cenario: login sem nenhum campo preeenchido 
Quando nao colocar nenhuma informacao 
E informar que os campos sao  obrigatorios
Entao finalizo o teste 


Cenario: login com nome invalido 

Quando preencher o formulario com nome invalido 
E informar que o dado esta invalido
Entao finalizo o teste 


Cenario: login com email invalido 
Quando preencher o formulario com email invalido 
E informar que o dado esta invalido

Entao finalizo o teste 


Cenario: login com a senha invalida 
Quando preencher o formulario colocando senha com menos de 8 caracteres 
E informar que precisa de 8 ou mais caracteres
Entao finalizo o teste 


Cenario: cadastro realizado com sucesso

Quando preencher o formulario corretamente
E a conta for criada com sucesso 
Entao finalizo o teste


Cenario: criar outra conta valida para visualizar tabela

Quando preencher o formulario corretamente
E aparecer as informacoes em tabela
Entao finalizo o teste

Cenario: exclusao da primeira conta criada

Quando e tenha duas contas criada na tabela
E fizer a exclusao da primeira conta
Entao finalizo o teste