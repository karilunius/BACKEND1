
public class Main {

    //private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        //File log4jfile = new File("C:\\Users\\Karol\\Desktop\\BACKEND1\\008-practicoprofe-clase8\\log4j.properties");
        //PropertyConfigurator.configure(log4jfile,getAbsolutePath());


        Leon leon1 = new Leon("Simba",12,true);// if1
        Leon leon2 = new Leon("Bom",-1,true); // if2
        Leon leon3 = new Leon("Mufasa",5,false); //if3

        Tigre tigre1 = new Tigre("Zosa",11); //if1
        Tigre tigre2 = new Tigre("Mino",5); //if2

        leon1.correr();
        leon1.esMayorYAlfa();

        leon2.correr();
        leon2.esMayorYAlfa();

        leon3.correr();
        leon3.esMayorYAlfa();

        tigre1.correr();
        tigre1.esMayorYAlfa();

        tigre2.correr();
        tigre2.esMayorYAlfa();

    }



}
