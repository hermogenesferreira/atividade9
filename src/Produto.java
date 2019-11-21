public abstract class Produto {
    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    
    public Produto(String c, String n, String d, double p){
        
        setCodigo(c);
        setNome(n);
        setDescricao(d);
        setPreco(p);
    }
    
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(String c){
        this.codigo = c;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }

    public String getDesricao(){
        return this.descricao;
    }
    
    public void setDescricao(String d){
        this.descricao = d;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double p){
        this.preco = p;
    }
    
    public abstract double calcularPrecoFinal();

    public abstract String imprimirDados();
}
