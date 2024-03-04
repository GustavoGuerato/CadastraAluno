package JdevCurso.cadastroAluno;

public class Aluno {

   /*esses são os atributos da classe aluno */
   private String nome;
   private int idade;
   private String nascimento;
   private String rg;
   private int numeroCPF;
   private String nomeMae;
   private String nomePai;
   private String matricula;
   private String escola;
   private String serieMatriculado;
   public Aluno(){/*cria os dados na memoria java */

   }
   public String getNome() {
      return nome;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public int getIdade() {
      return idade;
   }
   public void setIdade(int idade) {
      this.idade = idade;
   }
   public String getNascimento() {
      return nascimento;
   }
   public void setNascimento(String nascimento) {
      this.nascimento = nascimento;
   }
   public String getRg() {
      return rg;
   }
   public void setRg(String rg) {
      this.rg = rg;
   }
   public int getNumeroCPF() {
      return numeroCPF;
   }
   public void setNumeroCPF(int numeroCPF) {
      this.numeroCPF = numeroCPF;
   }
   public String getNomeMae() {
      return nomeMae;
   }
   public void setNomeMae(String nomeMae) {
      this.nomeMae = nomeMae;
   }
   public String getNomePai() {
      return nomePai;
   }
   public void setNomePai(String nomePai) {
      this.nomePai = nomePai;
   }
   public String getMatricula() {
      return matricula;
   }
   public void setMatricula(String matricula) {
      this.matricula = matricula;
   }
   public String getEscola() {
      return escola;
   }
   public void setEscola(String escola) {
      this.escola = escola;
   }
   public String getSerieMatriculado() {
      return serieMatriculado;
   }
   public void setSerieMatriculado(String serieMatriculado) {
      this.serieMatriculado = serieMatriculado;
   }
}

