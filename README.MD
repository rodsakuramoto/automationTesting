# Automation Testing Practice - Automação de Teste de Software
Projeto de prática de teste de software utilizando o framework "Cucumber". Tem como objetivo realizar testes na plataforma: http://practice.automationtesting.in/, são eles:
1. **Procurar por produto** - *Identificar se o produto "Blouse" é listado no resultado após digitar a informação "HTML" no campo de pesquisa.*

2. **Pesquisar produto não existente** - *Identificar se a mensagem "itemNãoExistente" aparece após digitar a informação "itemNãoExistente" no campo de pesquisa.*

3. **Listar Produtos** - *Acessar o menu "Shop" e verificar se dentro da categoria "HTML" o produto "Thinking in HTML" está presente.*

4. **Adicionar Cliente** - Cadastrar um novo registro e alterar as informações do mesmo.

## Requisitos
* **Java - JDK** (Recomendado versão 14) - http://jdk.java.net/

* **Apache Maven** (Recomendado versão 3.8.4) - https://maven.apache.org/download.cgi

* **Git SCM** - https://git-scm.com/download/win

* **Google Chrome e ChromeDriver** (Recomendado versão 97 - Ambos devem estar na mesma versão) - https://chromedriver.chromium.org/downloads

* **Eclipse IDE** - https://www.eclipse.org/downloads/

* **Cucumber Eclipse Plugin** - Download realizado pelo Marktplace do Eclipse IDE

## Instalação (Utilizando Windows 10)

#### Java-JDK
1. Após download do arquivo JDK, extraia o arquivo em algum local de sua preferência;

2. Acesse: Painel de Controle > Sistema e Segurança > Sistema;

3. Na aba do lado direto, clique em "Configurações avançadas do sistema";

4. Clique em "Variáveis de Ambiente...";

5. Caso tenha permissão, clique no botão "Novo" em "Variáveis do sistema", se não, utilize o box "Variáveis de usuário";

6. Digite no nome da variável: "JAVA_HOME";

7. No campo "Valor da variável" informe o local onde foi extraído o JDK. Exemplo:“C:\jdk-14”;

8. Clique em "OK";

9. Selecione a Variável "Path" e clique em "Editar...";

10. Clique em "Novo" e digite "%JAVA_HOME%\bin" depois clique em "OK";

11. Clique em "OK" novamente para salvar as configurações;

12. Para confirmar se o JDK foi configurado corretamente, rode o CMD (Prompt de comando) e digite "java -version".

#### Apache Maven
1. Após download do arquivo Apache Maven, extraia o arquivo em algum local de sua preferência;

2. Acesse: Painel de Controle > Sistema e Segurança > Sistema;

3. Na aba do lado direto, clique em "Configurações avançadas do sistema";

4. Clique em "Variáveis de Ambiente...";

5. Caso tenha permissão, clique no botão "Novo" em "Variáveis do sistema", se não, utilize o box "Variáveis de usuário";

6. Digite no nome da variável: "MAVEN_HOME";

7. No campo "Valor da variável" informe o local onde foi extraído o Apache Maven. Exemplo: "C:\apache-maven-3.8.4";

8. Clique em "OK";

9. Selecione a Variável "Path" e clique em "Editar...";

10. Clique em "Novo" e digite "%MAVEN_HOME%\bin" depois clique em "OK";

11. Clique em "OK" novamente para salvar as configurações;

12. Para confirmar se o Apache Maven foi configurado corretamente, rode o CMD (Prompt de comando) e digite "mvm -version".

#### Git
1. Após download do Git, execute o arquivo de instalação;
2. Clique em "Next" nas telas de opções até chegar na instalação e aguarde a conclusão do mesmo.

#### ChromeDriver
1.  Após download do ChromeDriver, extraia o arquivo na raiz do projeto.

#### Eclipse IDE
1. Após download do Eclipse, execute o arquivo de instalação e selecione a opção: "Eclipse IDE for Java Developers";
2. Clique em "Install";
3. Clique em "Accept Now" e aguarde a conclusão da instalação.

#### Cucumber Eclipse Plugin
1. Abra o Eclipse IDE;
2. Na barra de menus, acesse: Help > Eclipse Marketplace...;
3. No campo "Find", digite "Cucumber" e então aparecerá a opção "Cucumber Eclipse Plugin" para a instalação.;
4. Clique em Install e aguarde;
5. Durante a instalação aparecerá a mensagem de "termos de uso", aceite e clique em "Finish" então aguarde;
6. Ainda durante a instalação, aparecerá uma mensagem de "Warning", clique em "Install anyway";
7. Após a conclusão da instalação, reinicie o Eclipse IDE.

## Execução do Projeto - Automação de Teste

#### Execução do Teste Por Linha de Comando
1. Na raiz do projeto clique com o botão direto do mouse em algum lugar em branco e selecione a opção "Git Bash Here";
2. Dentro do "Git Bash" aberto, digite **". executar.cmd."** e tecle "Enter" para executar o teste de automação. Aguarde e logo abrirá o ChomeDriver executando os testes (Na primeira execução, o script realizará download de arquivos necessários para a execução do mesmo);
3. Após a conclusão do teste, o relatório de evidência ficará salvo no diretório: *"automationTesting\target\relatorios\htmls\automationtesting\index.html"*
4. Para gerar o relatório de gráfico do resumo das features, após a execução do teste (executar.cmd), digite **". gerar.cmd."** e tecle "Enter", aguarde até a conclusão. O relatório ficará salvo no diretório: *"automationTesting\target\relatorios\graficos_gerados\automationTesting"*
(Na primeira execução, o script realizará download de arquivos necessários para a execução do mesmo);

#### Execução do Teste Pelo Eclipse IDE
##### Configuração Eclipse IDE 
###### Importar Projeto

1. Após abrir o Eclipse IDE, na barra de menu acesse: File > Import;
2. Na de seleção do "Import", selecione: Maven > Existing Maven Projects. Clique em "Next".
3. No campo "Root Directory" clique em "Browse", selecione o local onde está o projeto importado pelo GitHub. Em "Projects", marque o "/pom.xml" caso esteja desmarcado e clique em "Finish" então aguarde a conclusão da importação do projeto.

###### Configurar JDK - Build Path
1. Abra o "Package Explorer";
2. Clique com o botão direito na raiz do projeto;
3. Clique em Build Path > Configure Build Path;
4. Na aba "Libraries", caso tenha algum "JRE System Library", remova-o, então depois clique em "Add Library...";
5. Selecione a opção "JRE System Library", clique em "Next";
6. Selecione a opção "Alternate JRE:" e em seguida clique em "Installed JREs...";
7. Caso tenha um "jre (default)" aparecendo, remova-o, então depois clique em "Add...";
8. Selecione a opção "Standard VM", clique em "Next";
9. Em "JRE home:" clique em "Directory..." e selecione a pasta onde foi descompactado o JDK;
10. No box "JRE system libraries:" aparecerá o arquivo "jrt-fs.jar", clique em "Finish", então depois clique em "Apply" e "Apply and Close";
11. Automaticamente no campo "Alternate JRE:" aparecerá o JDK instalado em sua máquina. Clique em "Finish";
12. Para concluir em "Apply and Close".

##### Executando o Teste pelo Eclipse IDE
1. Abra o "Package Explorer";
2. Acesse: srs/test/java > in.automationtesting.runners;
3. Em "RunnerTest.java" clique com o botão direito do mouse, vá até "Run As" > "Junit Test". Aguarde e logo abrirá o ChomeDriver executando os testes;
4. Após a conclusão do teste, o relatório de evidência ficará salvo no diretório: *"automationTesting\target\relatorios\htmls\automationtesting\index.html"*

## Extras
#### Features
As Features do Projeto estão no local: *"automationTesting\src\test\resources\features"*

#### Steps, Métodos e Classes
As Steps, Métodos e Classes estão no local: *"automationTesting\src\test\java\in\automationtesting\steps"*

