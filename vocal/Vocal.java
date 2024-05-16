package vocal;
//Proposito: convertir un caracter (a,e,i,o,u) en un número
//          a- 1 e-2 i-3 o-4 u-5
//  Autor:Lourdes Armenta
// Fecha:16/abr/24
import java.util.Scanner;
public class Vocal{
    public  void vocal(){
        //Creamos objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //definir variable de entrada
        char voc;
        System.out.print("Introduce una vocal:");
        voc = entrada.next().charAt(0);
        if (voc == 'a'){
            System.out.println("1");
        }
        else{
            if(voc=='e'){
                System.out.println("2");
            }
            else{
                if(voc=='i'){
                    System.out.println("3");
                }
                else{
                    if(voc=='o'){
                        System.out.println("4");
                    }
                    else{
                        if(voc=='u'){
                            System.out.println("5");
                        }
                        else{
                            System.out.println("caracter inválido");
                        }
                    }
                }
            }
        }
        /* 

        if (voc == 'a'){
            System.out.println("1");
        }
        else if(voc =='e'){
            System.out.println("2");
        }
        else if(voc =='i'){
            System.out.println("3");
        }
        else if(voc=='o'){
            System.out.println("4");
        }
        else 
           if(voc =='u'){
            System.out.println("5");
        }
        else{
            System.out.println("caracter inválido");
        }
        */
        /* 
        if (voc=='a'){
            System.out.println("1");
        }
        if(voc=='e'){
            System.out.println("2");
        }
        if(voc=='i'){
            System.out.println("3");
        }
        if(voc=='o'){
            System.out.println("4");
        }
        if(voc=='u'){
            System.out.println("5");
        }
        if ((voc !='a') && (voc !='e') && (voc !='i') 
           && (voc !='o') && (voc !='u'))
        {
            System.out.println("caracter inválido");
        }
        */

        /* 
        switch (voc) {
            case 'a':
                System.out.println("1");
                break;
            case 'e':
                System.out.println("2");
                break;
            case 'i':
                System.out.println("3");
                break;
            case 'o':
                System.out.println("4");
                break;
            case 'u':
                System.out.println("5");
                break;
        
            default:
                System.out.println("Caracter inválido");
                break;
        }
        //El break, salta a esta linea
        System.out.println("Salí de la sentencia switch");
        */
        entrada.close();


    }
}