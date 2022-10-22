import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static int eleccion;

    public static void main(String[] args) throws IOException {
        do {
            System.out.print("========= PEDIDO DE MENU ============ \n");
            System.out.print("========= elige el menu que quieres comprar============ \n");
            System.out.print("            1. MENU CLASICO.              \n");
            System.out.print("            2. MENU INFANTIL.              \n");
            System.out.print("            3. MENU VEGETARIANO.            \n");
            System.out.print("            4. SALIR.                     \n");
            System.out.print("-> Elige una opción: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            eleccion = Integer.parseInt(br.readLine());

            MenuClasico menuClasico = new MenuClasico();
            MenuInfantil menuInfantil = new MenuInfantil();
            MenuVegetariano menuVegetariano = new MenuVegetariano();

            switch (eleccion) {
                case 1:
                    sk.iphoneSale();
                    break;
                case 2:
                    sk.samsungSale();
                    break;
                case 3:
                    sk.blackberrySale();
                    break;
                case 4:
                    System.out.println("Salir (:");
                    break;
                default:
                    System.out.println("No hay, no existe esa opción ):");
                    return;
            }

        }while(eleccion!=4);

   }
}





