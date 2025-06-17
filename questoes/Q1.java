//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q1 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 01 - ");

        //Entrada
        int n = IO.lerValorInteiro();

        //Processamento
        resolverQuadradoEAoCubo(n);
        
    }

    public static void resolverQuadradoEAoCubo(int n){

        // Sua solução aqui
        IO.imprimir("Digite um número entre 1 e 1000:");
        n = IO.lerValorInteiro();

        int contador = 1;
        while (contador <= n) {
            IO.imprimir(""+(contador)+" "+(contador*contador)+" "+(contador*contador*contador));
            contador++;
        }
    }

}
