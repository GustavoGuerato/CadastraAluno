package JdevCurso.cadastroAluno;

public class Secretario extends Pessoa {
    private String registro;
    private String nivelCargo;
    private int anosExperiencia;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", anosExperiencia="
                + anosExperiencia + "]";
    }

    @Override
    public boolean pessoaMaiorIdade() {
        if (idade < 18) {
            return false;
        } else {
            return true;
        }
    }

    public String msgMaiorIdade() {
        return this.pessoaMaiorIdade() ? "a pessoa tem a idade necessaria para ser contratado"
                : "a pessoa não tem a idade minima";
    }

}
