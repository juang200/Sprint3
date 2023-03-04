public class While {

    static boolean isTurnOnLight = true;

    public static void main(String[] args) {

    }

    public static void printSOS() {
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight() {

        if (isTurnOnLight) {
            isTurnOnLight = false;
        } else {
            isTurnOnLight = true;
        }

        return isTurnOnLight;
    }
}
