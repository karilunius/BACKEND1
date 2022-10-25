import java.util.HashMap;

public class FlyweightFactory {

    private static final HashMap<Integer, Circulo> circuloMap = new HashMap();

    public static Circulo getCirculo(Integer tamayo){
        Circulo circulo = (Circulo) circuloMap.get(tamayo);
        if(circulo == null){
            circulo = new Circulo(tamayo);
            circuloMap.put(tamayo,circulo);
            System.out.println("Creando circulo de tamaño " + tamayo);

        }
        return circulo;
    }


}
