package uia.ingenieriadesoftware.tareas;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SalidaInventario {

    public void nuevaSalidaMaterial(List<String> listaProductos, double cantidad, double precioTotal)throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;
        String producto[] = {"BULTO DE CEMENTO", "LADRILLO", "YESO", "COLUMNA"};
        double precios[] = {300, 8, 300, 2000};

        System.out.println("PRODUCTOS DISPONIBLES");
        for (int i = 0; i < 4; i++) {
            System.out.println(producto[i] + "$" + precios[i]);
        }

        System.out.println("Ingresa cantidad de productos aprobados");
        cantidad = Double.parseDouble(buffer.readLine());
        System.out.println("Ingresa precio total aprobado");
        precioTotal = Double.parseDouble(buffer.readLine());


        System.out.println("Total es: " + precioTotal);

    }

    public void idSolicitudTmp(){
        Random random = new Random();
        int idSolicitudTmp = random.nextInt(500);
        System.out.println("Su Id de Solicitud Temporal es: " + idSolicitudTmp);
    }

}