package mayor;

import java.util.Scanner;

public class Mayor_2 {
    public void Mayor() {
        Scanner teclado=new Scanner(System.in);
        int a,b,c;
        System.out.println("Proporcionar nuemro de a,b,c");
        a=teclado.nextInt();
        b=teclado.nextInt();
        c=teclado.nextInt();
        if(a>b && a>c){
            System.out.println("El mayor es: "+a);
        }        
        if(b>a && b>c){
            System.out.println("El mayor es: "+b);
        }        
        if(c>a && c>a){
            System.out.println("El mayor es: "+c);
        }        
    }
}
