
public abstract class Professor{
    private String nome;

    
    public Professor(String nome){
        this.setNome(nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract double calcularSalárioLíquido();
}
