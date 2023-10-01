public class CasaUrbana extends Casa {
    private boolean conjuntoCerrado;
    private double valorAdministracion;
    private boolean areasComunes;
    
    //Metodo constructor.
    public CasaUrbana(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numeroHabitaciones, int numeroBanos, int cantidadPisos, boolean conjuntoCerrado, double valorAdministracion, boolean areasComunes) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBanos, cantidadPisos);
        this.conjuntoCerrado = conjuntoCerrado;
        this.valorAdministracion = valorAdministracion;
        this.areasComunes = areasComunes;
    }

    public boolean isConjuntoCerrado() {
        return conjuntoCerrado;
    }

    public void setConjuntoCerrado(boolean conjuntoCerrado) {
        this.conjuntoCerrado = conjuntoCerrado;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public boolean isAreasComunes() {
        return areasComunes;
    }

    public void setAreasComunes(boolean areasComunes) {
        this.areasComunes = areasComunes;
    }

}
