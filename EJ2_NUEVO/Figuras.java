package EJ2_NUEVO;

public class Figuras{
    private Tipo tipos;
    Geometria geo;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Aqui es donde el programa ejecutara lo pedido por el usuario, y con ello cojiendo la variable del objeto geo para que hacer que funcione
    public Figuras(double Altura, double Anchura, int sele){
        for(Tipo t : Tipo.values()){
            if(t.getValores() == sele){
                if(t.equals(Tipo.CIRCULO)){
                    geo = new Circulo();
                }else if(t.equals(Tipo.CUADRADO)){
                    geo = new Cuadrado();
                }else if(t.equals(Tipo.TRIANGULO)){
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
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Aqui se mostrara la informacion del objeto geo    
    public void MostrarInfo(){
        geo.Mostrar();
        geo.MostrarInformacion();
    }
}
