import java.util.Scanner;

public class Armas{
    String nomeArma;
    int danoArma, danoArmaEspecial;

    // cria constante para as armas 
    public static final Armas armaDeFogo = new Armas("Arma de fogo", 30, 80);
    public static final Armas faca = new Armas("Faca", 10, 15);

    // declara atributos das armas
    public Armas(String nomeArma, int danoArma, int danoArmaEspecial){
        this.nomeArma = nomeArma;
        this.danoArma = danoArma;
        this.danoArmaEspecial = danoArmaEspecial;
    }
}

public class Inimigos {
    String nomeInimigo;
    int vidaInimigo, danoInimigo, nivelInimigo, xpDropavel;

    // cria uma constante para os inimigos
    public static final Inimigos goblinLv1 = new Inimigos("Goblin", 2, 10, 1, 2);
    public static final Inimigos goblinLv2 = new Inimigos("Goblin", 5, 15, 2, 5);
    public static final Inimigos goblinLv3 = new Inimigos("Goblin", 7, 20, 3, 8);
    
    // declara os atributos do inimigo
    public Inimigos(String nomeInimigo, int danoInimigo, int vidaInimigo, int nivelInimigo, int xpDropavel){
        this.danoInimigo = danoInimigo;
        this.nivelInimigo = nivelInimigo;
        this.nomeInimigo = nomeInimigo;
        this.vidaInimigo = vidaInimigo;
        this.xpDropavel = xpDropavel;
    }   
}

public class Jogador{
    String nomeJogador;
    int nivelJogador = 1;
    int vidaJogador = 100;

    // declara nome do jogador na classe
    public Jogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    // metodo para exibir os status do player
    public void exibirStatus() {
        System.out.println("Nome: " + nomeJogador);
        System.out.println("Nível: " + nivelJogador);
        System.out.println("Vida: " + vidaJogador);
    }
}

public class TesteClasses {
    public static void main(String[] args) {
        Armas armaEscolhida;
        Inimigos inimigoAtacando;
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeJogador = scanner1.nextLine();        // Criando um objeto da classe Jogador
        Jogador jogador1 = new Jogador(nomeJogador);        // Chamando um método do objeto
        jogador1.exibirStatus();

        System.out.println("Escolha uma arma:\n1-Arma de fogo\n2-Faca");
        String escolhaArma = scanner1.nextLine();

        // printa as coisas do inimigo e do player
        if (escolhaArma.equals("1")) {
            inimigoAtacando = Inimigos.goblinLv1;
            armaEscolhida = Armas.armaDeFogo;

            System.out.println("Arma: " + armaEscolhida.nomeArma + "\nDano: " + armaEscolhida.danoArma + "\nDano Especial: " + armaEscolhida.danoArmaEspecial);
            System.out.println("\nInimigo: " + inimigoAtacando.nomeInimigo + "\nNivel do inimigo: " + inimigoAtacando.nivelInimigo + "\nVida: " + inimigoAtacando.vidaInimigo + "\nDano: " + inimigoAtacando.danoInimigo + "\nXp: " + inimigoAtacando.xpDropavel);
        }
        if (escolhaArma.equals("2")) {
            armaEscolhida = Armas.faca;
            inimigoAtacando = Inimigos.goblinLv2;
            System.out.println("\nInimigo: " + inimigoAtacando.nomeInimigo + "\nNivel do inimigo: " + inimigoAtacando.nivelInimigo + "\nVida: " + inimigoAtacando.vidaInimigo + "\nDano: " + inimigoAtacando.danoInimigo + "\nXp: " + inimigoAtacando.xpDropavel);
            System.out.println("Arma: " + armaEscolhida.nomeArma + "\nDano: " + armaEscolhida.danoArma + "\nDano Especial: " + armaEscolhida.danoArmaEspecial);
        }
        scanner1.close();
    }
}
