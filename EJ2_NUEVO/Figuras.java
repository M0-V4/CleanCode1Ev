package EJ2_NUEVO;

public class Figuras{
    private tipo tipos;
    Geometria geo;
    public Figuras(double Altura, double Anchura, int sele){
        for(Tipo t : Tipo.values()){
            if(t.getValores() == sele){
                if(t.equals(tipo.CIRCULO)){
                    geo = new Circulo();
                }else if(t.equals(tipo.CUADRADO)){
                    geo = new Cuadrado();
                }else if(t.equals(tipo.TRIANGULO)){
                    geo = new Triangulo();
                }
                break;
            }
        }if(geo == null){
            System.out.println("No hay ninguna figura con ese valor");
        }
        geo.Medidas(Altura, Anchura);
        geo.Mostrar();
        geo.MostrarInformacion();
    }
    public void MostrarInfo(){
        geo.Mostrar();
        geo.MostrarInformacion();
    }
}
