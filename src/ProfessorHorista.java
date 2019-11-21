
public abstract class ProfessorHorista extends Professor{
    private int horasTrabalhadas;
    private double valorHora;

    public ProfessorHorista(String nome, int horasTrabalhadas) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas =  horasTrabalhadas;
    }
    public  void calcularSalárioLíquido(double salario){
        salario= horasTrabalhadas*valorHora*0.05;
        
    }
}

