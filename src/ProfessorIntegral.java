public abstract class ProfessorIntegral extends Professor{
    private double salario;

    public ProfessorIntegral(String nome,double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public  void calcularSalárioLíquido(double Salario){
        Salario =salario - (salario*0.11);
    }
}
