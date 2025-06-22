//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q2 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 02 - Senha Fixa");

        //Entrada

        //Processamento
        resolverSenhaFixa();
        // resolverSenhaFixa();
        
    }

    public static void resolverSenhaFixa(){

        // Sua solução aqui

        String senhaDigitada;
        String senhaValida = "2002";

        IO.imprimir("Digite a senha numérica:");
        senhaDigitada = IO.lerFrase();
    
        while(!senhaDigitada.equals(senhaValida)){
           IO.imprimir("Senha inválida!");
           senhaDigitada = IO.lerFrase();
           }

        IO.imprimir("Acesso permitido!");
        }
        
    }
