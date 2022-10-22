import java.util.ArrayList;

public abstract class Menu {

    private ProductLista productLista;
    private double tipoRecargo;

    public void clientePedido(){
         eleccionProducto();
         menuElegido();
    }

    public void armarPaquete(){
        clientePedido();
        armadoDePaquete();
        calculoPrecioVenta();
    }



        
        private ArrayList<Productos> eleccionProducto() {
            int temp = Main.eleccion;
            ArrayList<Productos> temp2 = ProductLista.proLista;
            int i;
            for (i = 0; i < productLista.getProLista(i).size(); i++) {
                temp2 = productLista.getProLista(i);
                return temp2;
            }
            if (temp2.equals(temp)) {
                System.out.println("El menu seleccionado es: " + temp);
            }
            return null;
        };

    
        private void menuElegido(){

        };

        private void armadoDePaquete(){

        };

        private void calculoPrecioVenta(){

        };
    
}
