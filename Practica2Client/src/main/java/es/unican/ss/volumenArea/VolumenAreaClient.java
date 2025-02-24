package es.unican.ss.volumenArea;

public class VolumenAreaClient {

    public static void main (String[] args) {
        VolumenArea volumenArea = new VolumenArea();
        VolumenAreaInterface volumenAreaInterface = volumenArea.getSOAPPort();


        //A
        Dimensiones dimensiones = new Dimensiones();
        dimensiones.setAlto(5.0);
        dimensiones.setAncho(10.0);
        dimensiones.setLargo(10.0);
        try{
            System.out.println("Dimensiones para Ancho: " + dimensiones.ancho +", Alto: " + dimensiones.alto +", Largo: " + dimensiones.largo);
            System.out.println(volumenAreaInterface.area(dimensiones));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------------------------------------");

        //B
        Dimensiones dimensiones2 = new Dimensiones();
        dimensiones2.setAlto(5.0);
        dimensiones2.setLargo(2.0);
        dimensiones2.setAncho(10.0);
        try{
            System.out.println("Dimensiones para Ancho: " + dimensiones2.ancho +", Alto: " + dimensiones2.alto +", Largo: " + dimensiones2.largo);
            System.out.println(volumenAreaInterface.area(null));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
