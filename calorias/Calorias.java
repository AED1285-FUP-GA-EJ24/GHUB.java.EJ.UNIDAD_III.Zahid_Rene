package calorias;
/*
 * Proposito:calcular las calorias consumidas en el día
 * Autor:Lourdes Armenta
 * Fecha:3/mayo/24
 */
import java.util.Scanner;
public class Calorias {
    public void calorias(){
        //Defino objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
	    int calorias_total =0 ; //acumulador de calorias
	    int cuenta=1; //variable de control
	   
        System.out.print("¿cuántos alimentos has consumido hoy?");
        int num_de_alementos= entrada.nextInt();
        

        while(cuenta<=num_de_alementos){
            System.out.print("Proporciona las calorias del alimento:"+
              cuenta+" que has consumido hoy:");
            int calorias_por_alimento = entrada.nextInt();
            calorias_total += calorias_por_alimento;
            cuenta++;
        }
        System.out.println("Total de calorias consumidas el día:"+calorias_total);
        entrada.close();
    }
    
}