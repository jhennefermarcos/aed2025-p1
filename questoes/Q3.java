//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q3 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 03 - Número Perfeito");

        //Entrada

        //Processamento
        resolverNumeroPerfeito();
        
    }

    public static void resolverNumeroPerfeito(){

        // Sua solução aqui
        int qntdNum = 0;
        int n = 0;

        IO.imprimir("Digite a quantidade de testes (até 20)");
        qntdNum = IO.lerValorInteiro();

        for (int i = 0; i < qntdNum; i++) {
            IO.imprimir("Digite um número entre 1 e 180");
            n = IO.lerValorInteiro();

            int acumulador = 0;
            for (int a = 1; a < n; a++) {
                if(n % a == 0){
                    acumulador+=a;
                }
            }
            
            if(acumulador == n){
                IO.imprimir(n + " é perfeito");
            } else {
                IO.imprimir(n + " não é perfeito");
            }

       }

    }
}