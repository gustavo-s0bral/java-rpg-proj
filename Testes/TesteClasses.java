import java.util.Scanner;

public class Armas{
    String nomeArma;
    int danoArma, danoArmaEspecial;

    public static final Armas armaDeFogo = new Armas("Arma de fogo", 30, 80);
    public static final Armas faca = new Armas("Faca", 10, 15);
    public Armas(String nomeArma, int danoArma, int danoArmaEspecial){
        this.nomeArma = nomeArma;
        this.danoArma = danoArma;
        this.danoArmaEspecial = danoArmaEspecial;
    }
}
public class Jogador{
    String nome;
    int nivel = 1;
    int vida = 100;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
    }
}
public class TesteClasses {
    public static void main(String[] args) {
        Armas armaEscolhida;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeJogador = scanner1.nextLine();
        // Criando um objeto da classe Jogador
        Jogador jogador1 = new Jogador(nomeJogador);
        // Chamando um método do objeto
        jogador1.exibirStatus();

        armaEscolhida = Armas.armaDeFogo;

        System.out.println(armaEscolhida.nomeArma);
        System.out.println(armaEscolhida.danoArma);
        System.out.println(armaEscolhida.danoArmaEspecial);
    }
}
