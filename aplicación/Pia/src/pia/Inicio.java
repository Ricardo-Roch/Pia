package pia;

import java.util.Scanner;

/**
 *
 * @author ricardo
 */
public class Inicio {

    public static void main(String[] args) {
        //Declaracion de objetos para llamar a otras clases
        GestUsuarios usuarios = new GestUsuarios();
        GestProfes profes = new GestProfes();
        GeneradorHor horario = new GeneradorHor();

        Scanner s = new Scanner(System.in);
        //Declaracion de variables x
        int op;

        //Menu
        System.out.println("-----------------------------");
        System.out.println("    Generador De Horarios    ");
        System.out.println("-----------------------------");
        System.out.println("                         v2.0");

        usuarios.flag = false;

        do {
            System.out.println("Ingrese su usuario: ");
            usuarios.logeo_us(s.nextLine());

        } while (usuarios.flag != true);

        do {
            System.out.println("-----------------------------");
            System.out.println("    Generador De Horarios    ");
            System.out.println("-----------------------------");
            System.out.println("                         v2.0");
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("1.- Gestion de usuarios ");
            System.out.println("2.- Gestion De maestros ");
            System.out.println("3.- Generar Horario ");
            System.out.println("4.- Mostrar Horario ");

            System.out.println("5.- Salir ");
            op = s.nextInt();
            switch (op) {
                case 1:
                    usuarios.menu();
                    break;
                case 2:
                    profes.menu();
                    break;
                case 3:
                    horario.menu();
                    break;
                case 4:
                    horario.mostrar_hor();
                    break;

            }

        } while (op != 5);
    }

}
