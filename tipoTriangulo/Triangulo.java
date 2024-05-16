package tipoTriangulo;
import java.util.Scanner;

public class Triangulo {
    public void triangulo(){
        //Definir objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //Definir variable de salida
        String tipo;
        //Definir variable de entrada
        float l1,l2,l3;
        System.out.print("Proporciona lado1:");
        l1 = entrada.nextFloat();
        System.out.print("Proporciona lado2:");
        l2 = entrada.nextFloat();
        System.out.print("Proporciona lado3:");
        l3 = entrada.nextFloat();
        if (l1==l2 && l2==l3){
            tipo = "Equilatero";
        }
        else
        {
            if(l1 != l2 && l2 != l3 && l3 != l1){
                tipo = "Escaleno";
            }
            else{
                tipo = "Isóceles";
            }
        }
        System.out.println("Tipo de Triángulo es: "+tipo);
        entrada.close();
    }
    
}