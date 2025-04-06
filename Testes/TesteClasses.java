import java.util.Scanner;

public class Jogador {
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
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeJogador = scanner1.nextLine();
        // Criando um objeto da classe Jogador
        Jogador jogador1 = new Jogador(nomeJogador);
        // Chamando um método do objeto
        jogador1.exibirStatus();
    }
}
