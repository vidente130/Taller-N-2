public interface Sistema {


    void menu();

    void mensajeMenu();


    //los campos no pueden estar vacios
    void registrarTren(String identificador,String tipoderuta,int Precioboleto, String Descripcion, String Funcionamiento);


    void registrarTrabajador(String nombre, String cargo, int salario, int experiencia);



    void actualizarFuncionamiento(String trenBuscado );

    void busquedaViajes(String busqueda);

    void estadisticas();


}
