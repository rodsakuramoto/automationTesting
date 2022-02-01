#language: pt
@teste @01_teste @01_procurando_por_produto

Funcionalidade: Procurar Por Produto Blouse

  Cenário: Identificar se o produto "Blouse" foi listado após a pesquisa do mesmo
    Dado que acesso a página home do site Automation Practice
    Quando digito o nome do produto "HTML" no campo de pesquisa
    E teclo enter para confirmar a pesquisa
    Entao confiro se o produto Blouse foi listado no site