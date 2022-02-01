#language: pt
@teste @04_teste @04_listar_produtos

Funcionalidade: Adicionar Cliente

  Cenário: Conferir se o cliente foi cadastrado com sucesso
    Dado que acesso a página home do site Automation Practice
    Quando clico em My account
    E digito o Email address no box Register
    E digito o Password no box Register
    E clico em Register
    E clico em Account Details
    E digito o primeiro nome "Nome Teste"
    E digito o sobrenome "Sobrenome Teste" 
    E clico em Save Changes
    Entao verifico se o cadastro e alteração foram efetuados com sucesso

