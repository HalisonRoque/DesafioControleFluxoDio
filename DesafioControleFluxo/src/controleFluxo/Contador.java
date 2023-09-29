package controleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        /**
         * tretando uma exceção onde O PARAMETRO UM NÃO PODE SER MAIOR QUE O PARAMETRO DOIS
         * finalizando e tratando com o "catch" para tratamento da mesma.
         */
        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);



        }catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            //mensagem de informação mostranto que o segundo parametro deve ser maior que o primeiro
        }

    }

    /**
     *
     * @param parametroUm
     * @param parametroDois
     * @throws ParametrosInvalidosException invocação de uma exceção formatada para tratamento do metodo "contar".
     */
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        /**
         * metodo contar. metodo recebe dois parametros onde a diferença entre eles resultara na quantidade de impreções geradas em um "for"
         * caso não cumpla com as obrigações uma exceção será lançada.
         *
         *
         * interação com os parametros recebidos via terminal onde se verifica se o parametro um é menor que o parametro dois
         * caso seja seja verdadeira a interação faremos um for para imprimir a quantidade de indices referente aos parametros recebido pelo terminal
         */

        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException(); //lançamento da exceção para ultilizar no metodo "contar".
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++){
            System.out.println("IMPRIMIR CONTAGEM " + i);
        }
    }
}
