package uia.ingenieriadesoftware.tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SolicitudMaterial {

    List<Empleado> empleadoList = new ArrayList<>();


    public void nuevaSolicitudMaterial(List<Empleado> empleadoList) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("LLENE LOS SIGUIENTES CAMPOS:");
        System.out.println("INGRESA NUMERO DE EMPLEADO");
        int numeroEmpleado = Integer.parseInt(buffer.readLine());
        System.out.println("INGRESA NOMBRE DE EMPLEADO");
        String nombre = buffer.readLine();
        System.out.println("INGRESA CARGO DE EMPLEADO");
        String cargo = buffer.readLine();

    }

    public void solicitudMaterial(){
        Date date = new Date();
        Empleado empleado = new Empleado();

        System.out.println("FECHA: " + date);
        empleado.toString();

    }
}

class Empleado{
    private int numeroEmpleado;
    private String nombre;
    private String cargo;

    public Empleado() {

    }

    public Empleado(int numeroEmpleado, String nombre, String cargo) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
