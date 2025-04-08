import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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

    public String getNome() {
        return nomeArma;
    }
    
    @Override //sobrescreve os atributos padrao

    //Transforma os itens em String
    public String toString() {
        return nomeArma + " (Dano: " + danoArma + ", Dano Especial: " + danoArmaEspecial + ")";
    }
}

public class Inventario {
    private List<Armas> armas;
    private int capacidadeMaxima;

    //Adiciona itens e a capacidade maxima da lista
    public Inventario(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.armas = new ArrayList<>();
    }

    //sistema que adiciona armas ao inventario se nao estiver com o inventario cheio
    public boolean adicionarArma(Armas arma) {
        if (armas.size() + 2 <= capacidadeMaxima) { // Armas ocupam 2 slots
            armas.add(arma);
            System.out.println(arma.getNome() + " adicionada ao inventário!");
            return true;
        } else {
            System.out.println("Inventário cheio! Não foi possível adicionar " + arma.getNome());
            return false;
        }
    }

    //Remove itens do inventário
    public boolean removerArma(String nomeArma) {
        for (Armas arma : armas) {
            if (arma.getNome().equalsIgnoreCase(nomeArma)) {
                armas.remove(arma);
                System.out.println(arma.getNome() + " removida do inventário!");
                return true;
            }
        }
        System.out.println("Arma não encontrada no inventário.");
        return false;
    }

    //lista as armas e coisas do inventário
    public void listarInventario() {
        if (armas.isEmpty()) {
            System.out.println("O inventário está vazio.");
        } else {
            System.out.println("Armas no inventário:");
            for (Armas arma : armas) {
                System.out.println("- " + arma);
            }
        }
    }
}