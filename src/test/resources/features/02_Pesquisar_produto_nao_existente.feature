#language: pt
@teste @02_teste @02_pesquisar_produto_nao_existente

Funcionalidade: Pesquisar Produto Não Existente

  Cenário: Identificar se a mensagem de "itemNãoExistente" aparece após a pesquisa de produto
    Dado que acesso a página home do site Automation Practice
    Quando digito o nome do produto "itemNãoExistente" no campo de pesquisa
    E teclo enter para confirmar a pesquisa
    Entao confiro a mensagem "itemNãoExistente"
