public class Inmueble {
    private int identificadorInmobiliario;
    private int areaMetrosCuadrados;
    private String direccion;

    //Metodo Constructor.
    public Inmueble(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        this.direccion = direccion;
    }

    //Los Set and Get.
    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
    }

    public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
        this.identificadorInmobiliario = identificadorInmobiliario;
    }

    public int getAreaMetrosCuadrados() {
        return areaMetrosCuadrados;
    }

    public void setAreaMetrosCuadrados(int areaMetrosCuadrados) {
        this.areaMetrosCuadrados = areaMetrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}