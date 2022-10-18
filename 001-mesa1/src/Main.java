public class Main {
    public static void main(String[] args) {

        IFacadeBusqueda facadeBusqueda = new FacadeImplBusqueda(new ServiceVuelo(), new ServiceHotel());

        boolean procesarBusqueda = facadeBusqueda.procesarBusqueda("15 octubre", "30 octubre", "Cali","10 octubre","31 octubre","Cali","Hawai");



    }
}