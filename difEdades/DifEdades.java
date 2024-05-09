package difEdades;

import java.util.Scanner;

//Proposito:
//Autor: Zahid Rene Jimenez Olivas
//Fecha: 09/04/2024
public class DifEdades {

    public void difEdades() {
        Scanner teclado=new Scanner(System.in);
        
        String nombre1,nombre2;
        String nombremayor;
        byte edad;
        int edad1,edad2;
        System.out.println("Proporciona nombre de hermano 1");
        nombre1=teclado.next();
        System.out.println("Proporciona nombre de edad 1");
        edad1=teclado.nextByte();
        System.out.println("Proporciona nombre de hermano 2");
        nombre2=teclado.next();
        System.out.println("Proporciona nombre de edad 2");
        edad2=teclado.nextByte();
        if(edad1>edad2){
            edad=(byte)(edad1-edad2);
            nombremayor=nombre1;
        }
        else{
            edad=(byte)(edad2-edad1);
            nombremayor=nombre2;
        }
        System.out.println("Nombre del hermano mayor:"+nombremayor);
        System.out.println("Diferencia de edad:"+edad);
        teclado.close();
    }
}
