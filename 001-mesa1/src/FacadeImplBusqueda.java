public class FacadeImplBusqueda implements IFacadeBusqueda {

    private final ServiceVuelo serviceVuelo;
    private final ServiceHotel serviceHotel;

    public FacadeImplBusqueda(ServiceVuelo serviceVuelo, ServiceHotel serviceHotel) {
        this.serviceVuelo = serviceVuelo;
        this.serviceHotel = serviceHotel;
    }

    @Override
    public boolean procesarBusqueda(String fechaEntrada, String fechaSalidaH, String ciudad, String fechaSalidaV, String fechaRegreso, String origen, String destino) {

        if (ServiceHotel.buscarHotel(fechaEntrada, fechaSalidaH, ciudad) != null && ServiceVuelo.buscarVuelo(fechaSalidaV, fechaRegreso, origen, destino) != null) {
            System.out.println(ServiceHotel.buscarHotel(fechaEntrada, fechaSalidaH, ciudad));
            System.out.println(ServiceVuelo.buscarVuelo(fechaSalidaV, fechaRegreso, origen, destino));

        }

        return false;
        //System.out.println("No hay vuelos disponibles" + "No hay hoteles disponibles");



    }

}

