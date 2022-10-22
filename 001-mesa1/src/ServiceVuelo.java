public class ServiceVuelo {

    public ServiceVuelo() {
    }

    public Vuelo buscarVuelo (String fechaSalidaV, String fechaRegreso, String origen, String destino){
        System.out.println("Obteniendo vuelos disponibles");
        return new Vuelo("10 octubre", "31 octubre", "Cali", "Hawai");

    }
}
