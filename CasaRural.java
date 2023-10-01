public class CasaRural extends Casa {
    private int distanciaCabeceraMunicipal;
    private int altitudNivelMar;

    public CasaRural(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numeroHabitaciones, int numeroBanos, int cantidadPisos, int distanciaCabeceraMunicipal, int altitudNivelMar) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBanos, cantidadPisos);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitudNivelMar = altitudNivelMar;
    }
    
    //Los Set and Get.
    public int getDistanciaCabeceraMunicipal() {
        return distanciaCabeceraMunicipal;
    }

    public void setDistanciaCabeceraMunicipal(int distanciaCabeceraMunicipal) {
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
    }

    public int getAltitudNivelMar() {
        return altitudNivelMar;
    }

    public void setAltitudNivelMar(int altitudNivelMar) {
        this.altitudNivelMar = altitudNivelMar;
    }
}