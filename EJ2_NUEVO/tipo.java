package EJ2_NUEVO;

public enum Tipo {
    //Esto son lo diferente tipos de figuras que tiene el programa, con una diferecia de valor de cada uno
    TRIANGULO(1), CUADRADO(2), CIRCULO(3);
    private int valores;
    Tipo(int valores){
        this.valores = valores;
    }
    public int getValores(){
        return this.valores;
    }
}
