public class Circulo {
    private Integer radio;
    private String color;
    private Integer tamayo;


    //constructor


    public Circulo(Integer tamayo) {
        this.tamayo = tamayo;
    }

    //getters setters


    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getTamayo() {
        return tamayo;
    }

    public void setTamayo(Integer tamayo) {
        this.tamayo = tamayo;
    }


    public void dibujarCirculo (){
        System.out.println("Este circulo tiene" + getColor());
    }

}
