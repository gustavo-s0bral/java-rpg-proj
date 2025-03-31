import java.util.Scanner;

public class Xp {
    public static void main(String[] args) {
        int XpPlayer = 0;
        int pontosDeStatus = 0;
        int levelPlayer = 1;
        int forcaStatus = 1;
        int energiaStatus = 1;
        int vidaStatus = 1;
        int criticoStatus = 1;
        int vidaStatusAdicional = 0;
        int forcaStatusAdicao = 0;
        int lifeJogador = 100 + vidaStatusAdicional;

        if (XpPlayer == 25) {
            levelPlayer += 1;
            pontosDeStatus += 1;
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Escolha a opcao que voce deseja evoluir:\n1 - forca\n2 - chance de acerto\n3 - vida\n4 - critico\n");
            int escolhaStatus = scanner1.nextInt();
            if (escolhaStatus == 1) {
                System.out.println("Voce upou sua força, voce ganhou uma adicao de 5 DMG");
                
            }
            scanner1.close();
        }
        System.out.println(levelPlayer);
        System.out.println(pontosDeStatus);
    }
}
