package es.unican.ss.Practica3.estimacionesTUS;

import com.fasterxml.jackson.databind.ObjectMapper;
import es.unican.ss.Practica3.estimacionesTUS.bussinesAyto.LineaParadaStatus;
import es.unican.ss.Practica3.estimacionesTUS.bussinesAyto.LineasParadaResponse;
import es.unican.ss.Practica3.estimacionesTUS.bussinesAyto.ParadasResponse;
import es.unican.ss.Practica3.estimacionesTUS.numberToWords.NumberConversion;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;

public class Utils {

    public static int getParadaId(String parada) {
        int output = 0;
        ParadasResponse contenedor = null;
        try {
            URL url = new URL("http://datos.santander.es/api/rest/datasets/paradas_bus.json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            if (conn.getResponseCode() != 200) {
                System.out.println("Failed : HTTP error code : " + conn.getResponseCode());
            } else {
                InputStream response = conn.getInputStream();
                ObjectMapper mapper = new ObjectMapper();
                contenedor = mapper.readValue(response, ParadasResponse.class);
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if( contenedor!= null){
            output = contenedor.findParadaId(parada);
        }
        return output;
    }

    public static ProximosAutobuses getProximosAutobuses(int idParada, String linea) {
        ProximosAutobuses output = null;
        LineasParadaResponse contenedor = null;
        try {
            URL url = new URL("https://datos.santander.es/api/rest/datasets/control_flotas_estimaciones.json?query=ayto\\:paradaId:"+idParada);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            if (conn.getResponseCode() != 200) {
                System.out.println("Failed : HTTP error code : " + conn.getResponseCode());
            } else {
                InputStream response = conn.getInputStream();
                ObjectMapper mapper = new ObjectMapper();
                contenedor = mapper.readValue(response, LineasParadaResponse.class);
            }
            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if( contenedor!= null){
            output= convertToPRoximosAutobuses(contenedor.findLineaStatusByLinea(linea));
        }
        return output;
    }

    private static ProximosAutobuses convertToPRoximosAutobuses(LineaParadaStatus lineaStatus) {
        ProximosAutobuses output = null;
        if(lineaStatus!=null){
            output= new ProximosAutobuses();
            output.setPrimeroMinutos(lineaStatus.getPrimeroSegundos()/60);
            output.setSegundoMinutos(lineaStatus.getSegundoSegundos()/60);
            output.setPrimeroTexto(getTimeAsString(output.getPrimeroMinutos()));
            output.setSegundoTexto(getTimeAsString(output.getSegundoMinutos()));
        }
        return output;
    }

    private static String getTimeAsString(int minutes){
        NumberConversion numberConversion = new NumberConversion();
        return numberConversion.getNumberConversionSoap().numberToWords(BigInteger.valueOf(minutes));
    }
}