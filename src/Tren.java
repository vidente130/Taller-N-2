import java.util.ArrayList;

public class Tren {

    private String identificador;

    private String ruta;

    private int Precioboleto;

    private String Descripcion;

    private String Funcionamiento;

    private ArrayList<Tren> trenes;

    public Tren (String identificador,String ruta,int Precioboleto, String Descripcion, String Funcionamiento){
        this.identificador = identificador;
        this.ruta = ruta;
        this.Precioboleto = Precioboleto;
        this.Descripcion = Descripcion;
        this.Funcionamiento = Funcionamiento;
        this.trenes = new ArrayList<>();
    }
    public String getIdentificador(){
        return identificador;
    }

    public String getRuta(){
        return ruta;
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
