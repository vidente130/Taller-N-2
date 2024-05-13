import java.util.ArrayList;
import java.util.Scanner;

public class RutaAntofa {
   Scanner sc = new Scanner(System.in);

    private ArrayList<String> rutaA;

    private ArrayList<String> rutaB;

    private ArrayList<String> rutaC;

    private ArrayList<String> rutaD;

    public RutaAntofa (){
        this.rutaA = new ArrayList<>();
        this.rutaB = new ArrayList<>();
        this.rutaC = new ArrayList<>();
        this.rutaD = new ArrayList<>();
        //RUTA A
        rutaA.add("UNIVERSIDAD DE ANTOFAGASTA");
        rutaA.add("COVIEFI");
        rutaA.add("UNIVERSIDAD CATOLICA DEL NORTE");
        rutaA.add("JUMBO NORTE");
        rutaA.add("AVENIDA BRASIL");
        rutaA.add("MALL PLAZA");
        rutaA.add("MUNICIPALIDAD");
        rutaA.add("TERMINAL DE BUSES");
        //RUTA B
        rutaB.add("UNIVERSIDAD DE ANTOFAGASTA");
        rutaB.add("UNIVERSIDAD CATOLICA DEL NORTE");
        rutaB.add("PLAYA BALNEARIO");
        rutaB.add("PLAZA COLON");
        rutaB.add("AVENIDA SALVADOR ALLENDE");
        rutaB.add("HOSPITAL REGIONAL");
        //RUTA C
        rutaC.add("COVIEFI");
        rutaC.add("ENJOY");
        rutaC.add("COSTANERA");
        rutaC.add("PLAYA BALNEARIO");
        rutaC.add("AVENIDA BRASIL");
        rutaC.add("HOSPITAL ANTIGUO");
        rutaC.add("CEMENTERIO REGIONAL");
        rutaC.add("MERCADO CENTRAL");
        //RUTA D
        rutaD.add("UNIVERSIDAD CATOLICA DEL NORTE");
        rutaD.add("PLAZA JARDIN JAPONES");
        rutaD.add("JUMBO NORTE");
        rutaD.add("COSTANERA");
        rutaD.add("MALL PLAZA");
        rutaD.add("PUERTO");
        rutaD.add("TERMINAL DE BUSES");
        rutaD.add("PLAZA BICENTENARIA");

    }


    public void  estaEnRuta(){
        System.out.println("Por que ruta desea ir");
        String tipoRuta = sc.nextLine();
        System.out.println("A que localidad desea ir");
        String localidad = sc.nextLine();

        estaEnRuta(localidad,tipoRuta);
    }

    public boolean estaEnRuta(String localidad, String tipoRuta){
        
        if (tipoRuta.equalsIgnoreCase("a") ){

            if( rutaA.contains(localidad)){
                System.out.println("La localidad a la que desea se encuentra en esta ruta");
                return true;

            }
            else {
                System.out.println("La localidad a la que desea NO se encuentra en esta ruta");
                return false;
            }

        }
        if (tipoRuta.equalsIgnoreCase("b") ){

            if(rutaB.contains(localidad)){
                System.out.println("La localidad a la que desea se encuentra en esta ruta");
                return true;

            }
            else {
                System.out.println("La localidad a la que desea NO se encuentra en esta ruta");
                return false;
            }

        }
        if (tipoRuta.equalsIgnoreCase("c") ){

            if (rutaC.contains(localidad)){
                System.out.println("La localidad a la que desea se encuentra en esta ruta");
                return true;

            }
            else {
                System.out.println("La localidad a la que desea NO se encuentra en esta ruta");
                return false;
            }

        }
        if (tipoRuta.equalsIgnoreCase("d") ){

            if (rutaD.contains(localidad)){
                System.out.println("La localidad a la que desea se encuentra en esta ruta");
                return true;

            }
            else {
                System.out.println("La localidad a la que desea NO se encuentra en esta ruta");
                return false;
            }

        }

        return false;
    }
}
