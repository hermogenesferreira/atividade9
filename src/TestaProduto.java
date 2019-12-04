public class TestaProduto {
    public static void main(String[]args){
        Motor m1 = new Motor("20","V8","Motor V8",2000,185,8000);
        
        Parafuso p1 = new Parafuso("30","Sextavado", "Parafuso Sextavado",2.40,100,20);
        
        System.out.println(m1.calcularPrecoFinal());
        System.out.println(m1.imprimirDados());
        
        System.out.println(p1.calcularPrecoFinal());
        System.out.println(p1.imprimirDados());
        
    }
    }

