# Sistema de Cadastro de Aluno

## Descrição
Este é um sistema simples de cadastro de alunos desenvolvido em Java. O projeto contém duas classes principais: `Aluno` e `cadastraAluno`.

## Estrutura do Projeto

### Aluno.java
- A classe `Aluno` define a estrutura do objeto Aluno, contendo os seguintes atributos:
  - `nome`: Nome do aluno.
  - `idade`: Idade do aluno.
  - `nascimento`: Data de nascimento do aluno.
  - `rg`: Número do RG do aluno.
  - `numeroCPF`: Número do CPF do aluno.
  - `nomeMae`: Nome da mãe do aluno.
  - `nomePai`: Nome do pai do aluno.
  - `matricula`: Número da matrícula do aluno.
  - `escola`: Nome da escola onde o aluno está matriculado.
  - `serieMatriculado`: Série em que o aluno está matriculado.
- A classe inclui métodos getters e setters para acessar e modificar os atributos.

### cadastraAluno.java
- O arquivo `cadastraAluno` contém o método `main` e é responsável por interagir com a classe `Aluno`.
- Demonstração de como criar instâncias de objetos da classe `Aluno` e realizar o cadastro de alunos.
- Exemplo de instanciamento do aluno1 com informações fictícias.

## Como Executar
Para executar o sistema de cadastro de alunos, siga os passos abaixo:

1. Abra um terminal na pasta do projeto.
2. Compile o arquivo `cadastraAluno.java` usando o comando:
   ```bash
   javac cadastraAluno.java
