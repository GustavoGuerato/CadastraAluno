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

    for (int pos = 1; pos <= 12; pos++) {
      String nomeDisciplina = JOptionPane.showInputDialog("qual o nome da disciplina " + pos + "? ");
      double nota = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da nota " + pos + ": "));

      Disciplina disciplina = new Disciplina();
      disciplina.setDisciplina(nomeDisciplina);
      disciplina.setNota(nota);
      
      aluno1.getDisciplinas().add(disciplina);
    }

    int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

    if (escolha == 0) {
      String disciplinaRemover = JOptionPane.showInputDialog("qual disciplina deseja remover? 1,2,3,4,5,6,7,8,9,10,11 ou 12");
      aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
    }
    
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
