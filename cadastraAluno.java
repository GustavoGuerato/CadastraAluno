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

    String disciplina1 = JOptionPane.showInputDialog("qual o nome da primeira materia? ");
    String disciplina2 = JOptionPane.showInputDialog("qual o nome da segunda materia? ");
    String disciplina3 = JOptionPane.showInputDialog("qual o nome da terceira materia? ");
    String disciplina4 = JOptionPane.showInputDialog("qual o nome da quarta materia? ");

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
    aluno1.getDisciplina().setDisciplina1(disciplina1);
    aluno1.getDisciplina().setDisciplina2(disciplina2);
    aluno1.getDisciplina().setDisciplina3(disciplina3);
    aluno1.getDisciplina().setDisciplina4(disciplina4);
    aluno1.getDisciplina().setNota1(nota1);
    aluno1.getDisciplina().setNota2(nota2);
    aluno1.getDisciplina().setNota3(nota3);
    aluno1.getDisciplina().setNota4(nota4);

    System.out.println(aluno1.toString());

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
    aluno2.getDisciplina().setDisciplina1(disciplina1);
    aluno2.getDisciplina().setDisciplina2(disciplina2);
    aluno2.getDisciplina().setDisciplina3(disciplina3);
    aluno2.getDisciplina().setDisciplina4(disciplina4);
    aluno2.getDisciplina().setNota1(nota1);
    aluno2.getDisciplina().setNota2(nota2);
    aluno2.getDisciplina().setNota3(nota3);
    aluno2.getDisciplina().setNota4(nota4);

  }
}
