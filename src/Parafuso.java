
public abstract class Parafuso extends Produto {
    private double comprimento;
    private double diametro;
    
    public Parafuso(String c, String n, String d, double p,double comp, double diam){
        super(c,n,d,p);
        this.setComprimento(comp);
        this.setDiametro(diam);
        
    }
    
    public void setComprimento(double comp){
        this.comprimento = comp;
    }
    
    public double getComprimento(){
        return this.comprimento;
    }
    
    public void setDiametro(double diam){
        this.diametro = diam;
    }
    
    public double getDiametro(){
        return this.diametro;
    }
    public double calcularPrecoFinal(double p){
        return p += p*0.15;
    };
}
