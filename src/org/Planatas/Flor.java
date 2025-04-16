package org.Planatas ;

public class Flor extends Planta implements IMensaje{
    private String colordePetalo;
    private String cantidadPromedodePetalos;
    private String colordelPistilo;
    private String colordelosPetalos;
    private String variedaddeFlor;
    private String estacionqueFlorece;

    //constructores

    public Flor() {
    }

    public Flor(String colordePetalo, String cantidadPromedodePetalos, String colordelPistilo
            , String colordelosPetalos, String variedaddeFlor, String estacionqueFlorece) {
        this.colordePetalo = colordePetalo;
        this.cantidadPromedodePetalos = cantidadPromedodePetalos;
        this.colordelPistilo = colordelPistilo;
        this.colordelosPetalos = colordelosPetalos;
        this.variedaddeFlor = variedaddeFlor;
        this.estacionqueFlorece = estacionqueFlorece;
    }

    public Flor(String nombre, String altodelTallo, String tieneHojas, String climaIdeal,
                String colordePetalo, String cantidadPromedodePetalos, String colordelPistilo, String colordelosPetalos,
                String variedaddeFlor, String estacionqueFlorece) {
        super(nombre, altodelTallo, tieneHojas, climaIdeal);
        this.colordePetalo = colordePetalo;
        this.cantidadPromedodePetalos = cantidadPromedodePetalos;
        this.colordelPistilo = colordelPistilo;
        this.colordelosPetalos = colordelosPetalos;
        this.variedaddeFlor = variedaddeFlor;
        this.estacionqueFlorece = estacionqueFlorece;
    }
    //getter and setter
    public String getColordePetalo() {
        return colordePetalo;
    }

    public void setColordePetalo(String colordePetalo) {
        this.colordePetalo = colordePetalo;
    }

    public String getCantidadPromedodePetalos() {
        return cantidadPromedodePetalos;
    }

    public void setCantidadPromedodePetalos(String cantidadPromedodePetalos) {
        this.cantidadPromedodePetalos = cantidadPromedodePetalos;
    }

    public String getColordelosPetalos() {
        return colordelosPetalos;
    }

    public void setColordelosPetalos(String colordelosPetalos) {
        this.colordelosPetalos = colordelosPetalos;
    }

    public String getVariedaddeFlor() {
        return variedaddeFlor;
    }

    public void setVariedaddeFlor(String variedaddeFlor) {
        this.variedaddeFlor = variedaddeFlor;
    }

    public String getColordelPistilo() {
        return colordelPistilo;
    }

    public void setColordelPistilo(String colordelPistilo) {
        this.colordelPistilo = colordelPistilo;
    }

    public String getEstacionqueFlorece() {
        return estacionqueFlorece;
    }

    public void setEstacionqueFlorece(String estacionqueFlorece) {
        this.estacionqueFlorece = estacionqueFlorece;
    }

    @Override
    public String saludar() {
        return "Hola soy una flor  "+ nombre;
    }

    @Override
    public String climaidealClase() {
        return "El clima que mas me gusta es "+climaIdeal;
    }
    //toString

    @Override
    public String toString() {
        return super.toString()+
                "colordePetalo='" + colordePetalo + '\'' +
                ", cantidadPromedodePetalos='" + cantidadPromedodePetalos + '\'' +
                ", colordelPistilo='" + colordelPistilo + '\'' +
                ", colordelosPetalos='" + colordelosPetalos + '\'' +
                ", variedaddeFlor='" + variedaddeFlor + '\'' +
                ", estacionqueFlorece='" + estacionqueFlorece + '\'' +
                '}';
    }
}
