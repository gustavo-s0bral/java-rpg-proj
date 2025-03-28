import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("\n\n\n                       Seja bem-vindo ao XXXXXXSXXXXEXXXX\n");
        Scanner scanner1 = new Scanner(System.in, "UTF-8");
        System.out.println("Selecione uma opção:\n1 ¬Novo Jogo-\n2 ¬Continuar Jogo-\n3 ¬Sair-\n");
        int opcao1 = scanner1.nextInt();
        int lifeJogador = 100;
        int armaduraJogador = 0;
        String menu = "___________________________\n||         MENU          ||\n|| inventário     mapa   ||\n|| missões        voltar ||\n---------------------------";
        String inventario = "___________________________\n||       INVENTÁRIO      ||\n|| espada-pedra   poção  ||\n---------------------------";
        
        if (opcao1 == 1) {
            Scanner scanner2 = new Scanner(System.in, "UTF-8");
            System.out.println("-------------------------------------------\nATO 1\n-------------------------------------------\nVocê encontra um homem com um longo manto preto, o que impossibilita ver seu rosto, a unica coisa que você consegue ver é a sua longa barba branca.\n\nHOMEM MISTERIOSO:\nVocê parece novo aqui, qual seu nome jovem aventureiro?");
            String nomeJogador = scanner2.nextLine();

            System.out.println("\nHOMEM MISTERIOSO:\nSeja bem vindo as Ruinas sombrias " + nomeJogador + ", tome cuidado esse lugar é mais traiçoeiro que parece, cuidado para não encontrar uma encrenca em dobro. Além disso prazer, eu sou o Jax(Jax retira o manto revelando um rosto muito jovial, apesar de sua barba branca, você também nota uma cicatriz atravessa da parte inferior esquerda de sua boca até quase seu nariz).");
            System.out.println("\n\nEntão logo após ele revelar o rosto você ouve uma estranha voz gritando na sua esquerda. Ao olhar para asquerda você ve um goblin e em cima de um barril na sua frente você ve uma faca.");
            System.out.println("__________________________________\n||             FACA             ||\n||DANO: 5                       ||\n||DESCRIÇÃO: Uma faca fraca     ||\n||e enferrujada que da pouco    ||\n||dano.                         ||\n----------------------------------");
            System.out.println("Escolha uma opção:\n1-Pegar a faca e lutar o goblin.\n2-Correr e fugir do goblin");
            String opcaoGoblin = scanner2.nextLine();
            if (opcaoGoblin.equalsIgnoreCase("1")) {
                System.out.println("Você encontra goblin.\nAo olhar para ele você vê um olhar já cansado, e atrás dele você vê o que parece ser uma criança assustada e em choque.\n\n__________________________\n||.       GOBLIN        ||\n||HP: 10                ||\n||______________________||\n||");
            }
            scanner2.close();
        }
        else if (opcao1 == 2) {
            System.out.println("Aqui vamos adicionar os saves (Quando chegar aqui vamos ser proplayers de java)");
        }
        else if (opcao1 == 3) {
            System.out.println("Aqui vamos encerrar o jogo");
        }
        else{
            System.out.println("Você digitou uma opção inválida");
        }
        scanner1.close();
    }
}
