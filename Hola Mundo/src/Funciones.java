import java.lang.invoke.SwitchPoint;

public class Funciones {
    public static void main(String[] args) {

        int p = 300000;
        String c = "COP";

        System.out.println("Pesos a dolares: " + ConverToDollar(600000, "COP"));

    }

        public static double ConverToDollar (double quantity, String currency){

            switch (currency){
                case "MXN":
                    quantity = quantity * 0.52;
                    break;
                case "COP":
                    quantity = quantity * 0.00031;
                    break;
            }

            return quantity;

        }
    }

