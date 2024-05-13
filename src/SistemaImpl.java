import java.util.ArrayList;
import java.util.Scanner;


public class SistemaImpl implements Sistema {

    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Tren> trenes;

    public SistemaImpl() {
        this.trabajadores = new ArrayList<>();
        this.trenes = new ArrayList<>();
    }

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
                    registrarTrabajador();
                    break;
                case "3":
                    System.out.println("Actualizacion de funcionamiento de trenes");
                    actualizarFuncionamiento();
                    break;
                case "4":
                    System.out.println("Busqueda de viajes");


                    busquedaViajes();
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
        if (identificador.length() == 4) {
            if (Precioboleto <= 10000 || Precioboleto > 0){
                if (Descripcion.length() > 0){
                    if (Funcionamiento == "SI" || Funcionamiento == "NO"){
                        Tren tren = new Tren(identificador, Precioboleto, Descripcion, Funcionamiento);
                        trenes.add(tren);

                    }
                    else{
                        System.out.println("No elegio la opcion SI o NO");
                    }
                }
                else{
                    System.out.println("No le puso descripcion");
                }
            }
            else{
                System.out.println("El precio del boleto no tiene que ser superior a 10000, ni menor a 0");
            }
        }
        else{
            System.out.println("El identificador no tiene los 4 caracteres");
        }
    }

    public void registrarTrabajador() {

        System.out.println("Escriba el nombre completo del empleado ");
        String nombre = opcion.nextLine();

        System.out.println("Escriba el cargo del empleado ");
        String cargo = opcion.nextLine().toLowerCase();

        System.out.println("Escriba el salario del empleado ");
        int salario = opcion.nextInt();

        System.out.println("Escriba los anios de experiencia del empleado en numeros  ");
        int experiencia = opcion.nextInt();

        registrarTrabajador(nombre, cargo, salario, experiencia);

    }

    @Override
    public void registrarTrabajador(String nombre, String cargo, int salario, int experiencia) {
        if (nombre.length() > 0){
            if (cargo == "CONDUCTOR" || cargo == "PERSONAL DE SERVICIO" || cargo == "GUARDAFRENO" || cargo == "JEFE DE TREN"){
                if (salario > 0){
                    if (experiencia >= 0){
                        Trabajador trabajador = new Trabajador(nombre, cargo, salario, experiencia);
                        trabajadores.add(trabajador);
                    }
                    else{
                        System.out.println("Error, Los años de experiencia no pueden ser negativos");
                    }

                }
                else{
                    System.out.println("No puso salario valido");
                }

            }
            else{
                System.out.println("No puso bien el cargo");
            }

        }
        else{
            System.out.println("No puso un nombre");
        }

    }

    public void actualizarFuncionamiento(){
        System.out.println("Escriba el identificador del tren ");
        String trenBuscado = opcion.nextLine();

        actualizarFuncionamiento(trenBuscado);

    }

    @Override
    public void actualizarFuncionamiento(String trenBuscado ) {
        for (int i = 0; i < trenes.size(); i++){

            if (trenBuscado.equals(trenes.get(i).getIdentificador())){
                System.out.println("El tren se encuentra en funcionamiento");
                String pregunta = opcion.nextLine();

                switch (pregunta){

                    case "SI":
                        trenes.get(i).setFuncionamiento("Si");
                        break;



                    case "NO":
                        trenes.get(i).setFuncionamiento("No");
                        break;

                    default:
                        System.out.println("Respuesta no valida");
                }

            }
            else {
                System.out.println("El tren no se encuentra en la lista");
            }
        }

    }

    public void busquedaViajes(){
        System.out.println("Escriba el lugar donde desea ir ");
        String busqueda = opcion.nextLine();
        busquedaViajes(busqueda);

    }

    @Override

    public void busquedaViajes(String busqueda) {



    }

    @Override
    public void estadisticas() {

    }
}
