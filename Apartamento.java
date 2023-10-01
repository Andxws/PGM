public class Apartamento extends InmuebleVivienda {
    private double valorAdministracion;

    //Metodo Constructor.
    public Apartamento(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numeroHabitaciones, int numeroBanos, double valorAdministracion) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }

    //Los Set and Get.

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }
}