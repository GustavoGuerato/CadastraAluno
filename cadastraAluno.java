package JdevCurso.cadastroAluno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class cadastraAluno {

  public static void main(String[] args) {
    /* new aluno é uma instancia (criação de objeto) */
    /* aluno1 é uma referencia para o objeto aluno */

    List<Aluno> alunos = new ArrayList<Aluno>();

    for (int qtd = 1; qtd <= 15; qtd++) {

      String nome = JOptionPane.showInputDialog("qual o nome do aluno" + qtd + "?");

      String inputIdade = JOptionPane.showInputDialog("digite a idade do aluno: " + qtd);
      int idadeAluno = Integer.parseInt(inputIdade);

      String nascimento = JOptionPane.showInputDialog("qual a data de nascimento do aluno: " + qtd);

      String rg = JOptionPane.showInputDialog("qual o rg do aluno: " + qtd);

      String inputCpf = JOptionPane.showInputDialog("qual o cpf do aluno: " + qtd);
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

        int continuarRemovendo = 0;
        int posicao = 1;

        while (continuarRemovendo == 0) {
          String disciplinaRemover = JOptionPane
              .showInputDialog("qual disciplina deseja remover? 1,2,3,4,5,6,7,8,9,10,11 ou 12");
          aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
          posicao++;
          continuarRemovendo = JOptionPane.showConfirmDialog(null, "deseja remover mais alguma disciplina? ");

        }

      }
      alunos.add(aluno1);
    }
    for (Aluno aluno : alunos) {
      if (aluno.getNome().equalsIgnoreCase("Gustavo")) {
        alunos.remove(aluno);
        break;
      } else {
        System.out.println(aluno);
        System.out.println("media do aluno é " + aluno.getMediaNota());
        System.out.println("resultado é" + aluno.getAlunoAprovado2());
      }

    }
    for (Aluno aluno : alunos) {
      System.out.println("alunos que sobraram são ");
      System.out.println(aluno.getNome());
      System.out.println("e suas materias são: ");

      for (Disciplina disciplina : aluno.getDisciplinas()) {
        System.out.println(disciplina.getDisciplina());

      }
    }
  }
}
