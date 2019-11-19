/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public class ProfessorIntegral extends Professor{
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
