import org.Planatas.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Arbol arbol=new Arbol("Roble","20-40m","Si",
                "Templado con estaciones marcadas","Roble rojo",
                "Leñoso,grueso,rugoso","0.5-15m","Marron","Caducas");

        Flor flor=new Flor("Rosa","30cm-1.5m","Si",
                "Templado,soleado y con buena ventilacion","Rojo",
                "20-40","Blanco","Blanco",
                "Rosa Blanca","Primavera y Verano");

        Arbusto arbusto=new Arbusto();
        arbusto.setNombre("Boj");
        arbusto.setAltodelTallo("0.5-3m");
        arbusto.setTieneHojas("Si");
        arbusto.setClimaIdeal("Templado a mediterraneo");
        arbusto.setAnchodeArbusto("1-2m");
        arbusto.setEsDomestico("Si");
        arbusto.setVariedaddeArbusto("Boj japones");
        arbusto.setColordeHojas("Verde");
        arbusto.setSePodaONo("Si, ideal para darle forma");

        System.out.println("----------------ARBOL-------------------");

        System.out.println(arbol);
        System.out.println(arbol.saludar());
        System.out.println(arbol.climaidealClase());

        System.out.println("----------------FLOR-------------------");

        System.out.println(flor);
        System.out.println(flor.saludar());
        System.out.println(flor.climaidealClase());

        System.out.println("----------------ARBUSTO-------------------");

        System.out.println(arbusto);
        System.out.println(arbusto.saludar());
        System.out.println(arbusto.climaidealClase());
    }

}