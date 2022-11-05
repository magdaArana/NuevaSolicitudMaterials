package uia.ingenieriadesoftware.tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormaSolicitudMaterial {
    double stockr = 0;
    double stocks = 0;


    public void nuevaFormaSolicitudMaterial() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("LLENE LOS SIGUIENTES CAMPOS:");
        System.out.println("INGRESA STOCK TOTAL RESTANTE: ");
        stockr = Double.parseDouble(buffer.readLine());
        System.out.println("INGRESA STOCK SOLICITADO: ");
        stocks = Double.parseDouble(buffer.readLine());


    }


    public void formaSolicitudMaterial() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        if (stockr <= stocks ){
            System.out.println("SE ENTREGA FORMA SOLICITUD MATERIAL");
            System.out.println("INGRESA PROVEDOR");
            String provedor = buffer.readLine();

        }else {
            System.out.println("AUN HAY EXISTENCIA DE MATERIAL");
        }

    }


}

