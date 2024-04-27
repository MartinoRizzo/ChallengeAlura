import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int opcion = 0;

        while (opcion != 7){
            Scanner leer = new Scanner(System.in);
            double monto;
            System.out.println("Bienvenido. Ingrese el monto a calcular");
            monto = leer.nextDouble();

            System.out.println("***************************");
            System.out.println(" Ingrese la opcion deseada ");
            System.out.println("***************************");
            System.out.println("1- Peso Argentino a dolar");
            System.out.println("2- Dolar a Peso Argentino ");
            System.out.println("3- Real brasilero a dolar");
            System.out.println("4- Dolar a Real brasilero");
            System.out.println("5- Peso colombiano a dolar");
            System.out.println("6- Dolar a Peso colombiano");
            System.out.println("7- SALIR");
            System.out.println("****************************");

            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El monto ingresado en dolares es: " + (monto/876));
                    break;
                case 2:
                    System.out.println("El monto ingresado en pesos argentinos es: "
                                       + (monto*876));
                    break;
                case 3:
                    System.out.println("El monto ingresado en dolares es: " + (monto/5));
                    break;
                case 4:
                    System.out.println("El monto ingresado en reales brasileros es: "
                            + (monto*5));
                    break;
                case 5:
                    System.out.println("El monto ingresado en dolares es: " + (monto/4000));
                    break;
                case 6:
                    System.out.println("El monto ingresado en pesos colombianos es: "
                            + (monto*4000));
                    break;
                case 7:
                    System.out.println("Gracias por utilizar nuestro servicio");
                    break;
                default:
                    System.out.println("La opcion ingresada no esta disponible");
                    break;
            }


        }
    }
}