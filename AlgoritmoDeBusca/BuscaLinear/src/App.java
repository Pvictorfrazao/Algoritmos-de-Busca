public class App {
    public static void main(String[] args) throws Exception {
        
        BuscaLinear busca = new BuscaLinear();

        int arr[] = {2, 3, 100, 200, 300, 1, 5};
        int x = 101;
        int resultado = busca.buscaLinear(arr, x);

      if(resultado == -1){
        System.out.println("nao foi encontrado o elemento no array");
      } else{
        System.out.println("elemento encontrado");
      }

    }
}
