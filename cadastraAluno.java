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

    String matricula = JOptionPane.showInputDialog("qual a data de matriculad do aluno: ");

    String escola = JOptionPane.showInputDialog("qual o nome da escola que o aluno está se matriculando: ");

    String serieMatriculado = JOptionPane.showInputDialog("qual a serie do aluno: ");

    String inputNota1 = JOptionPane.showInputDialog("insira o valor da nota1: ");
    double nota1 = Double.parseDouble(inputNota1);

    String inputNota2 = JOptionPane.showInputDialog("insira o valor da nota2: ");
    double nota2 = Double.parseDouble(inputNota2);

    String inputNota3 = JOptionPane.showInputDialog("insira o valor da nota1: ");
    double nota3 = Double.parseDouble(inputNota3);

    String inputNota4 = JOptionPane.showInputDialog("insira o valor da nota1: ");
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
    aluno1.setNota1(nota1);
    aluno1.setNota2(nota2);
    aluno1.setNota3(nota3);
    aluno1.setNota4(nota4);

    System.out.println(aluno1.getMediaNota());
    System.out.println("Resultado é = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

  }
}
