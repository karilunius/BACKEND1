import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FactoryArbol fabricaArbol = new FactoryArbol();

        Arbol arbolFloral = fabricaArbol.getArbol("Celeste");
        arbolFloral.setTipos("Floral");
        arbolFloral.setAlto(100);
        arbolFloral.setAncho(200);

        Arbol arbolFrutal = fabricaArbol.getArbol("Rojo");
        arbolFrutal.setTipos("Frutal");
        arbolFrutal.setAlto(500);
        arbolFrutal.setAncho(300);

        Arbol arbolOrnamental = fabricaArbol.getArbol("Verde");
        arbolOrnamental.setTipos("Ornamental");
        arbolOrnamental.setAlto(200);
        arbolOrnamental.setAncho(400);


       // Arbol arbol1 = fabricaArbol.getArbol("Rojo");
       // System.out.println(arbol1.toString());

        ArrayList<Arbol> bosque = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            if (i < 10/2){
                Arbol arbol2 = fabricaArbol.getArbol("Verde");
                bosque.add(arbol2);
            }
            else {
                Arbol arbol2 = fabricaArbol.getArbol("Rojo");
                bosque.add(arbol2);
            }
        }
        for (Arbol arbol:bosque) {
            System.out.println(arbol);
        }






    }
}