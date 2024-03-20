package INE;

import java.util.Scanner;

public class INE {
    public void DeterminarsiINE() {
        Scanner entrada=new Scanner(System.in);
        String resultado;
        int anoactual,anonacimiento;
        int anos;
        System.out.print("Año actual= ");
        anoactual=entrada.nextInt();
        System.out.print("Año nacimiento= ");
        anonacimiento=entrada.nextInt();

        anos= anoactual-anonacimiento;
        if(anos>=18){
            System.out.println("Usted puede tramiare su INE");
        }
        else
        {
            System.out.println("Usted no puede tramiare su INE");
        }


    }
}