package demoBreakyContinue;
public class DemoBreakyContinue {

    public void DemoBreakyContinue() {
        System.out.println("Uso de la sentencia for");
        for(int j=1;j<5;j++){
            System.out.println("Hola");
        }
        int j=1;
        System.out.println("uso de sentencia while");
        while (j<5) {
            System.out.println("Hola");
            j++;
        }
        System.out.println("uso de sentencia dowhile");
        do {
            System.out.println("Hola");
            j++;
        } while (j<=5);
    }
}