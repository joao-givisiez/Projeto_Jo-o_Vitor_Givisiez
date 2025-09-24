public class A {
 
    private int A1;
    private float A2;
   
    public A() {
    }

    public int getA1() {
        return A1;
    }

    public void setA1(int a1) {
        A1 = a1;
    }

    public float getA2() {
        return A2;
    }

    public void setA2(float a2) {
        A2 = a2;
    }

    public void MA1() {
     
        System.out.println("Método MA1 executado.");
    }

    public void MA2() {
       
        System.out.println("Método MA2 executado.");
    }

    public void MA3() {
        // Imprime a string solicitada na tela
        System.out.println("Alteração a classe A partir do clone"); 
    }

    // NOVO MÉTODO ADICIONADO FORK
    public int getSoma(int a, int b) {
        return a + b;
    }

}   