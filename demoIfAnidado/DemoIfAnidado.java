package demoIfAnidado;
/*
 * Proposito: forrma de escribir if anidades
 */

import java.util.Scanner;;
public class DemoIfAnidado {
    public void demoIfAnidado(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Proporciona valores de a,b,c");
        int a = entrada.nextInt();
        int b= entrada.nextInt();
        int c = entrada.nextInt();
        if (a>0){
            System.out.println("a es mayor que cero"+a);
            System.out.println("a es mayor que cero"+a);
        }
        
        else
            System.out.println("a no es menor que 0"+a);
        
        if (b>0) System.out.println("b es mayor que cero"+a);
        else System.out.println("b es no es mayor que cero"+a);
        if (c>0); // un if nulo
        System.out.println("c es mayot que cero "+c);
        if (a>0)if(b>0) a++; else if(c>0) c++;
        //el código de arriba es correcto pero es una mala práctica
        if (a>0)if(b>0) a++; else if(c>0)
        if (a<5) b++; else if(b<5) ++c; else --a;
        else if(c<5) --b; else --c; else a=0;

        //las lineas de código anterior aunque no marque error el
        //compilar es una mala práctica
        if (a>0)
           if(b>0) 
               a++; 
           else 
              if(c>0)
                if (a<5)
                 b++; 
                else 
                  if(b<5) 
                    ++c; 
                  else --a;
              else 
                if(c<5) 
                   --b; 
                else --c; 
        else 
           a=0;
        //El if anidado anterior es una forma adecuada ya que se observan
        //de una mejor manera los if anidados
        if (a>0)
           if(b>0) 
             a++; 
           else if(c>0)
             if (a<5) 
               b++; 
             else if(b<5) 
               ++c; 
             else
               --a;
        else if(c<5)
          --b; 
        else 
          --c; 
        else 
          a=0;
        //el if anidado también es adecuado

     
            
        

        entrada.close();

    }
}