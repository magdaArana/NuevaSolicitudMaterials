package uia.ingenieriadesoftware.tareas;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;
        ArrayList<String> listaProductos = new ArrayList<>();
        List<Empleado> empleadoList = new ArrayList<>();
        double cantidad = 0;
        double precioTotal = 0;


        do{
            System.out.println("Elige una opcion:");
            System.out.println("1.- NUEVA SOLICITUD MATERIAL");
            System.out.println("2.- SALIR ");
            opcion = Integer.parseInt(bufer.readLine());


            switch (opcion){
                case 1:
                    SalidaInventario si = new SalidaInventario();
                    si.nuevaSalidaMaterial(listaProductos, cantidad, precioTotal);
                    SolicitudMaterial sm = new SolicitudMaterial();
                    sm.nuevaSolicitudMaterial(empleadoList);
                    FormaSolicitudMaterial fs = new FormaSolicitudMaterial();
                    fs.nuevaFormaSolicitudMaterial();
                    fs.formaSolicitudMaterial();
                    sm.solicitudMaterial();
                    si.idSolicitudTmp();

                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }while (opcion < 1);

    }
}
