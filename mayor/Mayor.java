package mayor;

import java.util.Scanner;

public class Mayor {
    public void mayor() {
        Scanner teclado=new Scanner(System.in);
        int a,b,c;
        System.out.println("Proporcionar nuemro de a,b,c");
        a=teclado.nextInt();
        b=teclado.nextInt();
        c=teclado.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}
