package JdevCurso.cadastroAluno;

import javax.swing.JOptionPane;

public class cadastraAluno {

  public static void main(String[] args) {
    /* new aluno é uma instancia (criação de objeto) */
    /* aluno1 é uma referencia para o objeto aluno */

    String nome = JOptionPane.showInputDialog("qual o nome do aluno: ");

    String inputIdade = JOptionPane.showInputDialog("digite a idade do aluno: ");
    int idadeAluno = Integer.parseInt(inputIdade);

    String nascimento = JOptionPane.showInputDialog("qual a data de nascimento do aluno: ");

    String rg = JOptionPane.showInputDialog("qual o rg do aluno: ");

    String inputCpf = JOptionPane.showInputDialog("qual o cpf do aluno: ");
    int cpfAluno = Integer.parseInt(inputCpf);

    String nomeMae = JOptionPane.showInputDialog("qual o nome da mae do aluno: ");

    String nomePai = JOptionPane.showInputDialog("qual o nome do pai do aluno: ");

    String matricula = JOptionPane.showInputDialog("qual a data de matricula do aluno: ");

    String escola = JOptionPane.showInputDialog("qual o nome da escola que o aluno está se matriculando: ");

    String serieMatriculado = JOptionPane.showInputDialog("qual a serie do aluno: ");

    String inputDisciplina1 = JOptionPane.showInputDialog("qual o nome da primeira materia? ");
    String inputDisciplina2 = JOptionPane.showInputDialog("qual o nome da segunda materia? ");
    String inputDisciplina3 = JOptionPane.showInputDialog("qual o nome da terceira materia? ");
    String inputDisciplina4 = JOptionPane.showInputDialog("qual o nome da quarta materia? ");

    String inputNota1 = JOptionPane.showInputDialog("insira o valor da nota 1: ");
    double nota1 = Double.parseDouble(inputNota1);

    String inputNota2 = JOptionPane.showInputDialog("insira o valor da nota 2: ");
    double nota2 = Double.parseDouble(inputNota2);

    String inputNota3 = JOptionPane.showInputDialog("insira o valor da nota 3: ");
    double nota3 = Double.parseDouble(inputNota3);

    String inputNota4 = JOptionPane.showInputDialog("insira o valor da nota 4: ");
    double nota4 = Double.parseDouble(inputNota4);

    Aluno aluno1 = new Aluno();

    aluno1.setNome(nome);
    aluno1.setIdade(idadeAluno);
    aluno1.setNascimento(nascimento);
    aluno1.setRg(rg);
    aluno1.setNumeroCPF(cpfAluno);
    aluno1.setNomeMae(nomeMae);
    aluno1.setNomePai(nomePai);
    aluno1.setMatricula(matricula);
    aluno1.setEscola(escola);
    aluno1.setSerieMatriculado(serieMatriculado);

    Disciplina disciplina1 = new Disciplina();
    disciplina1.setDisciplina(inputDisciplina1);
    disciplina1.setNota(nota1);

    aluno1.getDisciplinas().add(disciplina1);

    Disciplina disciplina2 = new Disciplina();
    disciplina2.setDisciplina(inputDisciplina2);
    disciplina2.setNota(nota2);

    aluno1.getDisciplinas().add(disciplina2);

    Disciplina disciplina3 = new Disciplina();
    disciplina3.setDisciplina(inputDisciplina3);
    disciplina3.setNota(nota3);

    aluno1.getDisciplinas().add(disciplina3);

    Disciplina disciplina4 = new Disciplina();
    disciplina3.setDisciplina(inputDisciplina4);
    disciplina3.setNota(nota4);

    aluno1.getDisciplinas().add(disciplina4);

    Aluno aluno2 = new Aluno();

    aluno2.setNome(nome);
    aluno2.setIdade(idadeAluno);
    aluno2.setNascimento(nascimento);
    aluno2.setRg(rg);
    aluno2.setNumeroCPF(cpfAluno);
    aluno2.setNomeMae(nomeMae);
    aluno2.setNomePai(nomePai);
    aluno2.setMatricula(matricula);
    aluno2.setEscola(escola);
    aluno2.setSerieMatriculado(serieMatriculado);

  }
}
