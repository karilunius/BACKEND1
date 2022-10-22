package ejemplo1;

// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class Ejemplo1 {  
    private static int  eleccion;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do{       
            System.out.print("========= Mobile Shop ============ \n");  
            System.out.print("            1. IPHONE.              \n");  
            System.out.print("            2. SAMSUNG.              \n");  
            System.out.print("            3. BLACKBERRY.            \n");  
            System.out.print("            4. SALIR.                     \n");  
            System.out.print("-> Elige una opción: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            eleccion=Integer.parseInt(br.readLine());  
            ShopKeeper sk=new ShopKeeper();  
              
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
