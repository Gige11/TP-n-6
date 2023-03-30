package Ejercicio;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws IOException {

        Scanner consola = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        double numero1,numero2,resultado;
        int opcion;

        System.out.println("\nCalculadora");
        System.out.println("------------");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");
        System.out.print("\nIngrese una opcion: ");
        opcion = consola.nextInt();

        switch (opcion){
            case 1:
                System.out.print("Ingrese el primer numero: ");
                numero1 = consola.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                numero2 = consola.nextDouble();
                System.out.println("El resultado es = "+calculadora.sumar(numero1,numero2));
                break;

            case 2:
                System.out.print("Ingrese el primer numero: ");
                numero1 = consola.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                numero2 = consola.nextDouble();
                System.out.println("El resultado es = "+calculadora.restar(numero1,numero2));
                break;

            case 3:
                System.out.print("Ingrese el primer numero: ");
                numero1 = consola.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                numero2 = consola.nextDouble();
                System.out.println("El resultado es = "+calculadora.multiplicar(numero1,numero2));
                break;

            case 4:
                System.out.print("Ingrese el primer numero: ");
                numero1 = consola.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                numero2 = consola.nextDouble();
                System.out.println("El resultado es = "+calculadora.dividir(numero1,numero2));
                break;

            case 5:
                System.out.println("El programa se ha cerrado");
                break;

            default:
                System.out.println("La opcion ingresada no es correcta");
        }

        }
}
