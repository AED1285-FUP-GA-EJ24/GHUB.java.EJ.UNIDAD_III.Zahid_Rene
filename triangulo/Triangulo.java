package triangulo;

import java.util.Scanner;

public class Triangulo {
    public void triangulo() {
        Scanner teclado=new Scanner(System.in);
        String tipo;
        float a,b,c;
        System.out.println("Proporciona tres lados");
        a= teclado.nextInt();
        b= teclado.nextInt();
        c= teclado.nextInt();
        if(a==b && b==c){
            tipo="Equilatero";
        }
        else{
            if (a !=b && b != c && c !=a) {
                tipo="Escaleno";
            }
            else{
                tipo="Isoceles";
            }
        }
        System.out.println("tipo de triangulo: "+tipo);
        teclado.close();
    }
}
