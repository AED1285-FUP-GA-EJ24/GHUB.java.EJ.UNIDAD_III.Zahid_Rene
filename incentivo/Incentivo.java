package incentivo;

import java.util.Scanner;

public class Incentivo {
    public void incentivo() {
        Scanner teclado=new Scanner(System.in);
        boolean tiene_incentivo;
        short unidades;
        System.out.print("Proporciones unidades semanales producidas:");
        unidades=teclado.nextShort();
        if(unidades>100){
            tiene_incentivo=true;
        }
        else{
            tiene_incentivo=false;
        }
        System.out.println("Tiene incentivo"+tiene_incentivo);
    }
}
