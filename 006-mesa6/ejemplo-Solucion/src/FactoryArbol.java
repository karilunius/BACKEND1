import java.util.HashMap;
import java.util.Objects;

public class FactoryArbol {

    private static final HashMap<String, Arbol> arbolHashMap = new HashMap<>();

    public Arbol getArbol(String color){
        Arbol arbol = arbolHashMap.get(color);

        if (Objects.isNull(arbol)){

            arbol = new Arbol(color);
            arbolHashMap.put(color, arbol);
            System.out.println("Creando un Arbol del color: "+color);
            return arbol;

        }

        return arbol;


    }

}
