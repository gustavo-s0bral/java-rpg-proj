import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int armaduraJogador = 0;
        int XpPlayer = 0;
        int levelPlayer = 1;
        int pontosDeStatus = 0;
        int forcaStatus = 1;
        int energiaStatus = 1;
        int vidaStatus = 1;
        int criticoStatus = 1;
        int vidaStatusAdicional = 0;
        int lifeJogador = 100 + vidaStatusAdicional;
        
        System.out.println("\n\n\n                       Seja bem-vindo ao XXXXXXSXXXXEXXXX\n");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Selecione uma opcao:\n1 -Novo Jogo-\n2 -Continuar Jogo-\n3 -Sair-\n");
        int opcao1 = scanner1.nextInt();

        String menu = "___________________________\n||         MENU          ||\n|| inventario     mapa   ||\n|| missoes        voltar ||\n---------------------------";
        String inventario = "___________________________\n||       INVENTARIO      ||\n|| espada-pedra   pocao  ||\n---------------------------";
        
        if (opcao1 == 1) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("-------------------------------------------\nATO 1\n-------------------------------------------\nVoce encontra um homem com um longo manto preto, o que impossibilita ver seu rosto, a unica coisa que você consegue ver e a sua longa barba branca.\n\nHOMEM MISTERIOSO:\nVoce parece novo aqui, qual seu nome jovem aventureiro?");
            String nomeJogador = scanner2.nextLine();

            System.out.println("\nHOMEM MISTERIOSO:\nSeja bem vindo as Ruinas sombrias " + nomeJogador + ", tome cuidado esse lugar é mais traiçoeiro que parece, cuidado para não encontrar uma encrenca em dobro. Além disso prazer, eu sou o Jax(Jax retira o manto revelando um rosto muito jovial, apesar de sua barba branca, voce tambem nota uma cicatriz atravessa da parte inferior esquerda de sua boca até quase seu nariz).");
            System.out.println("\n\nEntao logo apos ele revelar o rosto você ouve uma estranha voz gritando na sua esquerda. Ao olhar para asquerda você ve um goblin e em cima de um barril na sua frente voce ve uma faca.");
            System.out.println("__________________________________\n||             FACA             ||\n||DANO: 5                       ||\n||DESCRICAO: Uma faca fraca     ||\n||e enferrujada que da pouco    ||\n||dano.                         ||\n----------------------------------");
            System.out.println("Escolha uma opcao:\n1-Pegar a faca e lutar o goblin.\n2-Correr e fugir do goblin");
            String opcaoGoblin = scanner2.nextLine();
            
            if (opcaoGoblin.equalsIgnoreCase("1")) {
                System.out.println("Voce encontra goblin.\nAo olhar para ele voce ve um olhar ja cansado, e atras dele você vê o que parece ser uma criança assustada e em choque.\n\n__________________________\n||        GOBLIN        ||\n||HP: 10                ||\n||______________________||\n||     PLAYER STATUS    ||\n||HP: 100               ||\n||ARMOR: 0              ||\n--------------------------");
                
                int goblinLife = 10;
                Scanner scanner3 = new Scanner(System.in);
                
                while (goblinLife > 0) {
                    System.out.println("Digite a opcao que deseja:\n1-Atacar\n2-fugir\n3-Conversar sobre seus sentimentos\n");
                    String lutaGoblin = scanner3.nextLine();
                    Random random = new Random();
                        
                    if (lutaGoblin.equalsIgnoreCase("1")) {
                        int randomPlayer = random.nextInt(20) + 1;
                        if (randomPlayer > 5) {
                            goblinLife -= 5;
                            System.out.println("Voce atacou o goblin, causou 5 DMG\n");
        
                        }
                        
                        int randomGobin = random.nextInt(20) + 1;
                        
                        if (randomGobin > 10 && goblinLife > 0) {
                            lifeJogador -= 2;
                            System.out.println("O goblin te atacou, menos 2HP:\nHP " + lifeJogador);
                        }
                        
                        else if (randomGobin < 10 && goblinLife > 0) {
                            System.out.println("\nVoce desviou do ataque do goblin\n");                            
                        } 
                        
                        System.out.println("\n__________________________\n||        GOBLIN        ||\n||HP: " + goblinLife + "                 ||\n||______________________||\n||     PLAYER STATUS    ||\n||HP: " + lifeJogador + "               ||\n||ARMOR: " + armaduraJogador +"              ||\n---------------------------");
                    
                    }
                }              
                System.out.println("sua vida pos batalha: " + lifeJogador); 
                scanner3.close(); 
            }
            if (opcaoGoblin.equalsIgnoreCase("2")) {
                System.out.println("Voce vira as costas para o Goblin e para a criança que chorava ali, ao correr você ouve o barulho de uma facada e o grito desesperado da crianca vai perdendo sua forca, mas mesmo assim voce nao para de correr ate chegar no em uma pequena cabana aparentemente vazia");
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
