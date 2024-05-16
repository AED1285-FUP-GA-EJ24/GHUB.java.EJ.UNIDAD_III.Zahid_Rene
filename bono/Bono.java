package bono;
//Proposito: Ingresar un monto de venta alcanzado por vendedor
//           durante un mes, luego calcular la bonificacion Segun 
//           la siguiente tabla:
//			 Monto 			%bonificacion
//           1-1000			    0%
//			 1001-5000			3%
//			5001-20000			5%
//			20001 o mas			8%
/*
 * Autor:
 * Fecha:
 */
import java.util.Scanner;
public class Bono {
    public void bono(){
        //Declarar objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //Deteminar la variable de salida y entrada
        double importe_bonificacion, importe_venta;
        System.out.print("Proporciona Ventas del Mes:");
        importe_venta = teclado.nextDouble();
        /* 
        if (importe_venta>0 && importe_venta<=1000){
            importe_bonificacion = 0;
        }else if(importe_venta>1000 && importe_venta<=5000){
            importe_bonificacion = importe_venta * 0.03;
        }else if(importe_venta>5000 && importe_venta<=20000){
            importe_bonificacion = importe_venta*0.05;
        }else{
            importe_bonificacion = importe_venta *0.08;
        }
        */
        if(importe_venta>20000){
            importe_bonificacion = importe_venta * 8 /100;
        }else if(importe_venta>5000){
            importe_bonificacion = importe_venta * 5/100;
        }else if(importe_venta>1000){
            importe_bonificacion = importe_venta * 3/100;
        }else{
            importe_bonificacion = 0;
        }
        System.out.println("Bonificacion = $"+importe_bonificacion);
        teclado.close();
       

    }
    
}