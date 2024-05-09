package miPrincipal;
import java.util.Scanner;

import bono.Bono;
import difEdades.DifEdades;
import incentivo.Incentivo;
import ine.Ine;
import mayor.Mayor3;
import menorde3.Menorde3;
import peaje.Peaje;
import tipoTriangulo.Triangulo;
import romano.Romano;
import vocal.Vocal;
import calificaciones.Calificacion;
public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("**************************************");
        System.out.println("      MENU DE OPCIONES UNIDAD III     ");
        System.out.println("**************************************");
        System.out.println("* 1) Calcular Edad para INE           ");                
        System.out.println("* 2) Hermano Mayor                    ");
        System.out.println("* 3) Incentivos de Unidades Producidas"); 
        System.out.println("* 4) Determinar mayor de 3 Números    ");
        System.out.println("* 5) Tipo de Triángulo                ");
        System.out.println("* 6) Convertir Arábigo a Romano       ");
        System.out.println("* 7) Convertir Caracter a Vocal       ");
        System.out.println("* 8) Menor, Igual o Mayor de 3        ");
        System.out.println("* 9) Determinar Tipo de Calificación  ");
        System.out.println("*10) Seleccionar Tipo Tarifa          ");
        System.out.println(" 11) Determinación de Bono             ");
        System.out.println("**************************************");
        System.out.print("Seleccion Opcion:");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
             Ine objIne = new Ine();
             objIne.determinarSiIne();
             break;
            case 2:
             DifEdades Dedad = new DifEdades();
             Dedad.difEdades();
             break;
            case 3:
            Incentivo incentivo = new Incentivo();
            incentivo.incentivo();
             break;
            case 4:
             Mayor3 objeto = new Mayor3();
             objeto.mayor();
             break;
            case 5:
             Triangulo triangulo = new Triangulo();
             triangulo.triangulo();
             break;
            case 6:
            Romano objRomano = new Romano();
            objRomano.romano();
             break;
            case 7:
             Vocal vocal = new Vocal();
             vocal.vocal();
             break;
            case 8:
             Menorde3 objMenorde3 = new Menorde3();
             objMenorde3.menorde3();
             break;
            case 9:
             Calificacion objCalificacion = new Calificacion();
             objCalificacion.calificacion();
             break;
            case 10:
             Peaje obPeaje = new Peaje();
             obPeaje.peaje();
             break;
            case 11:
             Bono objBono = new Bono();
             objBono.bono();
             break;
             
            default:
              System.out.println("Opción inválida");
        }
        entrada.close();
    }

}