package EJ2;

public enum tipo {
    TRIANGULO(1), CUADRADO(2), CIRCULO(3);
    private int valores;
    tipo(int valores){
        this.valores = valores;
    }
    public int getValores(){
        return this.valores;
    }
}
