package org.Planatas;

public class Arbusto extends Planta implements IMensaje{
    private String anchodeArbusto;
    private String esDomestico;
    private String variedaddeArbusto;
    private String colordeHojas;
    private String sePodaONo;

    //constructores


    public Arbusto() {
    }

    public Arbusto(String anchodeArbusto, String esDomestico, String variedaddeArbusto, String colordeHojas, String sePodaONo) {
        this.anchodeArbusto = anchodeArbusto;
        this.esDomestico = esDomestico;
        this.variedaddeArbusto = variedaddeArbusto;
        this.colordeHojas = colordeHojas;
        this.sePodaONo = sePodaONo;
    }

    public Arbusto(String nombre, String altodelTallo, String tieneHojas, String climaIdeal, String anchodeArbusto,
                   String esDomestico, String variedaddeArbusto, String colordeHojas, String sePodaONo) {
        super(nombre, altodelTallo, tieneHojas, climaIdeal);
        this.anchodeArbusto = anchodeArbusto;
        this.esDomestico = esDomestico;
        this.variedaddeArbusto = variedaddeArbusto;
        this.colordeHojas = colordeHojas;
        this.sePodaONo = sePodaONo;
    }
    //getter and setter

    public String getEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(String esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getAnchodeArbusto() {
        return anchodeArbusto;
    }

    public void setAnchodeArbusto(String anchodeArbusto) {
        this.anchodeArbusto = anchodeArbusto;
    }

    public String getVariedaddeArbusto() {
        return variedaddeArbusto;
    }

    public void setVariedaddeArbusto(String variedaddeArbusto) {
        this.variedaddeArbusto = variedaddeArbusto;
    }

    public String getColordeHojas() {
        return colordeHojas;
    }

    public void setColordeHojas(String colordeHojas) {
        this.colordeHojas = colordeHojas;
    }

    public String getSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(String sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    @Override
    public String saludar() {
        return "Hola soy un Arbusto "+nombre;
    }
    @Override
    public String climaidealClase() {
        return "Me gusta mucho el clima "+climaIdeal;
    }
    //toString

    @Override
    public String toString() {
        return super.toString() +
                "Ancho de Arbusto= " + anchodeArbusto + ", "+
                "Es Domestico? " + esDomestico + ", "+
                "Variedad de Arbusto= " + variedaddeArbusto + ", " +
                "Color de Hojas= " + colordeHojas +", " +
                "Se poda? " + sePodaONo;
    }
}
