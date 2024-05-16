package demoWhile;
/*
 * SINTAXIS
 * FORMA 1:
 *     while(condicion del bucle)
 *         sentencia; -----------------> cuerpo del bucle
 * FORMA 2:
 *     while(condicion_bucle)
 *     {
 *       sentencia-1;---------------->
 *       sentencia-2;---------------->cuerpo del bucle
 *       sentencia-n;---------------->
 *     }
 * while            es una palabra reservada
 * condicion_bucle  una expresion logico
 * sentencia        es una sentencia simple o compuesta
 */

public class DemoWhile {
    public void demoWhile(){
        int i=0;
        while(i<10){
            System.out.println("Hola");
            i++;

        }
        System.out.println("Sali del ciclo while");
        final int N = 3;
        i=1; //inicalizacion
        while (i<=N){
            System.out.println("Hola");
            i++;
        }
        System.out.println("Sali del ciclo while");
        //imprima del 0 al 9
        int x=0;//inicializacion
        while(x<10)
           System.out.println("X: "+ x++);

        System.out.println("Fin del bucle");
        x=0;
        while(x<10){
           System.out.println("X: "+ x);
           x++;
        }
        System.out.println("Fin del bucle");

        //El siguiente código es una ciclo vacio
        //porque nunca entra al while

        x=10;
        while(x<10){
           System.out.println("X: "+ x);
           x++;
        }


        /*
         * variable de control.- la variable que representa la condición del bucle
         *   1)inicializada: se estableca (x,i) a un valor inicial antes de que alcance
         *                   la sentecia while, puede se cualquier valor pero normalmente es 0
         *   2)comprobada(prueba/condicion): se comprueba el valor (x,i) antes de la iteracion; es
         *                decir el comienzo de la repetición de cada bucle
         *   3)actualizada: Durante cada iteración, (i,x) actualiza su valor incrementando medienta
         *                 el operado ++
         * 
         */

         //El siguiente código es un bucle infinito
         //porque como contador se decrementa, la condición nunca se hará falsa
         /*

         int contador = 1;
         while (contador <100){
            System.out.println(contador);
            contador--;
         }
         */
        int contador = 100;
        while (contador >0){
           System.out.println(contador);
           contador--;
        }

    }
    
}