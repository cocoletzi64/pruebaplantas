package org.Planatas;

public class Arbol extends Planta implements IMensaje{
    private String variedad;
    private String tipodeTronco;
    private String radiodeTronco;
    private String color;
    private String tipodeHojas;

    //constructores

    public Arbol() {
    }


    public Arbol(String nombre, String altodelTallo, String tieneHojas, String climaIdeal, String variedad
            , String tipodeTronco, String radiodeTronco, String color, String tipodeHojas) {
        super(nombre, altodelTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipodeTronco = tipodeTronco;
        this.radiodeTronco = radiodeTronco;
        this.color = color;
        this.tipodeHojas = tipodeHojas;
    }
    //getter and setter

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipodeTronco() {
        return tipodeTronco;
    }

    public void setTipodeTronco(String tipodeTronco) {
        this.tipodeTronco = tipodeTronco;
    }

    public String getRadiodeTronco() {
        return radiodeTronco;
    }

    public void setRadiodeTronco(String radiodeTronco) {
        this.radiodeTronco = radiodeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipodeHojas() {
        return tipodeHojas;
    }

    public void setTipodeHojas(String tipodeHojas) {
        this.tipodeHojas = tipodeHojas;
    }
    //metodo
    @Override
    public String saludar() {
        return "Hola soy un Arbol "+nombre;
    }
    @Override
    public String climaidealClase() {
        return "Mi clima ideal es "+climaIdeal;
    }
    //toString

    @Override
    public String toString() {
        return super.toString()+
                "Variedad= " + variedad + ", " +
                "Tipo de Tronco= " + tipodeTronco + ", "+
                "Radio de Tronco= " + radiodeTronco + ", " +
                "Color= " + color + ", " +
                "Tipo de Hojas= " + tipodeHojas;
    }
}
