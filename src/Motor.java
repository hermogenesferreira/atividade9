public class Motor extends Produto{
    private double potencia;
    private double rpm;
    
    public Motor(String c, String n, String d, double p, double pot, double rpm){
        super(c,n,d,p);
        this.setPotencia(pot);
        this.setRpm(rpm);
    }
    
    public void setPotencia(double pot){
        this.potencia = pot;
    }
    
    public double getPotencia(){
        return this.potencia;
    }
    
    public void setRpm(double rpm){
        this.rpm = rpm;
    }
    
    public double getRpm(){
        return this.rpm;
    }
    
    public double calcularPrecoFinal(){
        return (this.preco*0.95);
    }
    
    public String imprimirDados(){
        return "codigo: " + this.codigo + " nome: " + this.nome + " descricao: " + this.descricao + " valor: " + this.preco + " potencia: " + this.potencia + " rpm: " + this.rpm;
    }
        
}