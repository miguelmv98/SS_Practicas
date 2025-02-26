package es.unican.ss.Practica3.estimacionesTUS;

import com.fasterxml.jackson.databind.ObjectMapper;
import es.unican.ss.Practica3.estimacionesTUS.bussinesAyto.ContenedorParadas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Utils {

    public static int getParadaId(String parada) {
        int output;
        ContenedorParadas contenedor = null;
        try {
            URL url = new URL("http://datos.santander.es/api/rest/datasets/paradas_bus.json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            if (conn.getResponseCode() != 200) {
                System.out.println("Failed : HTTP error code : " + conn.getResponseCode());
            } else {
                InputStream response = conn.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(response));
                ObjectMapper mapper = new ObjectMapper();
                contenedor = mapper.readValue(br, ContenedorParadas.class);
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if( contenedor!= null){
            return contenedor.findParadaId(parada);
        }else{
            return 0;
        }
    }
}