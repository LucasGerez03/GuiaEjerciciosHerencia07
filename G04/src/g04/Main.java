package g04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Bicicleta> bicis = new ArrayList();

        Bicicleta bici1 = new Bicicleta("BMX", "1.7.5", 2000);
        Bicicleta bici2 = new BicicletaElectrica(241, "Lux", "23.23", 1999);
        Bicicleta bici3 = new Bicicleta("sds", "777", 2000);

        bicis.add(bici1);
        bicis.add(bici2);
        bicis.add(bici3);
        
        System.out.println("-----Bicicletas-----\n");
        imprimirBicis(bicis);
        System.out.println("--------------------\n");
        System.out.println("-Bicis que cumplen con los requisitos: " + cantServiciosPosibles(bicis));
        
        
    }

    public static int cantServiciosPosibles(ArrayList<Bicicleta> bicis) {
        int cantServicios = 0;
        
        for(Bicicleta bici : bicis) {
            if (bici.cumpleConServicio()) {
                cantServicios++;
            }
        }
        
        return cantServicios;
        
    }
    
    public static void imprimirBicis(ArrayList<Bicicleta> bicis){
        for(Bicicleta b : bicis){
            System.out.println(b.toString());
        }
    }

}
