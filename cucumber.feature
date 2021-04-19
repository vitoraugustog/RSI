# language: pt

Funcionalidade: Teste de Cadastro

Como um usuário
se cadastra
na página web

Cenário: Deve entrar na pagina e acessar o menu de cadastro
Dado que estou acessando a página web
Então preenche os dados do usuário
E finaliza ao clickar no botão

Funcionalidade: Login do Usuário

Como um usuário
digito o username
e senha

Cenário: Consegue logar na pagina pós cadastro
Dado que estou acessando a página web
Quando informo o usuário "vitorqa"
E a senha "Teste123_"
E seleciono entrar
Então esta logado na área interna

