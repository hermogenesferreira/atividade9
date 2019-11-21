
public abstract class Motor extends Produto {
    private double potencia;
    private double rpm;
    
    public Motor(String c, String n, String d, double p,double pot, double rpm){
        super(c,n,d,p);
        this.setPotencia(pot);
        this.setRpm(rpm);
    }
    
    public void setPotencia(double p){
        this.potencia = p;
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

}
