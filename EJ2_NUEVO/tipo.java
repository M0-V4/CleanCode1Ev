package EJ2;

public enum Tipo {
    TRIANGULO(1), CUADRADO(2), CIRCULO(3);
    private int valores;
    Tipo(int valores){
        this.valores = valores;
    }
    public int getValores(){
        return this.valores;
    }
}
