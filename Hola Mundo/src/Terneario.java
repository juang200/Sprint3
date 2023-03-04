public class Terneario {


    static boolean light = false;

    public static void main(String[] args) {

        turnofonLight();

        int i = 0;
        while (light && i>=10) {
            printSOS();
            i ++;
        }

    }

    public static void printSOS() {
        System.out.println("Hola Juan");
    }

    public static boolean turnofonLight() {
        light = (light) ? false:true;
        return light;
    }




}
