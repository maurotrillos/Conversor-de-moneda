package com.maurotrillos.conversordemoneda.main;
import com.maurotrillos.conversordemoneda.clientconversor.Conversor;
import com.maurotrillos.conversordemoneda.clientconversor.ConversorPar;
import com.maurotrillos.conversordemoneda.metodos.FiltroDeMoneda;
import com.maurotrillos.conversordemoneda.modelos.Moneda;
import com.maurotrillos.conversordemoneda.modelos.MonedaPar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConversorPar conversorPar = new ConversorPar();
        boolean continuar = true;
        Conversor conversor = new Conversor();
        Moneda moneda = conversor.obtenerTasaDeCambio("usd");
        FiltroDeMoneda filtroDeMoneda = new FiltroDeMoneda();
        String menu = """
                1) Dólar =>> Peso Argentino.
                2) Peso Argentino =>> Dólar.
                3) Dólar =>> Real Brasileño.
                4) Real Brasileño =>> Dólar.
                5) Dólar =>> Peso Colombiano.
                6) Peso Colombiano. =>> Dólar.
                7) Divisa Distinta.
                8) Salir.
                """;
        String subMenu = """
                ¿Desea realizar otra consulta?
                1. Sí (Volver al menú)
                2. No (Cerrar programa)
                """;

        while (continuar) {
           try {
               System.out.println(menu);

            System.out.print("Seleccione una opción: ");
            int opcion = lectura.nextInt();

            if (opcion == 8) {
                System.out.println("Gracias por usar nuestro conversor.");
                continuar = false;
                break;
            }

            String origen = "";
            String destino = "";
            double cant = 0;

            switch (opcion) {
                case 1:
                    origen = "USD";
                    destino = "ARS";
                    System.out.print("Digite la cantidad en Dólar: ");
                    cant = lectura.nextDouble();
                    break;
                case 2:
                    origen = "ARS";
                    destino = "USD";
                    System.out.print("Digite la cantidad en Peso Argentino: ");
                    cant = lectura.nextDouble();
                    break;
                case 3:
                    origen = "USD";
                    destino = "BRL";
                    System.out.print("Digite la cantidad en Dólar: ");
                    cant = lectura.nextDouble();
                    break;
                case 4:
                    origen = "BRL";
                    destino = "USD";
                    System.out.print("Digite la cantidad en Real Brasileño: ");
                    cant = lectura.nextDouble();
                    break;
                case 5:
                    origen = "USD";
                    destino = "COP";
                    System.out.print("Digite la cantidad en Dólar: ");
                    cant = lectura.nextDouble();
                    break;
                case 6:
                    origen = "COP";
                    destino = "USD";
                    System.out.print("Digite la cantidad en Peso Colombiano: ");
                    cant = lectura.nextDouble();
                    break;
                case 7:
                    System.out.print("Digite la sigla de la divisa de origen (ej. USD): ");
                    origen = lectura.next();
                    System.out.print("Digite la sigla de la divisa de destino (ej. ARS): ");
                    destino = lectura.next();
                    System.out.print("Digite la cantidad en " + origen + ": ");
                    cant = lectura.nextDouble();
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    continue;
            }

            {
                MonedaPar monedaPar = conversorPar.convertirPar(origen, destino, cant);
                System.out.println(monedaPar.toString());
                System.out.println(subMenu);
                int continuarOpcion = lectura.nextInt();
                if (continuarOpcion == 2) {
                    System.out.println("Gracias por usar nuestro conversor. ¡Hasta pronto!");
                    continuar = false; // Esto rompe el bucle principal, cerrando el programa
                }


            }
        } catch (InputMismatchException e){
               System.out.println("solo se permiten numeros para las opciones.");
               lectura.nextLine();
           }
        }
        lectura.close();

    }



}