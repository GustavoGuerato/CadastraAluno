package JdevCurso.cadastroAluno;

public class cadastraAluno {

  public static void main(String[] args) {
    /*new aluno é uma instancia (criação de objeto) */
    /*aluno1 é uma referencia para o objeto aluno */
    Aluno aluno1 = new Aluno();
    aluno1.setNome("gustavo");
    aluno1.setIdade(19);
    aluno1.setNascimento("14/08/2004");
    aluno1.setRg("49.977.657-4");
    aluno1.setNumeroCPF(321340677);
    aluno1.setNota1(95);
    aluno1.setNota2(87.65);
    aluno1.setNota3(69);
    aluno1.setNota4(78.07);

    System.out.println(aluno1.getMediaNota());
   
  }
}
