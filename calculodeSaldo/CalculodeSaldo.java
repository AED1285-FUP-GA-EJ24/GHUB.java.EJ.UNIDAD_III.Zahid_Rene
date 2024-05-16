package calculodeSaldo;

public class CalculodeSaldo {
    public void calculoSaldo() {
        int anyos=50;
        float saldo=0,pago=10000;
        float tasaInteres=7.5f;
        double limite=2000000;
        while (anyos<=50) {
            saldo=saldo+pago;
            double interes=saldo+tasaInteres/100;
            saldo=saldo+interes;
            if (saldo>=limite) {
                break;
                anyos++;
            }
            
        }
        System.out.println("En 50 años con una tasa de interes de 7.5 usted tendría="+saldo);
    }
}
