import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("\n\n\n                       Seja bem-vindo ao XXXXXXXXX\n");
        Scanner scanner1 = new Scanner(System.in, "UTF-8");
        System.out.println("Selecione uma opção:\n1 ¬Novo Jogo-\n2 ¬Continuar Jogo-\n3 ¬Sair-\n");
        int opcao1 = scanner1.nextInt();
        scanner1.close();
        
        if (opcao1 == 1) {
            System.out.println("Aqui vamos explicar a historia desse jogo");
            
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
        
    }
}