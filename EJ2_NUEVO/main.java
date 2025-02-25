package EJ2_NUEVO;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Aqui podremos visualizar el menu del programa
    public static void Menu(boolean guardado){
        System.out.println("[-----[GEOMETRIA GAME]-----]");
        for(Tipo tip : Tipo.values()){
            System.out.println(tip.getValores()+ ") " + tip);
        }
        if(guardado){
            System.out.print("4) VISUALIZAR FIGURAS\n5) SALIR\nC: ");
        }else{
            System.out.print("4) FIGURAS ALEATORIAS\n5) SALIR\nC: ");
        }
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Esta es la funcion principal del programa
    public static void Main(String [] args){
        int sele = 0;
        Scanner sr = new Scanner(System.in);
        Figuras geo;
        boolean guardado = false;
        Figuras[] geoLis = new Figuras[0];
        do { 
            Menu(guardado);    
            sele = sr.nextInt();
            System.out.print("La altuara de la figura: ");
            double altura = sr.nextDouble();
            System.out.print("La anchura de la figura: ");
            double anchura = sr.nextDouble();
            if (sele >= 1 && sele <= 3) {
                geo = new Figuras(altura, anchura, sele);
            }else if(sele == 4){
                if(guardado){
                    for(Figuras fi : geoLis) {
                        fi.MostrarInfo();
                    }
                }else{
                    int valores = (int)(Math.random()*10)+5;
                    for(int i = 0; i < valores; i++){
                        sele = (int)(Math.random()*3)+1;
                        Figuras[] NewGeoLis = new Figuras[geoLis.length + 1];
                        NewGeoLis = Arrays.copyOf(geoLis, geoLis.length + 1);
                        NewGeoLis[i] = new Figuras(altura, anchura, sele);
                        geoLis = NewGeoLis;
                    }
                    System.out.print("Deseas guardar la lista de figuras[s/n]: ");
                    String selec = sr.next().toLowerCase();
                    if(selec.equals("s") || selec.equals("si")){
                        System.out.print("Se a guardado de forma correcta.");
                        guardado = true;
                    }else{
                        Figuras[] NewGeoLis = new Figuras[0];
                        geoLis = NewGeoLis;
                    }
                }
            }
        } while(sele != 5);
    }
}
