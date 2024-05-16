package sumaPares;

public class SumaPares {
    public void sumaPares(){
        int suma=0;

        //declarando a M como constante

        final int M = 12;
        for(int n=1;n<=M;n++){
            suma = suma + 2*n;//0+2(1)   2
                              //2+2(2)   6
                              //6+2(3)   12
                              //12+2(4)  20
                              //
                              //     12    
        }
        System.out.println("La suma de los "+M+
             " primeros pares= "+suma);

        



       

    }
    
}