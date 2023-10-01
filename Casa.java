public class Casa extends InmuebleVivienda {
    private int cantidadPisos;

    //Metodo Constructor.
    public Casa(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numeroHabitaciones, int numeroBanos, int cantidadPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBanos);
        this.cantidadPisos = cantidadPisos;
    }
    //Los Set and Get.
    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }
}


