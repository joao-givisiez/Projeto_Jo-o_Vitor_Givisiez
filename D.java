

public class D {
    // Atributos D1 e D2 com tipos de dados à sua escolha
    private String D1; 
    private int D2;   

    // Construtor
    public D(String d1, int d2) {
        this.D1 = d1;
        this.D2 = d2;
    }

    // Getters e Setters (boa prática)
    public String getD1() { 
        return D1; 
    }
    public void setD1(String d1) { 
        D1 = d1; 
    }
    public int getD2() {
         return D2; 
    }
    public void setD2(int d2) {
         D2 = d2; 
    }

    // Métodos MD1() e MD2()
    public void MD1() { 
        System.out.println("Executando método MD1 da classe D.");
    }

    public void MD2() { // [cite: 74]
        System.out.println("Executando método MD2 da classe D.");
    }
    public void MD4() {
    System.out.println("Executando método MD4.");
}
    
}
