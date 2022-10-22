public class Main {

    public static void main(String[] args) {
        Documento documento1 = new Documento("Noticias",Tipo.Muy_secreto);
        Documento documento2 = new Documento("Noticias",Tipo.Secreto);
        Documento documento3 = new Documento("Noticias",Tipo.Reservado);


        Manejador manejador1 = new Diputado();
        Manejador manejador2 = new Ministro();
        Manejador manejador3 = new Presidente();

        manejador2.setSiguienteManejador(manejador3);
        manejador1.setSiguienteManejador(manejador2);

        manejador1.procesarDocumento(documento1);

    }

}
