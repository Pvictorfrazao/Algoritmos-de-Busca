public class App {
    public static void main(String[] args) throws Exception {

        BuscaBinaria buscaB = new BuscaBinaria();

        int arr[] = {2,3,4,5,6,7,8,9,10,11,12,13,100};
        int x = 100;

        int resultado = buscaB.buscaBinaria(arr, x);

        if(resultado == -1){

            System.out.println("elemento não encontrado no array");
        } else {

            System.out.println("elemento encontrado na posicao: "+ resultado);
        }




    }
}
