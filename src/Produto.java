public abstract class Produto {
    protected String codigo;
    protected String nome;
    protected String descricao;
    protected double preco;
    
    public Produto(String c, String n, String d, double p){
        this.setCodigo(c);
        this.setNome(n);
        this.setDescricao(d);
        this.setPreco(p);
    }
    
    public void setCodigo(String c){
        this.codigo = c;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setDescricao(String d){
        this.descricao = d;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setPreco(double p){
        this.preco = p;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public abstract double calcularPrecoFinal();
    public abstract String imprimirDados();
}
