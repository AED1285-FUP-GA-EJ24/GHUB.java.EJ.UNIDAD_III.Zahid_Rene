package demoDoWhile;
//Proposito: demostrar el uso de la sentencia do..while
//          y compararla con la sentencia for, while
public class DemoDoWhile {
    public void demoDoWhile(){
        //defino variable de control
        System.out.println("Demostracion de un ciclo ascendente utilizando for");
        for(int i=0;i<=3;i++){
            System.out.println("valor de i="+i);
            
            
        }
        System.out.println("Demostracion de un ciclo ascendente utilizando while");
        int i=0;
        while(i<=3){
            System.out.println("valor de i = "+i);
            i = i +1;
        }

        
        System.out.println("Demostracion de un ciclo ascendente utilizando do..while");
        i=0;
        do{
            System.out.println("valor de i="+i);
            i++;

        }while (i<=3);

    }
    
}