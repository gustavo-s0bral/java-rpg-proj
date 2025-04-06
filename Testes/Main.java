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
        System.out.println("Selecione uma opção:\n1 -Novo Jogo-\n2 -Continuar Jogo-\n3 -Sair-\n");
        int opcao1 = scanner1.nextInt();

        String menu = "___________________________\n||         MENU          ||\n|| INVENTÁRIO     MAPA   ||\n|| MISSÕES        VOLTAR ||\n---------------------------";
        String inventario = "___________________________\n||       INVENTÁRIO      ||\n|| espada-pedra   pocao  ||\n---------------------------";
        
        if (opcao1 == 1) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("-------------------------------------------\nATO 1\n-------------------------------------------\nVocê encontra um homem com um longo manto preto, o que impossibilita ver seu rosto, a unica coisa que pode ser vista é sua longa barba branca.\n\nHOMEM MISTERIOSO:\nVocê parece novo aqui, qual seu nome, jovem aventureiro?");
            String nomeJogador = scanner2.nextLine();

            System.out.println("\nHOMEM MISTERIOSO:\nSeja bem vindo às Ruinas sombrias " + nomeJogador + ", tome cuidado, esse lugar é mais traiçoeiro do que parece. Além disso, prazer, sou Jax (Jax retira o manto revelando um rosto muito jovial, apesar de sua barba branca, voce tambem nota uma cicatriz que atravessa desde a parte inferior esquerda de sua boca até seu nariz).");
            System.out.println("\n\nLogo após Jax revelar seu rosto, você ouve uma estranha voz choramingando à sua esquerda. Ao olhar para a asquerda você vê um goblin e em cima de um barril a sua frente está uma faca.");
            System.out.println("__________________________________\n||             FACA             ||\n||DANO: 5                       ||\n||DESCRICAO: Uma faca frágil     ||\n||e enferrujada prestes a    ||\n||partir.                         ||\n----------------------------------");
            System.out.println("Escolha uma opção:\n1-Pegar a faca e enfrentar o goblin.\n2-Fugir");
            String opcaoGoblin = scanner2.nextLine();
            
            if (opcaoGoblin.equalsIgnoreCase("1")) {
                System.out.println("\nAo olhar a criatura atentamente, você nota o cansaço em seus olhos e atrás do monstro, percebe uma criança chorando, paralisada de medo.\n\n__________________________\n||        GOBLIN        ||\n||HP: 10                ||\n||______________________||\n||     PLAYER STATUS    ||\n||HP: 100               ||\n||ARMOR: 0              ||\n--------------------------");
                
                int goblinLife = 10;
                Scanner scanner3 = new Scanner(System.in);
                
                while (goblinLife > 0) {
                    System.out.println("Digite a opção que deseja:\n1-Atacar\n2-fugir\n3- Conversar sobre seus sentimentos\n"); // "conversar sobre seus sentimentos" viadagem do k7 isso ai
                    String lutaGoblin = scanner3.nextLine(); 
                    Random random = new Random();
                        
                    if (lutaGoblin.equalsIgnoreCase("1")) {
                        int randomPlayer = random.nextInt(20) + 1;
                        if (randomPlayer > 5) {
                            int randomPlayerDamage = random.nextInt(6);

                            goblinLife -= randomPlayerDamage;
                            System.out.println("Voce atacou o goblin, causou " + randomPlayerDamage +"DMG\n");
                        }
                        
                        int randomGobin = random.nextInt(20) + 1;
                        
                        if (randomGobin > 10 && goblinLife > 0) {
                            int randomGoblinDamage = random.nextInt(4);

                            lifeJogador -= randomGoblinDamage;
                            System.out.println("O goblin te atacou, menos " + randomGoblinDamage + "HP:\nHP " + lifeJogador);
                        }
                        
                        else if (randomGobin < 10 && goblinLife > 0) {
                            System.out.println("\nVoce desviou do ataque do goblin\n");                            
                        } 
                        
                        System.out.println("\n__________________________\n||        GOBLIN        ||\n||HP: " + goblinLife + "                 ||\n||______________________||\n||     PLAYER STATUS    ||\n||HP: " + lifeJogador + "               ||\n||ARMOR: " + armaduraJogador +"              ||\n---------------------------");
                    
                    }
                }              
                System.out.println("Sua vida pós batalha: " + lifeJogador); 
                scanner3.close(); 
            }
            if (opcaoGoblin.equalsIgnoreCase("2")) {
                System.out.println("Voce vira as costas para o goblin e para a criança que chorava pasma, enquanto corre, tudo que pode ser ouvido é uma facada seguida de um grito agonizante e então silêncio. Você não diminui o passo até encontrar uma pequena cabana, aparentemente vazia");
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
