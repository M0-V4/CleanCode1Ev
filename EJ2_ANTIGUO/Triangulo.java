package EJ2;

public class Triangulo implements Geometria{
    private double ancho = 0;
    private double alto = 0;
    private double area;
    private double perimetro;
    private tipo tip = tipo.TRIANGULO;
    public void Medidas(double ancho, double alto){
        this.alto = alto;
        this.ancho = ancho;
    }
    @Override
    public void Mostrar(){
        for(int i = 1; i <= alto; i++){
            for(int j = 1; j <= alto - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= ancho - 2 *(alto - i); k++){
                System.out.print("*");
            }System.out.println();
        }
        this.perimetro = alto + ancho + (Math.sqrt(Math.pow(alto, 2)+Math.pow(alto, 2)));
        this.area = (ancho * alto) / 2;
    }
    @Override
    public void MostrarInformacion(){
        System.out.println("Tipo de figura: " + this.tip + "\nALTURA: " + this.alto +
        "\nANCHO: " + this.ancho + "\nAREA: " + this.area + "\nPERIMETRO: " + this.perimetro);
    }
}
