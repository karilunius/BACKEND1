import java.util.ArrayList;

public class ProductLista {

   static ArrayList<Productos> proLista = new ArrayList<>();


   public ProductLista() {
   }

   public  ArrayList<Productos> getProLista(int i) {
      return proLista;
   }

   public void setProLista(ArrayList<Productos> proLista) {
      ProductLista.proLista = proLista;
   }

   public void agregarProducto(Productos producto){
         boolean existe = false;
         for (Productos tempProduct : proLista){
            if (tempProduct.getNombreProducto().equals(producto.getNombreProducto())) {
               existe = true;
            }
         }
         if (existe == false){
            proLista.add(producto);
         }
   }

   public void listarProductos(){
      for(Productos tempproLista : proLista){
         System.out.println(proLista.toString());
      }
   }





}
