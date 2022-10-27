import org.apache.log4j.Logger;

import java.util.List;

public class Lista {
    private List<Integer> lista;

    public Lista(List<Integer> lista) {
        this.lista = lista;
    }

    private static final Logger logger = Logger.getLogger(Lista.class);

    public void validarLista() throws Exception {
        if(lista.size() == 0) {
            logger.error("La lista es igual a cero");
            throw new Exception("La lista es igual a cero");
        } else if(lista.size() > 5) {
            logger.info("La longitud de la lista es mayor a 5");
        } else if(lista.size() > 10) {
            logger.info("La longitud de la lista es mayor a 10");
        }
        int suma = 0;
        for(int i = 0; i<lista.size(); i++) {
            suma += lista.get(i);
        }
        int promedio = suma / lista.size();
        logger.info("El promedio es " + promedio);
    }
}
