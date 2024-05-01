public class Tren {

    private String identificador;

    private int Precioboleto;

    private String Descripcion;

    private String Funcionamiento;

    public Tren (String identificador,int Precioboleto, String Descripcion, String Funcionamiento){
        this.identificador = identificador;
        this.Precioboleto = Precioboleto;
        this.Descripcion = Descripcion;
        this.Funcionamiento = Funcionamiento;
    }
    public String getIdentificador(){
        return identificador;
    }
    public int getPrecioboleto(){
        return Precioboleto;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public String getFuncionamiento(){
        return Funcionamiento;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setPrecioboleto(int precioboleto) {
        Precioboleto = precioboleto;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setFuncionamiento(String funcionamiento) {
        Funcionamiento = funcionamiento;
    }
}
