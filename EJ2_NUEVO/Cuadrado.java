package EJ2_NUEVO;

public class Cuadrado implements Geometria{
    private double ancho = 0;
    private double alto = 0;
    private double area;
    private double perimetro;
    private Tipo tip = Tipo.CUADRADO;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Aqui cojera las medidas del cuadrado
    @Override
    public void Medidas(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Aqui se dibujara el cuadrado y medira el area y el perimetro del cuadrado
    @Override
    public void Mostrar(){
        for(int i = 0; i < alto; i++){
            for(int j = 0; j < ancho; j++){
                System.out.print(" * ");
            }System.out.println();
        }
        if(this.ancho == this.alto){
            this.perimetro = alto * 4;
        }else{
            this.perimetro = 2*(alto+ancho);
        }
        this.area = alto*ancho;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Aqui se mostrara la informacion completa del cuadrado
    @Override
    public void MostrarInformacion(){
        System.out.println("Tipo de figura: " + this.tip + "\nALTURA: " + this.alto +
        "\nANCHO: " + this.ancho + "\nAREA: " + this.area + "\nPERIMETRO: " + this.perimetro);
    }
}
