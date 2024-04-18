package primeirasAulas;
/*
 * HelloWorld = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 */

 public class HelloWorld {

    // Todo conteudo devera ser inserido aqui dentro

    public static void main(String[] args) {
      // valores (int, double, float, long)
      // Text (String)
      // Booleanos (boolean)

      int dadoDoTipoInt = 10;
      double dadoDoTipoDouble = 3.14;
      float dadoDoTipoFloat = 3.14f;
      long dadoDoTipoLong = 10000000000000L;
      String dadoDoTipoString = "Colocar o texto";
      boolean dadoDoTipoBoolean = false;


      // if - else
      if(dadoDoTipoInt == 11) {
       
        // sysout
          System.out.println("Entrou no if");
      } else if (dadoDoTipoInt < 12) { 
          System.out.println("Entrou no if do 12");
      } else {
          System.out.println("Entrou no else");
      }

      // while (Enquanto algo for verdadeiro, faca alguma coisa)
      int valorInicial = 0;
      while(valorInicial < 3) {
        System.out.println("O valor inicial eh menor que 3");
        System.out.println(valorInicial);
        valorInicial++;  // valorInicial = 3
      }
      System.out.println("Saiu do while");

      // For
      System.out.println("Iniciando o For");
      for(int i = 0; i < 4; i++) {
        System.out.println("O valor do i e: " + i);
      }
      System.out.println("Finalizando o For");

    }

 }
 // Fora do escopo da classe

