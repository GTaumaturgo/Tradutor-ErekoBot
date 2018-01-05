# Tradutor-ErekoBot

Manual de uso para Linux(Ubuntu):
--------------
Baixe a IDE eclipse. http://www.eclipse.org/ e realize a instalação. No desenvolvimento foi utilizado java 8.

ANTLR4:
-------

Antlr4 é uma biblioteca que permite a definição de gramáticas e realiza reconhecimento de expressões. Para instalá-la, cole esse código no terminal, linha por linha em ordem:

```
cd /usr/local/lib
wget http://www.antlr.org/download/antlr-4.7-complete.jar
```
Após isso, vá na pasta home e digite "gedit .bashrc"
e insira essas 3 linhas nesse arquivo.
```
export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.7-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
```

Caso não tenha o git instalado,
```
sudo apt-get install git
```

Feito isso, clone esse repositório

```
git clone https://github.com/GTaumaturgo/Tradutor-ErekoBot.git
```
Agora é necessário importar o projeto, para isso, faça:
Abra o eclipse. -> File -> Import.. -> General -> Existing Projects into workspace -> Select Root directory;
Selecione a pasta clonada.

Após esse processo, Deve ser possivel executar o programa pelo eclipse.
