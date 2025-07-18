# GFT Start #7 - Java 🚀

Repositório dedicado aos estudos de Java, seguindo o curso [GFT Start #7 - Java](https://web.dio.me) da DIO.  

## 📌 Objetivo  
Adquirir os fundamentos necessários para conquistar uma vaga de estágio na **GFT**!  
Uma imersão completa em desenvolvimento back-end com Java, abrangendo:  
✔ Sintaxe básica  
✔ Desenvolvimento de APIs RESTful  
✔ Integração com bancos de dados relacionais e NoSQL  
✔ Cloud computing com AWS  

## 📂 Organização do Repositório  
- **Aulas**: Códigos e exercícios das aulas estão neste repositório.  
- **Desafios**: Terão repositórios separados (links serão adicionados aqui).  

---

## 📚 Anotações
### 🔹Git
- No git clone, você pode colocar outro nome para o repositório clonado, basta colocar o nome que você quer após o link do repositório;
- ## git remote - v:
    - Mostra os repositórios remotos que você está vinculado.
- ## cat:
    - Mostra o que tem dentro de um arquivo.
- ## git remote add origin + url:
    - Conecta um repositório local com um remoto.
- ## git clone URL --branch + nome_branch --single-branch:
    - Clona o repositório com apenas uma branch específica;
    - Se você não passar o nome da branch, ele vai clonar a principal.
- ## echo nome_pasta > .gitignore:
    - Adiciona uma pasta ao **gitignore**.
- ## echo > .gitignore:
    - Deixa o **gitignore** vazio.
- ## touch nome_pasta/.gitkeep:
    - Convenção que cria um arquivo em pastas vazias para adicionar elas ao git.
- ## rm -rf .git:
    - Remove recursivamente e a força o diretório **.git** e todo o seu conteúdo.
- ## git restore + arquivo:
    - Descarta as alterações feitas no arquivo.
- ## git commit --amend -m "mensagem":
    - Altera a mensagem do último commit;
    - Também é possível fazer escrevendo **git commit -- amend**. Ele abre o editor para você alterar a mensagem do commit.
- ## git reset --(soft,mixed, hard) hash_commit:
    - Com o **soft** ele volta para o commit em que você colocou a hash e os arquivos modificados em commits posteriores ficam na staging area;
    - O **mixed** é o comportamento padrão, por isso não é necessário colocá-lo. Volta ao commit do hash indicado e deixa os arquivos de commits posteriores na **working tree**;
    - O **hard** retorna ao commit do hash indicado e apaga os arquivos de commits posteriores.
> **IMPORTANTE**
> 
> Essas alterações usando reset, devem ser feitas antes dos commits serem enviados ao repositório remoto.
- ## git reflog:
    - Mostra todos os commits que foram feitos no repositório, inclusive os excluídos.
- ## git restore --staged + arquivo:
    - Remove um arquivo da staging area;
    - Também é possível fazer utilizando: **git reset + caminho_arquivo**.
- ## git remote add origin + url:
    - Conecta um repositório local já existente ao remoto.
- ## git branch -M main:
    - Força a branch **master** a ser chamada de **main**, se ela existir.
- ## git push -u origin main:
    - Envia as alterações para o repositório remoto e configura a **branch main** do repositório remoto(**origin**) como a **upstream** do local.
- ## git checkout -b + nome_branch:
    - Altera e cria uma nova branch.
- ## git checkout + nome_branch:
    - Altera a branch.
- ## git branch -v:
    - Lista o último commit de cada branch.
- ## git merge + nome_branch:
    - Mescla a branch especificada com a que você está.
- ## git branch -d + nome_branch:
    - Exclui a branch especificada.
- ## git fetch origin main:
    - Trás as alterações da branch especificada do repositório remoto, sem mesclar com a do local.
- ## git diff main origin/main:
    - Exibe as diferenças no repositório local e remoto da branch especificada.
- ## git merge origin/main:
    - Baixa o conteúdo da branch remota sem mesclar com a local.
- ## git stash:
    - Deixa as modificações feitas no repositório arquivadas.
- ## git stash list:
    - Mostra a lista de stashs.
- ## git stash (pop, apply):
    - O **pop** remove da stash e trás de volta para a working tree;
    - O **apply** trás de volta para a working tree, mas mantém na lista.


---

Feito com ❤️ por [Emanuel Galindo](https://github.com/emanugalindo).  
