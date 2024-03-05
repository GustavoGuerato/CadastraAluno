package JdevCurso.cadastroAluno;

public class Aluno {

   /* esses são os atributos da classe aluno */
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
   private double nota1;
   private double nota2;
   private double nota3;
   private double nota4;

   public Aluno() {
      /* cria os dados na memoria java */}

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

   public double getNota1() {
      return nota1;
   }

   public void setNota1(double nota1) {
      this.nota1 = nota1;
   }

   public double getNota2() {
      return nota2;
   }

   public void setNota2(double nota2) {
      this.nota2 = nota2;
   }

   public double getNota3() {
      return nota3;
   }

   public void setNota3(double nota3) {
      this.nota3 = nota3;
   }

   public double getNota4() {
      return nota4;
   }

   public void setNota4(double nota4) {
      this.nota4 = nota4;
   }

   public double getMediaNota() {
      return (nota1 + nota2 + nota3 + nota4) / 4;
   }

   public boolean getAlunoAprovado() {
      double media = this.getMediaNota();
      if (media >= 70) {
         return true;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "Aluno [nome=" + nome + ", idade=" + idade + ", nascimento=" + nascimento + ", rg=" + rg + ", numeroCPF="
            + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", matricula=" + matricula + ", escola="
            + escola + ", serieMatriculado=" + serieMatriculado + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
            + nota3 + ", nota4=" + nota4 + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((rg == null) ? 0 : rg.hashCode());
      result = prime * result + numeroCPF;
      result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Aluno other = (Aluno) obj;
      if (rg == null) {
         if (other.rg != null)
            return false;
      } else if (!rg.equals(other.rg))
         return false;
      if (numeroCPF != other.numeroCPF)
         return false;
      if (matricula == null) {
         if (other.matricula != null)
            return false;
      } else if (!matricula.equals(other.matricula))
         return false;
      return true;
   }


   
}
