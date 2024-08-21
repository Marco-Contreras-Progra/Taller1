import java.util.Scanner;

public class JuegoCartas {

    public static void CrearMatrizCartas(String[][] args) {
        String cartas[][] = new String[12][2];
        ejecutarMenu(cartas);

    }

    public static void ejecutarMenu(String cartas[][]) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion(opcion, cartas);
        } while (opcion != 4);

    }
    public static void mostrarMenu() {
        System.out.println("\nMENU");

    }
    public static int leerOpcion() {
        int opcion = 0;
        while (true) {
            Scanner scanner = crearScanner();
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >=1 && opcion<=4){
                    break;
                }else {
                    System.out.println("Opcion incorrecta");
                }
            }else {
                System.out.println("Opcion incorrecta, Ingrese un numero");
                Scanner.next();
            }
        }return opcion;
    }
    public static String leerCadena(String mensaje) {
        Scanner scanner = crearScanner();
        System.out.print(mensaje);
        String cadena = scanner.nextLine();
        return cadena;
    }
    public static Scanner crearScanner() {
        return new Scanner(System.in);
    }

    public static void ejecutarOpcion(int opcion, String[][] cartas) {
        switch (opcion) {
            case 1:
                agregarcartamenu();
                break;
            case 2:
                inicializarcartasjuego();
                break;
            case 3:
                obtenercarta();
                break;
            case 4:
                jugar();
                break;

        }
    }
    public static void agregarcartamenu(String cartas[][]) {
        String nombre = leerCadena("Ingrese el nombre de la carta: ");
        String puntaje = leerCadena("Ingrese el puntaje del disco: ");
        cartas = agregarcarta(nombre, puntaje);
        System.out.println("carta agregada exitosamente.");
    }
    public static String agregarcarta(String cartas[][],String nombre, String puntaje) {
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i][0]== null) {
                cartas[i][0] = nombre;
                cartas[i][1] = puntaje;
                break;
            }
        }
        return cartas;
    }
    public static void inicializarcartasjuego() {

    }




}