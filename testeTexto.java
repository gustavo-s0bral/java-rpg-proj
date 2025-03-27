import java.util.Scanner;

public class testeTexto {
    public static void main(String[] args) {
      String menu = "___________________________\n||         MENU          ||\n|| inventário     mapa   ||\n|| missões        voltar ||\n---------------------------";
      String inventario = "___________________________\n||       INVENTÁRIO      ||\n|| espada-pedra   poção  ||\n---------------------------";

      Scanner scanner1 = new Scanner(System.in, "UTF-8");
      System.out.println("Caso deseje abrir o menu digite 'pause', caso queira continuar o jogo digite 'continue': ");
      String pause = scanner1.nextLine();

      if (pause.equalsIgnoreCase("pause")) 
      {
        System.out.println(menu);
        Scanner scanner2 = new Scanner(System.in, "UTF-8");//não funcionou para fazer essa porra ler com acentuação
        System.out.println("Digite o nome da opcao que deseja: ");
        String opcao = scanner2.nextLine();

        if (opcao.equalsIgnoreCase("inventario"))//Depois tentar fazer ele ler mesmo com acentuação
        {
          System.out.println(inventario);
        }
        scanner2.close();
      }
      if (pause.equalsIgnoreCase("continue")) //Depois fazer ele voltar ao jogo
      {
        System.out.println("Problema seu, ainda não sei fazer isso.");
      }
      scanner1.close();
    }
  }