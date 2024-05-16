package menu;
import java.util.Scanner;
public class Menu {
    public  void menu(){
        int opc;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("**************************");
            System.out.println("           MENU           ");
            System.out.println( "*************************");
            System.out.println( "1) Sumar                 ");
            System.out.println( "2) Restar                ");
            System.out.println( "3) Multiplicar           ");
            System.out.println( "                         ");
            System.out.println( "9) Salir                 ");
            System.out.println( "*************************");
            System.out.print(" Seleccion Opcion :");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                   sumar();
                   break;
                case 2:
                  restar();
                  break;
                case 3:
                  multiplicar();
                  break;
                case 9:
                  System.out.println("Hasta luego");
                default:
                  System.out.println("Opciónn inválida");

            }

        } while (opc !=9);
        entrada.close();

    }
    public void sumar(){
        System.out.println("Estoy en la funcion sumar");

    }
    public void restar(){
        System.out.println("Estoy en le funcion restar");

    }
    public void multiplicar(){
        System.out.println("Estoy en la funcion multiplicar");

    }
    
}