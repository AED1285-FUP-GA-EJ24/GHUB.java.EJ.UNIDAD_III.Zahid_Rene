package ecuacion;
/*
//Proposito: calcular e impromir el valor de la funcion y = x + 12
//proporcionando valores a x de 1 a 10
// y = 1+12
// y= 2+12
// y = 3+12
//....
// y = 10+12
*/

public class Ecuacion {
    public void ecuacion(){
        
        //definir variable de salida
        int y;
        //definir variable auxiliar y variable de contrl
        int x=1;
        System.out.println("Utilizando while");
        while (x<=10){
            y = x +12;
            System.out.print("x = "+x);
            System.out.println(" y = "+y);
            x++;
        }
        System.out.println("Utilizando for");
        for(x=1;x<=10;x++){
            y = x +12;
            System.out.print("x = "+x);
            System.out.println(" y = "+y);
        }

    }
    
}