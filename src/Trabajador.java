import java.util.ArrayList;

public class Trabajador {

    private String nombrecompleto;

    private String cargo;

    private int salario;

    private int experiencia;

    private ArrayList<Trabajador> trabajadores;

    public Trabajador (String nombrecompleto, String cargo, int salario, int experiencia){
        this.nombrecompleto = nombrecompleto;
        this.cargo = cargo;
        this.salario = salario;
        this.experiencia = experiencia;
        this.trabajadores = new ArrayList<>();
    }

    public String getNombrecompleto(){
        return nombrecompleto;
    }
    public String getCargo(){
        return cargo;
    }

    public int getSalario(){
        return salario;
    }

    public int getExperiencia(){
        return experiencia;
    }

    public ArrayList<Trabajador> getTrabajadores() {

        return trabajadores;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

