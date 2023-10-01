public class Main {
public static void main(String[] args) {

        // Creamos objetos de ejemplo.
        Inmueble inmueble = new Inmueble(1, 100, "Calle 123");
        InmuebleVivienda inmuebleVivienda = new InmuebleVivienda(2, 150, "Calle 456", 3, 2);
        Casa casa = new Casa(3, 200, "Calle 789", 4, 3, 2);
        CasaRural casaRural = new CasaRural(4, 250, "Calle 012", 5, 4, 3, 10, 100);
        CasaUrbana casaUrbana = new CasaUrbana(5, 300, "Calle 345", 6, 5, 4, true, 200, true);
        Apartamento apartamento = new Apartamento(6, 120, "Calle 678", 2, 1, 150);
        Apartaestudio apartaestudio = new Apartaestudio(7, 80, "Calle 901", 1, 1, 100);
        ApartamentoFamiliar apartamentoFamiliar = new ApartamentoFamiliar(8, 100, "Calle 234", 2, 2, 120);
        Local local = new Local(9, 80, "Calle 567", "Interno");
        LocalComercial localComercial = new LocalComercial(10, 100, "Calle 890", "Calle", "Centro Comercial Chipichape");
        Oficina oficina = new Oficina(11, 120, "Calle 123", "Interno", true);

        // Imprimir objetos ejemplos.
        System.out.println("Datos del inmueble.");
        System.out.println("Identificador: " + inmueble.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + inmueble.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + inmueble.getDireccion());

        System.out.println("\nDatos del inmueble de vivienda.");
        System.out.println("Identificador: " + inmuebleVivienda.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + inmuebleVivienda.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + inmuebleVivienda.getDireccion());
        System.out.println("Número de habitaciones: " + inmuebleVivienda.getNumeroHabitaciones());
        System.out.println("Número de baños: " + inmuebleVivienda.getNumeroBanos());

        System.out.println("\nDatos de la casa.");
        System.out.println("Identificador: " + casa.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + casa.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + casa.getDireccion());
        System.out.println("Número de habitaciones: " + casa.getNumeroHabitaciones());
        System.out.println("Número de baños: " + casa.getNumeroBanos());
        System.out.println("Cantidad de pisos: " + casa.getCantidadPisos());

        System.out.println("\nDatos de la casa rural.");
        System.out.println("Identificador: " + casaRural.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + casaRural.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + casaRural.getDireccion());
        System.out.println("Número de habitaciones: " + casaRural.getNumeroHabitaciones());
        System.out.println("Número de baños: " + casaRural.getNumeroBanos());
        System.out.println("Cantidad de pisos: " + casaRural.getCantidadPisos());
        System.out.println("Distancia a la cabecera municipal: " + casaRural.getDistanciaCabeceraMunicipal());
        System.out.println("Altitud sobre el nivel del mar: " + casaRural.getAltitudNivelMar());

        System.out.println("\nDatos de la casa urbana.");
        System.out.println("Identificador: " + casaUrbana.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + casaUrbana.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + casaUrbana.getDireccion());
        System.out.println("Número de habitaciones: " + casaUrbana.getNumeroHabitaciones());
        System.out.println("Número de baños: " + casaUrbana.getNumeroBanos());
        System.out.println("Cantidad de pisos: " + casaUrbana.getCantidadPisos());
        System.out.println("Conjunto cerrado: " + casaUrbana.isConjuntoCerrado());
        System.out.println("Valor de la administración: " + casaUrbana.getValorAdministracion());
        System.out.println("Áreas comunes: " + casaUrbana.isAreasComunes());

        System.out.println("\nDatos del apartamento.");
        System.out.println("Identificador: " + apartamento.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + apartamento.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + apartamento.getDireccion());
        System.out.println("Número de habitaciones: " + apartamento.getNumeroHabitaciones());
        System.out.println("Número de baños: " + apartamento.getNumeroBanos());
        System.out.println("Valor de la administración: " + apartamento.getValorAdministracion());

        System.out.println("\nDatos del apartaestudio.");
        System.out.println("Identificador: " + apartaestudio.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + apartaestudio.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + apartaestudio.getDireccion());
        System.out.println("Número de habitaciones: " + apartaestudio.getNumeroHabitaciones());
        System.out.println("Número de baños: " + apartaestudio.getNumeroBanos());
        System.out.println("Valor de la administración: " + apartaestudio.getValorAdministracion());

        System.out.println("\nDatos del apartamento familiar.");
        System.out.println("Identificador: " + apartamentoFamiliar.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + apartamentoFamiliar.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + apartamentoFamiliar.getDireccion());
        System.out.println("Número de habitaciones: " + apartamentoFamiliar.getNumeroHabitaciones());
        System.out.println("Número de baños: " + apartamentoFamiliar.getNumeroBanos());
        System.out.println("Valor de la administración: " + apartamentoFamiliar.getValorAdministracion());

        System.out.println("\nDatos del local.");
        System.out.println("Identificador: " + local.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + local.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + local.getDireccion());
        System.out.println("Localización: " + local.getLocalizacion());

        System.out.println("\nDatos del local comercial.");
        System.out.println("Identificador: " + localComercial.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + local.getAreaMetrosCuadrados());

        System.out.println("\nDatos del local comercial.");
        System.out.println("Identificador: " + localComercial.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + localComercial.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + localComercial.getDireccion());
        System.out.println("Localización: " + localComercial.getLocalizacion());
        System.out.println("Centro comercial: " + localComercial.getCentroComercial());

        System.out.println("\nDatos de la oficina.");
        System.out.println("Identificador: " + oficina.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + oficina.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + oficina.getDireccion());
        System.out.println("Localización: " + oficina.getLocalizacion());
        System.out.println("Es del gobierno: " + oficina.isEsDelGobierno());
    }
}