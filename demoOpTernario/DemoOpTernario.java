package demoOpTernario;

public class DemoOpTernario {
    
    public void demoOpTernario(){
        int a=0;
        String mensaje;
        if(a>0)
           mensaje = "a es mayor que cero";
        else
           mensaje = "a no es mayor que cero";
        mensaje = a>0 ? "a es mayor que cero": "a no es mayor que cero";
        System.out.println(mensaje);
    }
}