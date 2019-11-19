package cl.inacap.rca_apr.modelo;

import java.util.Date;

public class Paciente {

    private String nombre;
    private String apellido;
    private int edad;
    private String diag;
    private boolean estado;
    private static final boolean TRATAMIENTO=true;
    private String osb;

    //Constructor

    public Paciente(String nombre, String apellido, int edad, String diag, String osb){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.diag = diag;
        this.osb = osb;
        this.estado = TRATAMIENTO;
    }

    //GET AND SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDiag(){ return diag;}

    public void setDiag(String diag){ this.diag = diag;}

    public String getOsb(){ return osb;}

    public void setOsb(String osb){ this.osb = osb;}

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //ToString mostrar lista

    @Override
    public String toString(){
        String tratamiento;
        if (estado) {
            tratamiento = "En tratamiento";
        }else{
            tratamiento = " Dada de alta";
        }
        return nombre + ": " + tratamiento;
    }
}
