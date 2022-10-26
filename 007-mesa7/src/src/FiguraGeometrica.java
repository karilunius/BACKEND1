public class FiguraGeometrica {
    private String figura;

    public FiguraGeometrica(String figura) {
        this.figura = figura;
    }

    public double calcularArea(double radioOlado){
        double area = 0.0;
        switch (figura){
            case "Circulo":
                if(radioOlado > 0){
                    area = (Math.PI * radioOlado * radioOlado);
                    System.out.println("El área del Circulo es: "+ area);
                }else {
                    System.out.println("El valor del radio debe ser mayor que cero");
                }
                break;
            case "Cuadrado":
                if (radioOlado > 0){
                    area = (radioOlado * radioOlado);
                    System.out.println("El área del Cuadrado es: "+ area);
                }else {
                    System.out.println("El valor del lado debe ser mayor que cero");
                }
        }
        return area;
    }
}
