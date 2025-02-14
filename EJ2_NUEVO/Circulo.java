package EJ2_NUEVO;

public class Circulo implements Geometria{
    private double ancho = 0;
    private double alto = 0;
    private int radio = 0;
    private double area;
    private double perimetro;
    private Tipo tip = Tipo.CIRCULO;
    @Override
    public void Medidas(double ancho, double alto){
        this.alto = alto;
        this.ancho = ancho;
        this.radio = (int)(Math.min(ancho, alto)/2);
    }
    @Override
    public void Mostrar(){
        for(int i = -radio; i < radio; i++){
            for(int j = -radio; j < radio; j++){
                if(i*i+j*j <= radio * radio){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        this.area = Math.PI * this.radio * this.radio;
        this.perimetro = 2 * Math.PI * this.radio;
    }
    @Override
    public void MostrarInformacion(){
        System.out.println("Tipo de figura: " + this.tip + "\nALTURA: " + this.alto +
        "\nANCHO: " + this.ancho + "\nAREA: " + this.area + "\nPERIMETRO: " + this.perimetro);
    }
}
