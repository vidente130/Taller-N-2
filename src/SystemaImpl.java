import java.util.Scanner;

public class SystemaImpl {

    public void menu() {
        Scanner opcion = new Scanner (System.in);
        mensajeMenu();
        String Opcion = opcion.nextLine();
        while (true){
            switch(Opcion){
                case "1":
                    System.out.println("Elija un identificador del tren");
                    String identificador = opcion.nextLine();
                    if (identificador.length() == 4){

                        System.out.println("Se guardo el identificador que es:");
                    }
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":

                    return;


            }
            mensajeMenu();
            Opcion = opcion.nextLine();
        }

    }

    public void mensajeMenu(){
        System.out.println("Bienvenido a Oasis rail Hub");
        System.out.println("1.- Para registrar tren.");
        System.out.println("2.- Para registrar trabajador.");
        System.out.println("3.- Para actualizar funcionamiento de trenes.");
        System.out.println("4.- Para Busqueda de viajes.");
        System.out.println("5.- Para estadisticas.");
        System.out.println("6.- Para salir y guardar");
        System.out.println("Elija una opcion:");
    }
}
