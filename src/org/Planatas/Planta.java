package org.Planatas;

abstract public class Planta {
    protected String nombre;
    protected String altodelTallo;
    protected String tieneHojas;
    protected String climaIdeal;

    //construtores
    public Planta() {
    }

    public Planta(String nombre, String altodelTallo, String tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altodelTallo = altodelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }
    //getter ande setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAltodelTallo() {
        return altodelTallo;
    }

    public void setAltodelTallo(String altodelTallo) {
        this.altodelTallo = altodelTallo;
    }

    public String getTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(String tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    //metodo
    abstract public String climaidealClase();

    //toString

    @Override
    public String toString() {
        return
                "Nombre= " + nombre + ", " +
                "Alto del Tallo= " + altodelTallo +", "+
                "Tiene Hojas? " + tieneHojas + ", "+
                "Clima Ideal= " + climaIdeal + "\n";
    }
}
