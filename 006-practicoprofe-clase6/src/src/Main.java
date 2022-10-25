public class Main {

    private static final Integer tamayos[]= {5,10,15,20,20,50};


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Circulo circulo = FlyweightFactory.getCirculo(tamayos[2]);
            circulo.setRadio((int) (i+5.5));
            circulo.setColor("Azul");
            circulo.dibujarCirculo();
        }

        //FlyweightFactory circuloFactory = new FlyweightFactory();

    }

    private static Integer tamayoAleatorio(){
        return tamayos[(int) (Math.random()* tamayos.length)];
    }

}