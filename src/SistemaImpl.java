import edu.princeton.cs.stdlib.In;
import edu.princeton.cs.stdlib.Out;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaImpl implements Sistema {

    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Tren> trenes;

    Scanner sc = new Scanner(System.in);

    private ArrayList<String> rutaA;

    private ArrayList<String> rutaB;

    private ArrayList<String> rutaC;

    private ArrayList<String> rutaD;

    public SistemaImpl() {
        this.trabajadores = new ArrayList<>();
        this.trenes = new ArrayList<>();
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
                    System.out.println("¶ Saliendo del sistema");
                    SaliryGuardar();
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

        System.out.println("¿Que ruta quiere para el tren?(A,B,C o D)");
        String RutaParaelegir = opcion.nextLine();

        System.out.println("Escriba el precio del boleto ");
        int precio = opcion.nextInt();

        opcion.nextLine();

        System.out.println("Escriba una descripcion al tren");
        String descripcion = opcion.nextLine();

        System.out.println("Escriba si el tren esta en funcionamiento con un SI o un NO ");
        String funcionamiento = opcion.nextLine().toUpperCase();

        registrarTren(identificador, RutaParaelegir,precio, descripcion,funcionamiento);

    }

    /**
     * Esta funcion permite registra un Tren
     * @param identificador El identificador del tren
     * @param tipoderuta El tipo de ruta que va
     * @param Precioboleto El precio de su boleto
     * @param Descripcion La descripocion del tren
     * @param Funcionamiento Si esta en funcionamiento o no
     */
    @Override
    public void registrarTren(String identificador,String tipoderuta,int Precioboleto, String Descripcion, String Funcionamiento) {
        if (identificador.length() == 4) {
            if (tipoderuta.equalsIgnoreCase("A") || tipoderuta.equalsIgnoreCase("B") || tipoderuta.equalsIgnoreCase("C") || tipoderuta.equalsIgnoreCase("D")) {
                if (Precioboleto <= 10000 || Precioboleto > 0) {
                    if (Descripcion.length() > 0) {
                        if (Funcionamiento.equalsIgnoreCase("si") || Funcionamiento.equalsIgnoreCase("no")) {
                            Tren tren = new Tren(identificador,tipoderuta,Precioboleto, Descripcion, Funcionamiento);
                            trenes.add(tren);

                        } else {
                            System.out.println("No elegio la opcion SI o NO");
                        }
                    } else {
                        System.out.println("No le puso descripcion");
                    }
                } else {
                    System.out.println("El precio del boleto no tiene que ser superior a 10000, ni menor a 0");
                }
            }
            else{
                System.out.println("Error,no elegio una de las rutas");
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

    /**
     *  Esta funcion permite registrar a un trabajador
     * @param nombre El nombre completo del trabajador
     * @param cargo El cargo del trabajador
     * @param salario El salario del trabajador
     * @param experiencia Los anios de experiencia del trabajador
     */
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

    /**
     * Esta funcion permite actualizar el funcionamiento del tren
     * @param trenBuscado Busca un tren dentro de la lista de trenes
     */
    @Override
    public void actualizarFuncionamiento(String trenBuscado) {
        int posicion2 = 0;
        for (int i = 0; i < trenes.size(); i++){
            if (trenBuscado.equalsIgnoreCase(trenes.get(i).getIdentificador())){
                posicion2 = i;
            }
        }
        if (trenBuscado.equalsIgnoreCase(trenes.get(posicion2).getIdentificador())){
            System.out.println("El tren se encuentra en funcionamiento");
            String pregunta = opcion.nextLine();

            switch (pregunta) {

                case "SI":
                    trenes.get(posicion2).setFuncionamiento("Si");
                    break;

                case "NO":
                    trenes.get(posicion2).setFuncionamiento("No");
                    break;

                default:
                    System.out.println("Respuesta no valida");
            }
        }
        else{
            System.out.println("El tren no se encuentra en la lista");
        }

    }

    public void busquedaViajes(){
        for (int i = 0;i < trenes.size(); i++) {
            System.out.println("Tren numero "+ (i + 1));
            System.out.println(trenes.get(i).getIdentificador());
            System.out.println("---------------------");
        }
        System.out.println("¿Cual opcion de busqueda quiere elegir (Ubicacion o Funcionamiento)?");
        String busqueda = opcion.nextLine();
        busquedaViajes(busqueda);
    }

    /**
     * Esta funcion permite realizar una busqueda de viajes
     * @param busqueda Es la opcion si es por ubicacion o por funcionamiento
     */
    @Override
    public void busquedaViajes(String busqueda){

        if (busqueda.equalsIgnoreCase("UBICACION")){
            estaEnRuta();
            for (int i = 0; i < trenes.size(); i++){
                if (trenes.get(i).getRuta().equalsIgnoreCase("A")){
                    System.out.println(trenes.get(i).getIdentificador());
                    System.out.println(trenes.get(i).getPrecioboleto());
                    System.out.println(trenes.get(i).getDescripcion());
                }
                if (trenes.get(i).getRuta().equalsIgnoreCase("B")) {
                    System.out.println(trenes.get(i).getIdentificador());
                    System.out.println(trenes.get(i).getPrecioboleto());
                    System.out.println(trenes.get(i).getDescripcion());
                }
                if (trenes.get(i).getRuta().equalsIgnoreCase("C")) {
                    System.out.println(trenes.get(i).getIdentificador());
                    System.out.println(trenes.get(i).getPrecioboleto());
                    System.out.println(trenes.get(i).getDescripcion());
                }
                if (trenes.get(i).getRuta().equalsIgnoreCase("D")) {
                    System.out.println(trenes.get(i).getIdentificador());
                    System.out.println(trenes.get(i).getPrecioboleto());
                    System.out.println(trenes.get(i).getDescripcion());
                }
            }
        }
        if (busqueda.equalsIgnoreCase("FUNCIONAMIENTO")){
            for (int i = 0; i < trenes.size();i++){
                if (trenes.get(i).getFuncionamiento().equalsIgnoreCase("SI")){
                    System.out.println(trenes.get(i).getIdentificador());
                    System.out.println(trenes.get(i).getPrecioboleto());
                    System.out.println(trenes.get(i).getDescripcion());
                }
            }
        }

        trenMasBarato();

    }

    @Override
    public void estadisticas() {
        estadistica1();
        estadistica2();
        estadistica3();
    }

    public void  estaEnRuta(){
        System.out.println("Por que ruta desea ir");
        String tipoRuta = sc.nextLine();
        System.out.println("A que localidad desea ir");
        String localidad = sc.nextLine();

        estaEnRuta(localidad,tipoRuta);
    }

    /**
     * Esta funcion permite ver si existe la localidad que se eligio
     * @param localidad La localidad que se eligio
     * @param tipoRuta La ruta que se eligio
     * @return retorna true si es verdadero el tipo de ruta con su localidad o false si no cumple la condicion
     */
    public boolean estaEnRuta(String localidad, String tipoRuta){

        if (tipoRuta.equalsIgnoreCase("A") ){

            if( rutaA.contains(localidad)){
                System.out.println("La localidad a la que desea se encuentra en esta ruta");
                return true;

            }
            else {
                System.out.println("La localidad a la que desea NO se encuentra en esta ruta");
                return false;
            }

        }
        if (tipoRuta.equalsIgnoreCase("B") ){

            if(rutaB.contains(localidad)){
                System.out.println("La localidad a la que desea se encuentra en esta ruta");
                return true;

            }
            else {
                System.out.println("La localidad a la que desea NO se encuentra en esta ruta");
                return false;
            }

        }
        if (tipoRuta.equalsIgnoreCase("C") ){

            if (rutaC.contains(localidad)){
                System.out.println("La localidad a la que desea se encuentra en esta ruta");
                return true;

            }
            else {
                System.out.println("La localidad a la que desea NO se encuentra en esta ruta");
                return false;
            }

        }
        if (tipoRuta.equalsIgnoreCase("D") ){

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
    public void trenMasBarato(){
        int precioBarato = 9000000;
        int posicion = 0;
        for (int i = 0; i < trenes.size(); i++){
            if (trenes.get(i).getPrecioboleto() < precioBarato){
                precioBarato = trenes.get(i).getPrecioboleto();
                posicion = i;
            }
        }
        System.out.println("El tren mas barato tiene estas caracteristicas: ");
        System.out.println(trenes.get(posicion).getIdentificador());
        System.out.println(trenes.get(posicion).getPrecioboleto());
        System.out.println(trenes.get(posicion).getDescripcion());
    }

    public void estadistica1(){
        double contador = 0;
        double contadorTotal = 0;
        for (int i = 0; i < trenes.size(); i++){
            contadorTotal = contadorTotal + 1;
            if (trenes.get(i).getFuncionamiento().equalsIgnoreCase("NO")){
                contador = contador + 1;
                System.out.println(contador);
            }
        }
        if (contadorTotal == 0){
            System.out.println("La lista de los trenes esta vacia");
        }
        else{
            double porcentaje = (contador/contadorTotal) * 100;
            System.out.println("El porcentaje de los trenes inactivos es del: "+ porcentaje +"%");
        }
    }
    public void estadistica2 (){
        int sumaDePrecios = 0;
        int contador2 = 0;
        for (int i = 0; i < trenes.size(); i++){
            contador2 += 1;
            sumaDePrecios += trenes.get(i).getPrecioboleto();
        }
        if (contador2 == 0){
            System.out.println("La lista de los trenes esta vacia");
        }
        else{
            double promedio = sumaDePrecios/contador2;
            System.out.println("El promedio de los precios de cada tren en la lista es de: " + promedio + "$");
        }

    }

    public void estadistica3(){
        int sumaDePreciosA = 0;
        int sumaDePreciosB = 0;
        int sumaDePreciosC = 0;
        int sumaDePreciosD = 0;

        for (int i = 0; i < trenes.size(); i++){
            if(trenes.get(i).getRuta().equalsIgnoreCase("A")){
                sumaDePreciosA += trenes.get(i).getPrecioboleto();
            }
            if(trenes.get(i).getRuta().equalsIgnoreCase("B")){
                sumaDePreciosB += trenes.get(i).getPrecioboleto();
            }
            if(trenes.get(i).getRuta().equalsIgnoreCase("C")){
                sumaDePreciosC += trenes.get(i).getPrecioboleto();
            }
            if(trenes.get(i).getRuta().equalsIgnoreCase("D")){
                sumaDePreciosD += trenes.get(i).getPrecioboleto();
            }
        }
        System.out.println("La suma de los precios de la ruta A es de: "+ sumaDePreciosA + "$");
        System.out.println("La suma de los precios de la ruta B es de: "+ sumaDePreciosB + "$");
        System.out.println("La suma de los precios de la ruta C es de: "+ sumaDePreciosC + "$");
        System.out.println("La suma de los precios de la ruta D es de: "+ sumaDePreciosD + "$");
    }
    public void SaliryGuardar(){
        In in  = new In("Viajes");
        Out out = new Out("Viajes");

        System.out.println("trenes");
        for(int i =0; i<trenes.size(); i++) {

            System.out.println(trenes.get(i).getIdentificador() + " " + trenes.get(i).getRuta()  + " "
                    + trenes.get(i).getPrecioboleto() + " " + trenes.get(i).getDescripcion() + " " +
                    trenes.get(i).getFuncionamiento());
        }

        System.out.println("trabajadores");
        for (int i =0; i<trabajadores.size(); i++){

            System.out.println(trabajadores.get(i).getNombrecompleto() + " " + trabajadores.get(i).getCargo()
            + " " + trabajadores.get(i).getSalario() + " " + trabajadores.get(i).getExperiencia());

        }

        System.out.println("estadisticas");
        double contador = 0;
        double contadorTotal = 0;
        double porcentaje = 0;
        for (int i = 0; i < trenes.size(); i++){
            contadorTotal = contadorTotal + 1;
            if (trenes.get(i).getFuncionamiento().equalsIgnoreCase("NO")){
                contador = contador + 1;
                System.out.println(contador);
            }
        }
        if (contadorTotal == 0){
            System.out.println("La lista de los trenes esta vacia");
        }
        else{
            porcentaje = (contador/contadorTotal) * 100;
            System.out.println("El porcentaje de los trenes inactivos es del: "+ porcentaje +"%");
        }



        int sumaDePrecios = 0;
        int contador2 = 0;
        double promedio = 0;
        for (int i = 0; i < trenes.size(); i++){
            contador2 += 1;
            sumaDePrecios += trenes.get(i).getPrecioboleto();
        }
        if (contador2 == 0){
            System.out.println("La lista de los trenes esta vacia");
        }
        else{
            promedio = sumaDePrecios/contador2;
            System.out.println("El promedio de los precios de cada tren en la lista es de: " + promedio + "$");
        }




        int sumaDePreciosA = 0;
        int sumaDePreciosB = 0;
        int sumaDePreciosC = 0;
        int sumaDePreciosD = 0;

        for (int i = 0; i < trenes.size(); i++){
            if(trenes.get(i).getRuta().equalsIgnoreCase("A")){
                sumaDePreciosA += trenes.get(i).getPrecioboleto();
            }
            if(trenes.get(i).getRuta().equalsIgnoreCase("B")){
                sumaDePreciosB += trenes.get(i).getPrecioboleto();
            }
            if(trenes.get(i).getRuta().equalsIgnoreCase("C")){
                sumaDePreciosC += trenes.get(i).getPrecioboleto();
            }
            if(trenes.get(i).getRuta().equalsIgnoreCase("D")){
                sumaDePreciosD += trenes.get(i).getPrecioboleto();
            }
        }

        System.out.println("porcentaje de trenes innactivos " + porcentaje + "% " +"promedio de los precios en proporcion a los trenes registrados "
                + promedio + " La suma de los precios de los grupos: " + "A " + sumaDePreciosA   +"B " + sumaDePreciosB
                +"C " + sumaDePreciosC +"D " + sumaDePreciosD);


    }
}
