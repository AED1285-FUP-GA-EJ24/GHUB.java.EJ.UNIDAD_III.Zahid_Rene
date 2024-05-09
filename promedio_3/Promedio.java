package promedio_3;

import java.util.Scanner;

public class Promedio {

    public void Promedio() {
        Scanner teclado= new Scanner(System.in);
        float r;
        int n;
        final int CENTINELA = -1;
        int acum_calif=0,cuenta=0;
        System.out.println("Introduzca la primera primera calificacion(-1 para terminar)");
        n=teclado.nextInt();
        while (n !=CENTINELA) {
            cuenta++;
            acum_calif+=0;

            n=teclado.nextInt();
        }
        r=(float)acum_calif/cuenta;
        System.out.println("Promedio"+r);
        teclado.close();
    }
}