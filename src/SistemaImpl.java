import java.util.Scanner;

public class SistemaImpl implements Sistema {

    Scanner opcion = new Scanner (System.in);
    @Override
    public void menu() {

        mensajeMenu();
        String Opcion = opcion.nextLine();
        while (true){
            switch(Opcion){
                case "1":
                    System.out.println("Registrar trenes");
                    registrarTren();

                    break;
                case "2":
                    System.out.println("Registrar empleado");

                    System.out.println("Escriba el nombre completo del empleado ");
                    String nombre = opcion.nextLine();

                    System.out.println("Escriba el cargo del empleado ");
                    String cargo = opcion.nextLine();

                    System.out.println("Escriba el salario del empleado ");
                    int salario = opcion.nextInt();

                    System.out.println("Escriba los anios de experiencia del empleado en numeros  ");
                    int experiencia = opcion.nextInt();

                    registrarTrabajador(nombre, cargo, salario, experiencia);
                    break;
                case "3":
                    System.out.println("Actualizacion de funcionamiento de trenes");

                    System.out.println("Escriba el identificador del tren ");
                    String trenBuscado = opcion.nextLine();

                    actualizarFuncionamiento(trenBuscado);
                    break;
                case "4":
                    System.out.println("Busqueda de viajes");

                    System.out.println("Escriba el lugar donde desea ir ");
                    String busqueda = opcion.nextLine();
                    busquedaViajes(busqueda);

                    break;
                case "5":
                    System.out.println("Estadisticas");
                    estadisticas();

                    break;
                case "6":
                    System.out.println("¶ Saliendo del sistema ");

                    return;


            }
            mensajeMenu();
            Opcion = opcion.nextLine();
        }

    }
    @Override
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

    public void registrarTren(){


        System.out.println("Elija un identificador del tren ");
        String identificador = opcion.nextLine();

        System.out.println("Escriba el precio del boleto ");
        int precio = opcion.nextInt();

        System.out.println("Escriba una descripcion al tren ");
        String descripcion = opcion.nextLine();

        System.out.println("Escriba si el tren esta en funcionamiento con un SI o un NO ");
        String funcionamiento = opcion.nextLine().toUpperCase();

        registrarTren(identificador, precio, descripcion,funcionamiento);

    }

    @Override
    public void registrarTren(String identificador,int Precioboleto, String Descripcion, String Funcionamiento) {

    }

    public void registrarTrabajador() {


    }

    @Override
    public void registrarTrabajador(String nombre, String cargo, int salario, int experiencia) {


    }

    @Override
    public void actualizarFuncionamiento(String trenBuscado ) {

    }

    @Override
    public void busquedaViajes(String busqueda) {


    }

    @Override
    public void estadisticas() {

    }
}
