public class bublle {

    public static void main(String[] args) {
        int vetor[]= {3,6,4,8,5,7}; //numeros em ordem crescente
        int aux;
        boolean controle;

        for(int i=0; i<vetor.length; ++i){

            // laço de repetição com ordenação de dois em dois

            // laço (vetor.length -1) pois como o  if(vetor[j]>vetor[j+1]) soma mais 1 ia da erro pois ele ficaria maior que nosso vetor
            for(int j=0; j<(vetor.length -1 ); ++j){
                // trocando os valores de lugar de forma que o vetor na posição j ou seja 0 some mais 1 e troque de lugar com o aux trazendo assim de forma crescente trocando o simbolo <
                if(vetor[j]>vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;

                }

            }
        }
        // printa os valores na tela
        for(int i=0;i <vetor.length; ++i){
            System.out.print(vetor[i] );

        }
    }
}
