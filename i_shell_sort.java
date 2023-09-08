import java.util.Random;

public class i_shell_sort {
    public static void main(String[] args) {

        // Classe Random cria um objeto Random para gerar números aleatórios.
        Random gerador = new Random();

        // Cria um array de inteiros com 10 elementos.
        int[] numeros = new int[10];

        // Imprime uma mensagem informando que números aleatórios serão gerados.
        System.out.println("\nNúmeros aleatórios: ");

        // Loop para preencher o array com números aleatórios entre 0 e 9.
            // Esplicação- 1
            // #(for) é o inicio do loop que repete 
            // o conjunto de codigo varias vezes 
            // enquanto uma condição é verdadeira.
            // #(int i = 1;) é um contador que controla 
            // quantas vezes o loop será executado
            // criando uma variável i iniciando
            // com o valor 1.
            // #(i < numeros.length;) equando a condição
            // que é o valor atual do i for menor que
            // o comprimento do array for verdadeira
            // o loop continuará a ser executado.
            // #(i++) o i aumentará em 1 a cada interação
            // do loop até o final do array.
        for (int i = 1; i < numeros.length; i++) {
            numeros[i] = gerador.nextInt(10); // Gera um número aleatório entre 0 e 9.
            System.out.println(numeros[i]); // Imprime o número gerado.
        }

        // Chamada para ordenar o array usando Shell Sort.
        shellSort(numeros);

        // Imprime uma mensagem informando que os números estão ordenados.
        System.out.println("\nNúmeros ordenados: ");

         // Loop para imprimir os números ordenados.
            // Esplicação- 2
            // Tem a mesma função da explicação 1 só
            // que de vez ela imprimir os número
            // aleatóriamente ela os imprimir de forma
            // ordenada do menor para o maior utilizando
            // a função shell sort.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }
    }

    // Implementação do algoritmo Shell Sort.
    // (int[] array) essa é a parte principal dessa linha, 
    // que quer dizer que shellSort só aceita um array de inteiros.
    public static void shellSort(int[] array) { 
        int n = array.length;

         // Loop para controlar o tamanho do intervalo (intervalo).
         // O "intervalo" é inicializado como metade do valor de "n" 
         // (n / 2) e, em cada iteração do loop, ele é dividido por 2 
         // (intervalo /= 2). Isso significa que o "intervalo" está 
         // diminuindo pela metade a cada iteração enquanto o intervalo
         // for maior que zero(intervalo > 0). 
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {

            // Loop para percorrer os elementos do array a partir do intervalo.
            // Loop foi explicado anteriormente mais a função principal desse
            // loop aqui é ordenar as sub-sequências definidas pelo intervalo,
            // percorrendo o array apartir do "intervalo" atual até o final do array "n".
            for (int i = intervalo; i < n; i++) {
                int temp = array[i]; // Armazena o elemento atual.
                int j;

                // Loop para realizar a inserção do elemento atual na posição correta.
                // Realiza uma operação de ordenação por inserção na sub-sequência. 
                // Durante esse processo, ele compara o elemento temp com os elementos 
                // anteriores no intervalo e, se necessário, desloca os elementos maiores 
                // para frente, criando espaço para inserir temp na posição correta.
                for (j = i; j >= intervalo && array[j - intervalo] > temp; j -= intervalo) {
                    array[j] = array[j - intervalo]; // Move os elementos maiores para a direita.
                }
                array[j] = temp; // Insere o elemento atual na posição correta.
            }
        }
    }
}